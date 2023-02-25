package com.practice.chapter1;

public class FirstNonRepeatedChars {
    public static void main(String[] args) {
        if(firstNonRepeatedCharcter("AbrakaDabra") != null){
            System.out.println(firstNonRepeatedCharcter("AbrakaDabra"));
        }
    }
    public static Character firstNonRepeatedCharcter(String value){
        for(char c:value.toCharArray()){
            if(value.indexOf(c)==value.lastIndexOf(c)){
                return c;
            }
        }
        return null;
    }
}
