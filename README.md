Tugas Inheritance

Deskripsi
Tugas ini berisi latihan penerapan konsep Inheritance (pewarisan) dalam pemrograman berorientasi objek (OOP) menggunakan bahasa Java.
Tujuan utamanya adalah memahami bagaimana sebuah class dapat mewarisi atribut dan method dari class lain, serta bagaimana konsep overriding, polymorphism, casting, dan abstract class diterapkan di dalam program.

Konsep Utama
Inheritance memungkinkan sebuah class (subclass) untuk mewarisi properti dan perilaku dari class lain (superclass).
Dengan konsep ini, pengembang dapat membuat kode yang lebih efisien, mudah dikembangkan, dan menghindari duplikasi fungsi.
Selain itu, konsep ini juga erat kaitannya dengan polymorphism (kemampuan objek berbeda untuk merespons method yang sama dengan cara berbeda) dan penggunaan abstract class sebagai template dasar bagi class turunan.

Struktur Program
Program ini terdiri dari tiga latihan utama yang berfokus pada penerapan inheritance dalam berbagai konteks.

Latihan 1 – Kendaraan
Membuat class Vehicle sebagai superclass yang memiliki atribut dan method dasar.
Membuat class Car dan Motorcycle yang merupakan subclass dari Vehicle.
Kedua subclass melakukan overriding terhadap method start() untuk menampilkan perilaku yang berbeda.
Program utama membuat array Vehicle[] yang berisi objek Car dan Motorcycle, kemudian memanggil method start() pada setiap elemen.

Hasil Output:
Car starts with a key
Motorcycle starts with a button
Car starts with a key

Latihan 2 – Bank
Membuat class Account sebagai superclass dengan atribut accNo dan balance.
Membuat subclass SavingsAccount dengan tambahan atribut interestRate dan method addInterest().
Membuat subclass CheckingAccount dengan atribut overdraftLimit.
Program utama membuat array Account[] berisi objek dari kedua subclass, kemudian melakukan iterasi untuk menambahkan bunga ke akun tabungan menggunakan instanceof dan casting.

Hasil Output:
Account No: SA001, Balance: 1050.0
Account No: CA001, Balance: 500.0
Account No: SA002, Balance: 2060.0
Account No: CA002, Balance: 800.0

Latihan 3 – Shape (Abstract Class)
Membuat abstract class Shape dengan method abstract area().
Membuat subclass Triangle, Rectangle, dan Circle yang masing-masing mengimplementasikan perhitungan luas sesuai bentuknya.
Program utama menghitung total luas seluruh bentuk dengan cara mengiterasi daftar objek turunan Shape.

Hasil Output:
Area = 12.0
Area = 12.566370614359172
Area = 7.5
Total area dari semua shape = 32.06637061435917

Tujuan dan Manfaat

1. Memahami dasar konsep inheritance dalam OOP.
2. Menerapkan method overriding dan penggunaan polymorphism.
. Melatih penggunaan instanceof dan casting untuk mengelola tipe data objek.
4. Memahami penggunaan abstract class sebagai template dasar.
5. Menunjukkan bagaimana konsep pewarisan dapat digunakan untuk menyusun program yang rapi dan efisien.

Cara Menjalankan
1. Buka project di NetBeans.
2. Jalankan masing-masing file main sesuai latihan:
. MainKendaraan.java untuk Latihan 1
- MainBank.java untuk Latihan 2
ShapeDemo.java untuk Latihan 3

Lihat hasil output di jendela Run.
