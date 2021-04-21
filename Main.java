package com.genusIIc.level1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path to the original file: ");
        String org = sc.nextLine();

        System.out.print("Enter the path to the modified file: ");
        String mdf = sc.nextLine();

        System.out.println();

        ComparisonDoc cd = new ComparisonDoc();
        cd.compare(org, mdf);
    }
}
