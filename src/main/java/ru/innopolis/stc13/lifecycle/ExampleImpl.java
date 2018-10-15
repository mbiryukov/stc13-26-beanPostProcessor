package ru.innopolis.stc13.lifecycle;

import javax.annotation.PostConstruct;

@Profiling
public class ExampleImpl implements Example {
    @RandomInt(min = 4, max = 10)
    private int repeat;
    private String text = "Some text";

    public ExampleImpl() {
        System.out.println("random from constructor = " + repeat);
    }

    @PostConstruct
    public void init() {
        System.out.println("random from postConstruct = " + repeat);
    }

    @Override
    public void doSome() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
    }
}
