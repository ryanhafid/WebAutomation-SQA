package org.proa;

public class fungsi {
      // Metode tambah dengan dua parameter dan tipe data kembalian int
    public static int tambah(int a, int b) {
        return a + b;
    }
    // Metode kuadrat dengan satu parameter dan tipe data kembalian int
    public static int kuadrat(int x) {
        return x * x;
    }
    // Metode main sebagai metode utama program
    public static void main(String[] args) {
        int hasilTambah = tambah(5, 3); // Memanggil metode tambah
        int hasilKuadrat = kuadrat(4); // Memanggil metode kuadrat
        System.out.println("Hasil tambah: " + hasilTambah);
        System.out.println("Hasil kuadrat: " + hasilKuadrat);
    }
}
