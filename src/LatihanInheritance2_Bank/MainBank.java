package LatihanInheritance2_Bank;

// Nama : Atikah Dhiya
// NIM  : L0324007

public class MainBank {
    public static void main(String[] args) {
        // Membuat array Account yang berisi berbagai jenis akun
        Account[] accounts = new Account[4];
        accounts[0] = new SavingsAccount("SA001", 1000, 0.05);
        accounts[1] = new CheckingAccount("CA001", 500, 200);
        accounts[2] = new SavingsAccount("SA002", 2000, 0.03);
        accounts[3] = new CheckingAccount("CA002", 800, 150);

        // Iterasi semua akun
        for (Account acc : accounts) {
            // Jika SavingsAccount, tambahkan bunga
            if (acc instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) acc;
                sa.addInterest();
            }
            acc.displayInfo();
        }
    }
}
