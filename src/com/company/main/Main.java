package com.company.main;

import com.company.main.hamming.Hamming11;
import com.company.main.parser.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Parser parser = new Parser();
        parser.tenToBinary();


        Scanner scanner = new Scanner(System.in);
        int[] code = new int[11];
        for (int i = 0; i < 11; i++) {
            System.out.print("write " + (i+1) + ": ");
            code[i] = scanner.nextInt();
        }
        Parser.printArr(code);

        int[] newCode = Hamming11.shifr(code);
        System.out.println("shifered code: ");
        Parser.printArr(newCode);

        System.out.println("write which to change (1-15) : ");
        int element = scanner.nextInt();
        if (newCode[element-1] == 0){
            newCode[element-1] = 1;
        } else {
            newCode[element-1] = 0;
        }

        System.out.println("code with error:");
        Parser.printArr(newCode);

        int[] recoveredCode = Hamming11.removeErrors(newCode);
        System.out.println("recovered code: ");
        Parser.printArr(recoveredCode);

    }



}