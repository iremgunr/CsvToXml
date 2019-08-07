?xml version="1.0" encoding="UTF-8" standalone="no"?>
<users>
    <#list contacts as contact>
    <user>
        <username>${contact.userName}</username>
        <firstname>${contact.firstName}</firstname>
        <lastname>${contact.lastName}</lastname>
        <email>${contact.email}</email>
        <roles>
            <#list contact.role as role>
                <role>${role}</role>
            </#list>
        </roles>
    </user>
    </#list>
</users>
