import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input array pertama
        System.out.print("Masukkan elemen array pertama (dipisahkan dengan spasi): ");
        String[] inputA = scanner.nextLine().split(" "); 
        int[] arrayA = new int[inputA.length];
        for (int i = 0; i < inputA.length; i++) {
            arrayA[i] = Integer.parseInt(inputA[i]);
        }

        // Menerima input array kedua
        System.out.print("Masukkan elemen array kedua (dipisahkan dengan spasi): ");
        String[] inputB = scanner.nextLine().split(" ");
        int[] arrayB = new int[inputB.length];
        for (int i = 0; i < inputB.length; i++) {
            arrayB[i] = Integer.parseInt(inputB[i]);
        }

        // Menyimpan hasil elemen yang sama dan tidak sama
        Map<Integer, Integer> freqA = new HashMap<>();
        Map<Integer, Integer> freqB = new HashMap<>();
        Set<Integer> sameElements = new HashSet<>();
        Set<Integer> allElements = new HashSet<>();

        // Mengisi frekuensi untuk arrayA
        for (int num : arrayA) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
            allElements.add(num);
        }

        // Mengisi frekuensi untuk arrayB
        for (int num : arrayB) {
            freqB.put(num, freqB.getOrDefault(num, 0) + 1);
            allElements.add(num);
        }
        
        // System.out.println("Freq A:");
        // for (Map.Entry<Integer, Integer> num: freqA.entrySet()) {
        //     System.out.println(num.getKey() + " = " + num.getValue());
        // }
        
        // System.out.println("Freq B:");
        // for (Map.Entry<Integer, Integer> num: freqB.entrySet()) {
        //     System.out.println(num.getKey() + " = " + num.getValue());
        // }

        // Mencari elemen yang sama
        System.out.println("Sebug mencari yang sama:");
        
        for (int num : freqA.keySet()) {
            // System.out.println(num + " - " +freqB.containsKey(num));
            if (freqB.containsKey(num)) {
                sameElements.add(num);
            }
            
        }

        // Menampilkan elemen yang sama
        System.out.println("Hasil Elemen yang sama:");
        for (int num : sameElements) {
            System.out.println(num + " = " + Math.max(freqA.get(num),freqB.get(num)));
        }

        // Menampilkan elemen yang tidak sama
        System.out.println("Elemen yang tidak sama:");
        for (int num : allElements) {
            if (!sameElements.contains(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
