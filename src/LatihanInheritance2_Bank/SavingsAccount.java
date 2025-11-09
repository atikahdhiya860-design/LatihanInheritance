package LatihanInheritance2_Bank;

// Nama : Atikah Dhiya
// NIM  : L0324007

public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }
}
