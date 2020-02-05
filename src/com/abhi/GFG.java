package com.abhi;
import java.io.IOException;

public class GFG {

    private FileInput fileInput;

    public void setFileObject(FileInput file){
        this.fileInput = file;
    }

    public boolean isPalindrome() throws IOException {

        String str = fileInput.readFile("input.txt");;
//        System.out.println(str);
        int i = 0, j = str.length() - 1;
        boolean chk = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                chk = false;
                break;
            }
            i++;
            j--;
        }
        if(chk) return true;
        else return false;
    }
}
