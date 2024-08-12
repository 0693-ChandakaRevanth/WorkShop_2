package org.example;
import java.io.*;
public class Exception_Handling_Char_Streams {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        try(FileReader reader=new FileReader("WORK_SHOP/src/main/java/org/example/char_streams.txt");){

            int n;
            while((n=reader.read())!=-1){
                str.append((char)n);
            }
            System.out.println(str);
            System.out.println("File Read Successfully.");
        }
        catch (FileNotFoundException e){
            System.err.println("FileNOTFoundException Occurs in InputFile");
        }
        catch (IOException e) {
            System.err.println("IOException Occurs in InputFile");
        }
        try(FileWriter writer=new FileWriter("WORK_SHOP/src/main/java/org/example/char_output.txt")){
            writer.write(str.toString());
            System.out.println("File Written Successfully.");
        }
        catch (FileNotFoundException e){
            System.err.println("FileNOTFoundException Occurs in InputFile");
        }
        catch (IOException e) {
            System.err.println("IOException Occurs in OutputFile");
        }
    }
}