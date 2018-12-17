package by.epam.training.kimbar.view;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
