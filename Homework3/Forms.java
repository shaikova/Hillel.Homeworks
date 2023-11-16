package Homework3;

import java.util.Scanner;

public class Forms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        String answer;

        do {
            System.out.println("Оберіть фігуру (1 - прямокутник, 2 - прямокутний трикутник, 3 - зворотній прямокутний трикутник, 4 - трикутник):");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Введіть висоту:");
                    int height = scanner.nextInt();
                    System.out.println("Введіть ширину:");
                    int width = scanner.nextInt();
                    drawRectangle(height, width);
                    break;
                case "2":
                    System.out.println("Введіть висоту:");
                    int triangleHeight = scanner.nextInt();
                    drawRightTriangle(triangleHeight);
                    break;
                case "3":
                    System.out.println("Введіть висоту:");
                    int invertedTriangleHeight = scanner.nextInt();
                    drawInvertedRightTriangle(invertedTriangleHeight);
                    break;
                case "4":
                    System.out.println("Введіть висоту:");
                    int pyramidHeight = scanner.nextInt();
                    drawTriangle(pyramidHeight);
                    break;
                default:
                    System.out.println("Невідома фігура. Спробуйте ще раз.");
                    break;
            }

            System.out.println("Бажаєте намалювати ще одну фігуру? (так/ні)");
            scanner.nextLine(); // Очистити буфер введення
            answer = scanner.nextLine();
        } while ("так".equals(answer));

        System.out.println("Програма завершила свою роботу.");
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawInvertedRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0;j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
