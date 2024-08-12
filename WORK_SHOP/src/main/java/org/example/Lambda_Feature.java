package org.example;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Lambda_Feature {
        public static void main(String[] args) {
            try(BufferedReader reader=new BufferedReader(new FileReader("WORK_SHOP/src/main/java/org/example/Input.txt"))) {
                String str;
                List<String> strings = new ArrayList<>();
                while((str=reader.readLine())!=null) {
                    strings.add(str);
                }
                String result = strings.stream()//.map(s->s)
                        .collect(Collectors.joining(","));
                System.out.println(result);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
}