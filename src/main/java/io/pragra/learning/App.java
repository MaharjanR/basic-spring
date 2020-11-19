package io.pragra.learning;

import io.pragra.learning.conig.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

//    Without annotation SpringBootApplication
//    public static void main(String[] args) {
//
//    Using XML
////        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//    Using JavaConfig
//        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.conig") ;
//
//        Person person = context.getBean("person", Person.class);
//        Person person2 = context.getBean( "person2" , Person.class);
//
//        OfficeAddress office = context.getBean(OfficeAddress.class);
//
//        office.setOfficeName("Pragra");
//
//        System.out.println(person2.getiAddress());
//        System.out.println(person.getiAddress());
//        System.out.println(office);
//    }

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean("person", Person.class));  
        System.out.println(context.getBean(OfficeAddress.class));
    }

}
