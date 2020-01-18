/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File file = new File("text.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        file.delete();

    }

}
