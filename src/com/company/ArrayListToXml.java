package com.company;


import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToXml {

    public static void main(String[] args) throws IOException, TemplateException {


    }
    public static void createXml(List<Contact>  allContact)  throws IOException, TemplateException {

       /* File f = new File("/Users/irem/Desktop/template.ftlh");
        System.out.println(f);*/

        ClassLoader classLoader = ArrayListToXml.class.getClassLoader();
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_27);
        //cfg.setDirectoryForTemplateLoading(new File(classLoader.getResource("/Users/irem/Desktop/CsvToXml/out/production/CsvToXml/template.ftlh").getFile()));
        cfg.setDirectoryForTemplateLoading(new File("/Users/irem/Desktop/"));

        cfg.setDefaultEncoding("UTF-8");
                                                                                   ///Users/irem/Desktop/CsvToXml/out/production/CsvToXml/template.ftlh
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);

        Map root = new HashMap();
        root.put("contacts", allContact);


        Template temp = cfg.getTemplate("template.ftlh");

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/output.xml"), "UTF-8"));

       temp.process(root, out);
        out.flush();
        out.close();
        System.out.println("File Created");


    }
}
