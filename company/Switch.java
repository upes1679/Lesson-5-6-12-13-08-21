package com.company;

enum Color{
    Red,
    Blue,
    Green
}

public class Switch {
    public static void main(String[] args){
        String color= "red";
        Color myColor=Color.Red;
        switch (myColor){
            case Red:
                System.out.println("red color!");
                break;
            case Blue:
                System.out.println("blue color!");
                break;
            case Green:
                System.out.println("green color!");
                break;
            default:
                System.out.println("Not known color");
                break;
        }
    }
}
