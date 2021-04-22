package com.genusIIc.vt.level1;

public class Main {
    public static void main(String[] args) throws Exception {
        if ((args.length < 2) || (args.length > 2)){
            System.err.println("You didn't enter the parameters completely. Check them out.");
        } else {
            ComparisonDoc cd = new ComparisonDoc();
            cd.compare(args[0], args[1]);
        }
    }
}