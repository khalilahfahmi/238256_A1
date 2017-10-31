

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
import org.junit.Test;

public class TestFileName {

    public static ArrayList<String> fileName = new ArrayList();
    public static File folder;

@Test
    public void FileName(final File folder) {
        FileName.folder = folder;
    }
@Test
    public static void setFileName(File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                setFileName(fileEntry);
            } else {
                fileName.add((fileEntry.getName()));
            }
        }
    }
@Test
    public static ArrayList<String> getFileName() {
        return fileName;
    }

}


