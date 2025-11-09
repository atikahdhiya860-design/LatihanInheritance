package LatihanInheritance2_Bank;

// Nama : Atikah Dhiya
// NIM  : L0324007

public class Account {
    String accNo;
    double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account No: " + accNo + ", Balance: " + balance);
    }
}
