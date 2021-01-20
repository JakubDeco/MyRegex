package sk.kosickaakademia.deco.covidform;

import java.util.regex.Pattern;

public class Regex {
    public boolean isOPValid(String str) {
        if (str==null) return false;
        str=str.toUpperCase().trim();
        return Pattern.matches("[A-Z]{2}\\d{6}",str);
    }

    public boolean isSPZValid(String str){
        if (str==null) return false;
        str=str.toUpperCase().trim();
        return Pattern.matches("[A-Z]{2}\\w{5}",str);
    }

    public boolean isPhoneNumbValid(String str){
        if (str==null) return false;
        str=str.trim();
        return Pattern.matches("(0|\\+421|00421)9\\d{8}",str);
    }
}
