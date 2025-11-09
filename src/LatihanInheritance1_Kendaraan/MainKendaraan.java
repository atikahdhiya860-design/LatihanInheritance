package latihaninheritance1_kendaraan;

// Nama : Atikah Dhiya
// NIM  : L0324007

public class MainKendaraan {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle(),
            new Car()
        };

        for (Vehicle v : vehicles) {
            v.start();  // Polymorphism: panggil start() sesuai objek aslinya
        }
    }
}
