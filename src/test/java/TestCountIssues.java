/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 238256
 * Name: Khalilah Binti Ahmad Fahmi
 */
package com.uum._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;

public class TestCountIssues {

    private static int noIssue = 0;
    private static String directory;
    private static ArrayList<String> fileName = new ArrayList();
    

    public TestCountIssues(String dir, ArrayList<String> fn) {
        directory = dir;
        fileName = fn;
    }
@Test
    public void setIssueCount(String[] listFile) {
        for (String listFile1 : listFile) {
            try (final BufferedReader br = new BufferedReader(new FileReader(listFile1))) {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    if (readLine.contains("public static void main")) {
                        noIssue++;
                    }
                }
            } catch (IOException e) {

            }
        }
    }
@Test
    public static int getIssueCount() {

        return noIssue;

    }

}

