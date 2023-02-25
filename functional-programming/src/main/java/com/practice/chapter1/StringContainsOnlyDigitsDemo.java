package com.practice.chapter1;

public class StringContainsOnlyDigitsDemo {
    public static void main(String[] args) {
        String value1 = "T245 in between".replace(" ","");
        String value2 = "This".replace(" ","");

        System.out.println(value1+"  :"+hasDigit(value1));
        System.out.println(value2+"  :"+hasDigit(value2));
    }

    private static Boolean hasDigit(String value) {
        for(int i=0;i<value.length();i++){
            if(Character.isDigit(value.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
