
/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 238256
 * Name: Khalilah Binti Ahmad Fahmi
 */
package com.uum._a1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import org.junit.Test;

public class TestCountFile {

    private static ArrayList<String> fileName = new ArrayList();
    private int total = 0;

    public TestCountFile(ArrayList<String> fn) {
        fileName = fn;

    }
@Test
    public void getFilesCount(ArrayList<String> fileName) {
        String[] file = fileName.listFiles();
        for (int i = 0; i < fileName.length; i++) {
            if (fileName.get(i).contains(".java")) {
                total++;
            }
        }

    }
@Test
    public int getFilesCount() {
        return total++;
                
    }
}

