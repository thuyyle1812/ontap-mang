import java.util.Scanner;

public class Giatritrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrays = new int[10];

        for (int i = 1; i < arrays.length; i++) {
            System.out.println(" nhap so: ");
            arrays[i] = scanner.nextInt();
        }
        int max = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        System.out.println("So lon nhat " + max);


    }
}