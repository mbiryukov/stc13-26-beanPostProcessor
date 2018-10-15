package ru.innopolis.stc13.lifecycle;

public class ExampleImpl implements Example {
    @RandomInt(min = 4, max = 10)
    private int repeat;

    private String text = "Some text";

    @Override
    public void doSome() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
        System.out.println("random = " + repeat);
    }
}
