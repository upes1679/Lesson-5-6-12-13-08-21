package com.company;

public class Main {

    public static void main(String[] args) {
        //Ternary if
//        String color = "red";
//        if (color == "red") {
//            System.out.println("color is red");
//        } else {
//            System.out.println("Not known color");
//        }
        //?:
        //color=="red"?System.out.println("color is red"):System.out.println("Not known color");
//        String operation = "sum";
//        int firstInt = 10;
//        int secondInt = 5;
//        int result;
//        if (operation == "sum") {
//            result = firstInt + secondInt;
//        } else {
//            result = firstInt - secondInt;
//        }
//
//        int result2 = operation == "sum" ? firstInt + secondInt : firstInt - secondInt;
//        // write your code here
//
//        printHelloWorld();
//        printHelloWorld();
//
//        System.out.println(calcSum(10,5));
//        System.out.println(calcSum(10,5,3));
//        System.out.println(calcSum(10.0,5.0));
//        Car car=new Car();
//        car.setType("Mazda");
//        System.out.println(car.getType());
//        car.setWheels(3);
//        System.out.println(car.getWheels());

        // car.wheels=4;
       // System.out.println(car.wheels);

       // BankAccount account=new BankAccount("12345",1.0,"Mark",25,"Mark@gmail.com");
//        account.setAccountNumber("00001234");
//        account.setTotalBalance(100.0);
//        account.setAccountOwnerName("Mark");
//        account.setAccountOwnerAge(25);
        //account.withdrawal(105.0);
       // System.out.println(account.getTotalBalance());
       // BankAccount account2= new BankAccount();

        BankAccount account3=null;
       // account3.deposit(5);
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static int calcSum(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }

    public static double calcSum(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }

    public static int calcSum(int firstNumber, int secondNumber, int thirdNumber){
        return firstNumber+secondNumber+thirdNumber;
    }
}
