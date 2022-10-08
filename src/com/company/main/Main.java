package com.company.main;

import com.company.main.hamming.Hamming;
import com.company.main.parser.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        int[] code = parser.getElevenBits();
        Parser.printArr(code, "Your input code: ");
        int[] newCode = Hamming.cipher(code);
        Parser.printArr(newCode, "ciphered code: ");

        System.out.println("write which to change (1-15) : ");
        int element = scanner.nextInt();
        if (newCode[element-1] == 0){
            newCode[element-1] = 1;
        } else {
            newCode[element-1] = 0;
        }

        Parser.printArr(newCode, "code with error:");

        int[] recoveredCode = Hamming.removeErrors(newCode);
        Parser.printArr(recoveredCode, "recovered code: ");

        int[] decipheredCode = Hamming.decipher(recoveredCode);
        Parser.printArr(decipheredCode, "deciphered code is: ");



    }



}