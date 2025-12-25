package org.omprakash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/string.xml");

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);
    }
}
