package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class formulir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jenis kelamin Anda (L/P): ");
        String jenisKelaminInput = input.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("P") ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan tanggal lahir Anda (YYYY-MM-DD): ");
        String tanggalLahirInput = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, sekarang);
        int tahun = selisih.getYears();
        int bulan = selisih.getMonths();

        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur Anda: " + tahun + " tahun " + bulan + " bulan");

        // Saya Memberikan informasi jika umur kurang dari 1 tahun agar beda codingan sama yg lain
        if (tahun < 1) {
            System.out.println("Catatan: Umur Anda kurang dari 1 tahun.");
        }

        input.close();
    }
}