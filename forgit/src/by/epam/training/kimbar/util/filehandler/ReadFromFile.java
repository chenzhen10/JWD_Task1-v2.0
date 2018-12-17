package by.epam.training.kimbar.util.filehandler;

import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {


    BufferedReader bufferedReader;

    public ArrayList readFromFile(File file) throws IOException {
        ArrayList arr = new ArrayList();
        bufferedReader = new BufferedReader(new FileReader(file));
        String str = bufferedReader.readLine();
        while (str != null) {
            arr.add(str);
            str = bufferedReader.readLine();
        }
        close();
        return arr;
    }

    private  void close() throws IOException {
        bufferedReader.close();
    }

}
