package com.abhi;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GFG gfg = new GFG();
        gfg.setFileObject(new FileInput());
        boolean result = gfg.isPalindrome();
        if(result) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
