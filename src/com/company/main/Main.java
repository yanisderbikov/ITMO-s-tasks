package com.company.main;

import com.company.main.hamming.Hamming;
import com.company.main.parser.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();

        int[] code = parser.getElevenBits();
        Parser.printArr(code, "Your input code: ");
        int[] cipheredCode = Hamming.cipher(code);
        Parser.printArr(cipheredCode, "ciphered code: ");

        Parser.printArr(Hamming.decipher(cipheredCode), "deciphered code:");

        cipheredCode = makeAnError(cipheredCode);
        Parser.printArr(cipheredCode, "code with error:");

        int[] recoveredCode = Hamming.recoverCode(cipheredCode);
        Parser.printArr(recoveredCode, "recovered code: ");

        int[] decipheredCode = Hamming.decipher(recoveredCode);
        Parser.printArr(decipheredCode, "deciphered code is: ");



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