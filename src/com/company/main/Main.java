package com.company.main;

import com.company.main.hamming.Hamming;
import com.company.main.parser.NumSystem;
import com.company.main.parser.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();

        int[] code = parser.parseFifteenBits();
        Parser.printArr(code, "Your input code: ");

        int[] recoveredCode = Hamming.recoverCode(code);
        Parser.printArr(recoveredCode, "recovered code: ");

        int[] decipheredCode = Hamming.decipher(recoveredCode);
        Parser.printArr(decipheredCode, "deciphered code is: ");

        System.out.printf("at 10 num system %s is: '%d'" ,
                Parser.printArr(decipheredCode),
                NumSystem.byteToTenSystem(decipheredCode));

    }

    static int[] makeAnError(int[] cipheredCode){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write which to change (1-15) : ");
        int element = scanner.nextInt();
        if (cipheredCode[element-1] == 0){
            cipheredCode[element-1] = 1;
        } else {
            cipheredCode[element-1] = 0;
        }
        return cipheredCode;
    }
}