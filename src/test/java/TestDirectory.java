/* 
 * Semester: A171
 * Course: STIW3054
 * Group: A
 * Task: Assignment 1
 * Matric Num: 238256
 * Name: Khalilah Binti Ahmad Fahmi
 */
package com.uum._a1.;

import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class TestDirectory {

    public static String curPath;
@Test
    public static void setAllFiles(File curDir) throws IOException {

        String current = new java.io.File("C:\\Users\\kamalfahmi\\Documents\\NetBeansProjects\\Assignment1\\src\\TestFile").getCanonicalPath();
        System.out.println("Current dir:" + current);
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);

    }
@Test
    public static String getAllFiles() {
        return curPath;

    }

}

