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
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Directory curDir = new Directory();
        String directory = Directory.getAllFiles();
        final File folder = new File(directory);
        FileName fn = new FileName(folder);
        ArrayList<String> fileName = FileName.getFileName();
        CountFile file = new CountFile(fileName);
        int noFile = CountFile.getFilesCount();
        CountIssues issue = new CountIssues(directory, fileName);
        int noIssue = CountIssues.getIssueCount();

        System.out.println("Number of Java Files = " + noFile);
        System.out.println("Number of Issues = " + noIssue);
    }

}
