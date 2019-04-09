package ru.avalon.java.dev.j10.labs;

public class RandomString {
    private final char[] alphabet = {'0','1','2','3','4','5','6','7','8','9','0','a',
        'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
        't','x','y','z'};
    private String string;
    private int sLength;

    public RandomString(){
        genLength();
        genString();
    }
    
    private void genLength(){
        int min = 1, max = 10;
        sLength = min + (int)(Math.random()*max);
    }
    
    private void genString(){
        char[] charString = new char[sLength];
        for (int i = 0; i < sLength; i++){
            charString[i] = alphabet[0 + (int) (Math.random()*
                    (alphabet.length))];
        }
        string = String.valueOf(charString);
    }
    
    public String getString(){
        return string;
    }
}
