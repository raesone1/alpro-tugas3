public class Jawaban {
  public static void main(String[] args) {
      int n = 5; // jumlah baris
      
      // Output 1: Segitiga Bintang
      System.out.println("Output 1:");
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.println(); // berpindah ke baris berikutnya
      }

      System.out.println(); // memberi jarak sebelum output berikutnya

      // Output 2: Segitiga Angka
      System.out.println("Output 2:");
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(j + " ");
          }
          System.out.println(); // berpindah ke baris berikutnya
      }
  }
}
