import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input string
        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();

        // Memeriksa apakah string adalah palindrom
        boolean isPalindrome = isPalindrome(input);

        // Menampilkan hasil
        if (isPalindrome) {
            System.out.println("String tersebut adalah palindrom.");
        } else {
            System.out.println("String tersebut bukan palindrom.");
        }

        scanner.close();
    }

    // Fungsi untuk memeriksa apakah string adalah palindrom
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1; // panjang karakter dikurangi 1 karena left nya dimulai dari 0
        while (left < right) {
            // Periksa apakah char paling ujung kiri sama dengan char paling ujung kanan?
            if (str.charAt(left) != str.charAt(right)) {
                // jika ada satu kondisi saja yang tidak sesuai maka dipastikan bukan palindrom
                return false;
            }
            // agar index bergerak dari sisi kiri dan kanan lalu akan berakhir di tengah
            left++;
            right--;
        }

        return true;
    }
}
