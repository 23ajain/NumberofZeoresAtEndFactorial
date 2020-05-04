package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number greater than 0 you want to check the number of zeroes at the end of the factorial of: ");
        int x = sc.nextInt();
        int b = 1;
        int g = 1;
        int sum = 0;
        while (x/g > 1){
            g = (int) Math.pow(5,b);
            b = b + 1;
            sum = sum + (x/g);
        }
        System.out.println("There are " + sum + " zeroes at the end of " + x + " factorial. Thank You for using this program. " +
                "Made by Aanika Jain.");
    }
}
