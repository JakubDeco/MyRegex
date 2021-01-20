package sk.kosickaakademia.deco.covidform;

import java.util.regex.Pattern;

public class Regex {
    public boolean isPhoneNumbValid(String str){
        if (str==null) return false;
        str=str.trim();
        return Pattern.matches("(0|\\+421|00421)9\\d{8}",str);
    }
}
