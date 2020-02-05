package com.abhi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

    private BufferedReader br;

    public String readFile(String file){
        try{
            br = new BufferedReader(new FileReader(file));
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
