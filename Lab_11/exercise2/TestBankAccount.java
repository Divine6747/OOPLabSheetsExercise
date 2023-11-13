package Lab_11.exercise2;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String bankOutput;

        BankAccount b1 = new BankAccount();
        bankOutput = "Calling the no-argument BankAccount constructor. The first BankAccount object details are: " + b1.toString();


        BankAccount b2 = new BankAccount("Riche Rich",2342343,0.75);
        bankOutput+="\n\nCalling the multi-argument BankAccount constructor. The second BankAccount object details are: " + b2.toString();


        BankAccount b3 = new BankAccount();
        BankAccount.setInterestRate(0.5);
        bankOutput+="\n\nNow calling the setInterest() method to change the interest rate to " + BankAccount.getInterestRate()+"\n\n" +"The first BankAccount object details are: " + b3.toString();

        bankOutput+="\n\nThe second BankAccount object details are: " + b2.toString();

        JOptionPane.showMessageDialog(null,bankOutput,"BankAccount" ,JOptionPane.INFORMATION_MESSAGE);
    }
}
