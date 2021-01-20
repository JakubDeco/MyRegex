package sk.kosickaakademia.deco.covidform;

import java.util.regex.Pattern;

public class Regex {
    public boolean isSPZValid(String str){
        if (str==null) return false;
        str=str.toUpperCase().trim();
        return Pattern.matches("[A-Z]{2}\\w{5}",str);
    }
}
