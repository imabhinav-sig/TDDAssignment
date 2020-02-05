package com.abhi.palintools;

import com.abhi.FileInput;
import com.abhi.GFG;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

// Mocking file object and testing

public class PalindromeTest {

    FileInput file;
    GFG gfg;

    @Before
    public void setup(){
//        System.out.println("Setup Running");
        file = mock(FileInput.class);
        gfg = new GFG();
        gfg.setFileObject(file);
    }

    @Test
    public void verifyFileInputCalled() throws IOException {
        when(file.readFile(anyString())).thenReturn("abcddcba");
        boolean result = gfg.isPalindrome();
//        assertTrue(result);
        verify(file).readFile(anyString());
    }

    @Test
    public void fileInputValidPalindrome() throws IOException {
        when(file.readFile(anyString())).thenReturn("abcddcba");
        boolean result = gfg.isPalindrome();
        assertTrue(result);
//        verify(file).readFile("input.txt");
    }

    @Test
    public void fileInputInValidPalindrome() throws IOException {
        when(file.readFile(anyString())).thenReturn("qwerty");
        boolean result = gfg.isPalindrome();
//        verify(file).readFile(anyString());
        assertFalse(result);
    }


}
