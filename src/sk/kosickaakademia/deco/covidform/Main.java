package sk.kosickaakademia.deco.covidform;

import sk.kosickaakademia.deco.pricetag.Tag;

public class Main {
    public static void main(String[] args) {
        Tag tag1=new Tag();
        tag1.checkFileValuesBR("resource/money.txt");
        System.out.println("=================================================");
        tag1.checkFileValuesStream("resource/money.txt");
    }
}
