package com.company.test;

import com.company.main.parser.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("write (ten): ");
        int n = scanner.nextInt();
        int bytes = Integer.parseInt(Integer.toString(n, 2));
        System.out.println(bytes);

        String str = String.valueOf(bytes);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        int ten = toTen(arr);
        System.out.println(ten);

    }

    static int toTen(int[] arr){
        int result = 0;
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            result = arr[i]^j + result;
            j--;
        }
        return result;
    }
}
