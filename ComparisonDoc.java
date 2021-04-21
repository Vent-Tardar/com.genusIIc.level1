package com.genusIIc.level1;

import java.io.*;
import java.util.ArrayList;

public class ComparisonDoc {

    private void checkingFiles(String org, String mdf) throws IOException {
        File f1 = new File(org);
        if(!(f1.isFile() && !f1.isDirectory())){
            throw new FileNotFoundException("Original file not found");
        }

        File f2 = new File(mdf);
        if(!(f2.isFile() && !f2.isDirectory())) {
            throw new FileNotFoundException("Modified file not found");
        }

        if(org.equals(mdf)) {
            throw new IOException("The same file was specified");
        }
    }

    public void compare(String org, String mdf) throws IOException{

        checkingFiles(org, mdf);

        try(BufferedReader br_1 = new BufferedReader(new FileReader(org));
            BufferedReader br_2 = new BufferedReader(new FileReader(mdf))){

            ArrayList<String> strings = new ArrayList<String>();
            ArrayList<String> string = new ArrayList<String>();

            while (((org = br_1.readLine()) != null) && ((mdf = br_2.readLine()) != null)) {
                strings.add(org);
                string.add(mdf);
            }

            int i = 1;

            for (int j = 0; j < strings.size(); j++){
                if (!strings.get(j).equals(string.get(j)))
                    System.out.printf("%d: <modified line value for line %d>\n", i, i);
                i++;
            }
        }
        catch (Exception e){
            System.out.println();
            System.err.println("Somewhere in the loop is an error: " + e.getMessage());
        }
    }
}
