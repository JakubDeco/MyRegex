package sk.kosickaakademia.deco.pricetag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Tag {
    public boolean isPriceTagValid(String str){
        if (str==null) return false;
        str=str.trim();
        return Pattern.matches("^(0|0(,|.)(\\d[1-9]|[1-9]\\d)|[1-9]\\d*((,|.)(\\d[1-9]|[1-9]\\d)?))$",str);
    }

    public void checkFileValuesBR(String filepath){
        try{
            FileReader fileReader=new FileReader(filepath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.print(line+" - ");
                if (isPriceTagValid(line))
                    System.out.println("ano");
                else System.out.println("nie");
            }
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void checkFileValuesStream(String filepath) {
        try{
            BufferedReader bufferedReader=Files.newBufferedReader(Paths.get(filepath));
            List<String> list=bufferedReader.lines().collect(Collectors.toList());
            for (String temp :
                    list) {
                System.out.print(temp+" - ");
                if (isPriceTagValid(temp))
                    System.out.println("ano");
                else System.out.println("nie");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
