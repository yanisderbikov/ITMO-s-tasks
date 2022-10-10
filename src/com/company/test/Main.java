package com.company.test;

import com.company.main.parser.Parser;
import com.company.trash.numbersystem.ToTen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Parser parser = new Parser();
        int[] elevenBits = parser.parseElevenBits();

        int ten = ToTen.byteToTenSystem(elevenBits);
        System.out.println(ten);


    }
}
