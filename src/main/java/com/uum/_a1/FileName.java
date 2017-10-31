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

public class FileName {

    public static ArrayList<String> fileName = new ArrayList();
    public static File folder;

    public void FileName(final File folder) {
        FileName.folder = folder;
    }

    public static void setFileName(File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                setFileName(fileEntry);
            } else {
                fileName.add((fileEntry.getName()));
            }
        }
    }

    public static ArrayList<String> getFileName() {
        return fileName;
    }

}
