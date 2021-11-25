package com.syntax.reviewclass7;

public class House {
    public static void main(String[] args) {
        String str="Today is no day bro ne didin";
        StringBuilder as=new StringBuilder("hello");
        String [] words=str.split(" ");
        for(String word:words ){
            System.out.println(word+" ");
        }
        System.out.println( as.reverse());
        System.out.println(  as.replace(0,2,"a"));
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
