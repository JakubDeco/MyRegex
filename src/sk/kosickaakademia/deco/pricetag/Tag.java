package sk.kosickaakademia.deco.pricetag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Tag {
    public boolean isPriceTagValid(String str){
        if (str==null) return false;
        str=str.trim();
        return Pattern.matches("^(0|0(,|.)(\\d[1-9]|[1-9]\\d)|[1-9]\\d*((,|.)(\\d[1-9]|[1-9]\\d)?))$",str);
    }

    public void checkFileValues(String filepath){
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
}
