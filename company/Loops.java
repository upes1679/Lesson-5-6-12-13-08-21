package com.company;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        int num;
//        for(num=1; num<1000; num*=2){
//            System.out.println(num);
//        }
//        Scanner myScanner=new Scanner(System.in);
//        System.out.println("Please insert a number");
//        boolean isInt= myScanner.hasNextInt();
//        String strNum="";
//        if(isInt)
//            strNum=myScanner.nextLine();
//
//        //System.out.println(strNum);
//
//        int userInput=Integer.parseInt(strNum);
//        System.out.println(userInput);

//        int count = 6;
//        while(count<5){
//            System.out.println(count);
//            count++;
//        }

//        do {
//            //System.out.println(count);
//            count++;
//        } while (count < 5);

        int max=100;
        int count=0;
        while(count<max){
            count++;

            if(count%7==0)
                break;

            System.out.println(count);
        }
    }
}
