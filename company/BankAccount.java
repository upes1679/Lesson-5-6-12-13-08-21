package com.company;

public class BankAccount {
    private String accountNumber;
    private double totalBalance;
    private String accountOwnerName;
    private int accountOwnerAge;
    private String accountOwnerEmail;

    //alt + insert can allow us to generate all field quickly

   public BankAccount(){
       //this("98765",5.0,"Mark",25,"Mark@gmail.com");
       System.out.println("Empty ctor");
   }

    public BankAccount(double totalBalance){
        System.out.println("Ctor with 1 parameter");
        this.totalBalance=totalBalance;
    }

    public BankAccount(String accountNumber, double totalBalance, String accountOwnerName,
                       int accountOwnerAge, String accountOwnerEmail) {
       this();
        System.out.println("Parameterized ctor");
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.accountOwnerName = accountOwnerName;
        this.accountOwnerAge = accountOwnerAge;
        this.accountOwnerEmail = accountOwnerEmail;
    }

    public void deposit(double amount){
        totalBalance+=amount;
    }

    public void withdrawal(double amount){
        if(totalBalance-amount<0){
            System.out.println("Sorry can't withdrawal. Total balance: "+ totalBalance);
        }
        else{
            totalBalance-=amount;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public int getAccountOwnerAge() {
        return accountOwnerAge;
    }

    public void setAccountOwnerAge(int accountOwnerAge) {
        this.accountOwnerAge = accountOwnerAge;
    }

    public String getAccountOwnerEmail() {
        return accountOwnerEmail;
    }

    public void setAccountOwnerEmail(String accountOwnerEmail) {
        this.accountOwnerEmail = accountOwnerEmail;
    }
}
