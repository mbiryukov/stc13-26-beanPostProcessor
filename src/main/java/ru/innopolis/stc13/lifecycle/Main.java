package ru.innopolis.stc13.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");
        context.getBean(ExampleImpl.class).doSome();
    }
}
