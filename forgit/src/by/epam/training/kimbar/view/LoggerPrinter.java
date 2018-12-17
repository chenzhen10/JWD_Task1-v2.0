package by.epam.training.kimbar.view;

import org.apache.log4j.Logger;

public class LoggerPrinter implements Printer {
    private static final Logger log = Logger.getLogger(LoggerPrinter.class);
    @Override
    public void print(String s) {
        log.info(s);
    }
}
