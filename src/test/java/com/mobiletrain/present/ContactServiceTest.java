package com.mobiletrain.present;

import com.mobiletrain.domain.Contact;
import com.mobiletrain.service.ContactService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ContactServiceTest {
    @Test
    public void testService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ContactService contactService = context.getBean("contactServiceImpl", ContactService.class);

        List<Contact> contacts = contactService.queryAll(1, 10);

        System.out.println(contacts);

        context.close();
    }
}
