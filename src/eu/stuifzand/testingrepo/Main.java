package eu.stuifzand.testingrepo;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = DateFormat.getDateTimeInstance();
        System.out.printf("[%s] Hello, world!", df.format(date));
    }
}
