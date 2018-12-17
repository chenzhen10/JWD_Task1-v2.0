package by.epam.training.kimbar.util.filehandler;




import by.epam.training.kimbar.view.LoggerPrinter;
import by.epam.training.kimbar.view.Printer;


import java.util.ArrayList;
import java.util.Collections;


public class ValidateFromFile {
    Printer printer = new LoggerPrinter();

    public ArrayList<ArrayList> getValidateDataFromFile(String arr) {
        String[] mas = arr.replace("[", "")
                .trim()
                .split(",");
        ArrayList result = new ArrayList();
        for (String iterator : mas) {
                result.add(adder(iterator));
                result.removeAll(Collections.singleton(new ArrayList<>()));
        }
        return result;
    }

    private ArrayList adder(String tr) {
        ArrayList triangleComposer = new ArrayList();
        String[] arr = tr.split(" ");
        ArrayList numChecker = new ArrayList();
        double validate;
        for (String check : arr) {
            try {
                validate = Double.parseDouble(check);
                if(validate > 0) {
                    numChecker.add(validate);
                    if(numChecker.size() == 3){
                        triangleComposer.addAll(numChecker);
                    }
                }
            } catch (NumberFormatException e) {
                printer.print("Incorrect Number");
            }
        }
        return triangleComposer;
    }
}
