package main;
import java.util.Scanner;
import java.text.NumberFormat;
public class project {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        subtractAndAdd(number);
    }

    public static void subtractAndAdd(int number) {
        System.out.println(number);

        if (number <= 0) {
            number += 5;
            System.out.println(number);
            return;
        }

        subtractAndAdd(number - 5);
    }
}

