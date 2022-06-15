package com.example.program1;


import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x.");

        int x = scan.nextInt();

        System.out.println("Enter y.");

        int y = scan.nextInt();

        System.out.println("Enter z.");

        int z = scan.nextInt();

        if(x<y && y<z)
        {
            System.out.println("Increasing");

        } else if (x>y && y>z) {
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither");
        }
        }


    }

