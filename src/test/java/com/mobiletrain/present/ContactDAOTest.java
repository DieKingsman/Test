package com.mobiletrain.present;

import com.mobiletrain.config.SpringConfig;
import com.mobiletrain.dao.ContactDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactDAOTest {
    @Test
    public void testDAO() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ContactDAO contactDAO = context.getBean("contactDAO", ContactDAO.class);

        context.close();
    }
}
