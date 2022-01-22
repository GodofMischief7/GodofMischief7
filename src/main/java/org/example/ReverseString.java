package org.example;


import java.util.Scanner;

public class ReverseString {
    String inputStr, reverseString ="";
    char characterAt;

    public String getInputStr() {
        System.out.println("Enter a string to reverse");
        Scanner input= new Scanner(System.in);
        inputStr= input.nextLine();
        return inputStr;
    }

    public String getRevString(String str) {
        int strLength = str.length();
        for(int i=strLength-1; i>=0; i--){
           this.reverseString += str.charAt(i);
        }
        return reverseString;
    }

    public void showRevStr(){
        System.out.print("Reversed string : " +this.reverseString);
    }

}
