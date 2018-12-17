package by.epam.training.kimbar.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    File file = new File("D:\\filelogger.txt");

    @Override
    public void print(String s)  {
        try(FileWriter fw = new FileWriter(file)) {
            fw.write(s);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
