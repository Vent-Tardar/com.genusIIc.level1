package com.genusIIc.level1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ComparisonDoc cd = new ComparisonDoc();
        cd.compare(args[0], args[1]);
    }
}
