package com.genusIIc.level1;

public class Main {
    public static void main(String[] args) throws Exception {
        switch (args.length){
            case 0: System.err.println("You didn't enter any parameters");
            break;
            case 1: System.err.println("You have entered one parameter, enter another parameter");
            break;
            case 3:
            case 4:
                System.err.printf("The program should have 2 parameters args[], you entered only %d\n", args.length);
                for(int i = 0; i < args.length; i++){
                    System.err.printf("Your parameter args[%d]: %s\n", i, args[i]);
                }
                break;
            default:
                ComparisonDoc cd = new ComparisonDoc();
                cd.compare(args[0], args[1]);
                break;
        }
    }
}