package sk.kosickaakademia.deco.covidform;

public class NoRegex {
    public boolean isSPZValid(String str){
        if (str==null) return false;
        str=str.toUpperCase().trim();
        if (str.length()!=7) return false;
        if (!Character.isLetter(str.charAt(0)) || !Character.isLetter(str.charAt(1))) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i)))
                return false;
        }

        return true;
    }
}