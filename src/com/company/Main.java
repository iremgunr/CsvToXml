package com.company;
import com.csvreader.CsvReader;
import freemarker.template.TemplateException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        try {
            Reader reader = Files.newBufferedReader(Paths.get(
                    ClassLoader.getSystemResource("input.csv").toURI()));
            CsvReader input = new CsvReader(reader);
            input.readHeaders();
            List<Contact> contacts = new ArrayList();
            List<String> usernames=new ArrayList<String>();

          // HashMap<String, Contact> csvtoxml = new HashMap<String, Contact>();


            while (input.readRecord()) {


                String username = input.get("username");
                String firstname = input.get("firstname");
                String lastname = input.get("lastname");
                String email = input.get("email");
                String role = input.get("role");
                List<String> roles = new ArrayList<String>();
                roles.add(role);


                /*Contact contact = new Contact(username, firstname, lastname, email, roller);
                contacts.add(contact);*/

               if(usernames.contains(username)){
                   Contact contact1=contacts.get(usernames.indexOf(username));
                   contact1.getRole().add(role);
               }
               else {
                   usernames.add(username);
                   Contact contact=new Contact(username,firstname,lastname,email,roles);
                   contacts.add(contact);
               }


               /*if (csvtoxml.containsKey("username")) {
                    (csvtoxml.get("username")).addRole(role);
                } else {
                    csvtoxml.put("username", contact);
                }*/

            }

            input.close();
            System.out.println(contacts);
            ArrayListToXml.createXml(contacts);
        }
        catch (FileNotFoundException | URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
