package generics;

import lambda.Printable;

public class Generics {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        Printer<String>  stringPrinter = new Printer<>("ok");
        Printer<Double> Doubleprinter = new Printer<>(33.5);
        printer.print();
        stringPrinter.print();
        Doubleprinter.print();
    }
}
