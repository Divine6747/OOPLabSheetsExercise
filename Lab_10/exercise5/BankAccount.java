package Lab_10.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;
    private int ID;


    public BankAccount(){
        this("Owner not Available",0,0);
    }

    public BankAccount(String owner, int number, double interestRate){
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
        incrementCount();
        setID(count);

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    private  static void incrementCount(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BankAccount.count = count;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\n\nOwner: " + getOwner() +
                "  Account Number: " + getNumber() +
                "  Interest Rate: " +getInterestRate() +
                "  \n\nThe Number of BankAccount objects created is: " + getID();
    }
}
