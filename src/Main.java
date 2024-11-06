import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year pls:");
        int year = scanner.nextInt();

        System.out.println(((year % 4 == 0) || (year % 100 != 0 && year % 400 == 0)) ? "Leap year" : "NOT a leap year");

        scanner.close();
    }
}
