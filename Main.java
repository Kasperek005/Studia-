import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wysokoś choinki: ");
        int h = scanner.nextInt();

        for (int w = 1; w <= h; w++) {

            for (int s = 1; s <= h - w; s++) {
                System.out.print(" ");
            }

            for (int g = 1; g <= 2 * w - 1; g++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}