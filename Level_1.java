package com.genusIIc.level1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Level_1 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path to the original file: ");
        String org = sc.nextLine();

        File f1 = new File(org);
        if(!(f1.isFile() && !f1.isDirectory())){
            throw new FileNotFoundException("File not found");
        }

        System.out.print("Enter the path to the modified file: ");
        String mdf = sc.nextLine();

        File f2 = new File(mdf);
        if(!(f2.isFile() && !f2.isDirectory())) {
            throw new FileNotFoundException("File not found");
        }

        if(org.equals(mdf)) {
            throw new IOException("The same file was specified");
        }

        System.out.println();

        try(FileReader fr_1 = new FileReader(f1); FileReader fr_2 = new FileReader(f2);
            BufferedReader br_1 = new BufferedReader(fr_1); BufferedReader br_2 = new BufferedReader(fr_2)){

            ArrayList<String> strings = new ArrayList<String>();
            ArrayList<String> string = new ArrayList<String>();

            while ((org = br_1.readLine()) != null) {
                strings.add(org);
            }

            while ((mdf = br_2.readLine()) != null) {
                string.add(mdf);
            }

            int i = 1;

            String []orgArray = new String[strings.size()];
            strings.toArray(orgArray);

            for(int j = 0; j < strings.size(); j++){
                orgArray[j] = strings.get(j);
            }

            /*for (String word: orgArray){
                System.out.println(word);
            }

            System.out.println("---------------");*/

            String []mdfArray = new String[string.size()];
            strings.toArray(mdfArray);

            for(int j = 0; j < string.size(); j++){
                mdfArray[j] = string.get(j);
            }

            /*for (String word: mdfArray){
                System.out.println(word);
            }

            System.out.println("---------------");*/

            for (int j = 0; j < orgArray.length; j++){
                 if (!orgArray[j].equals(mdfArray[j])) {
                     System.out.printf("%d: <modified line value for line %d>\n", i, i);
                 }
                 i++;
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println();
            System.out.println("Somewhere in the loop is an error: " + e.getMessage());
        }
    }
}
