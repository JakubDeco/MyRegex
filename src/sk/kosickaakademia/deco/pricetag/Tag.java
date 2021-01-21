package sk.kosickaakademia.deco.pricetag;

import java.util.regex.Pattern;

public class Tag {
    public boolean isPriceTagValid(String str){
        if (str==null) return false;
        str=str.trim();
        return Pattern.matches("^(0|0(,|.)(\\d[1-9]|[1-9]\\d)|[1-9]\\d*((,|.)(\\d[1-9]|[1-9]\\d)?))$",str);
    }
}
