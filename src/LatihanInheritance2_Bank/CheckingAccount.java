package LatihanInheritance2_Bank;

// Nama : Atikah Dhiya
// NIM  : L0324007

public class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }
}
