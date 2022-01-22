package org.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        ReverseString obj=new ReverseString();
        String inputString= obj.getInputStr();
        String reverseString=obj.getRevString(inputString);
        obj.showRevStr();

    }
}