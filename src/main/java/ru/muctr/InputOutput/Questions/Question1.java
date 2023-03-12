package ru.muctr.InputOutput.Questions;

import java.io.File;
import java.io.IOException;

/**
 * @author Evgenia Skichko
 */
public class Question1 {
    public static void main(String[] args) throws IOException {
        File dir = new File("test");
        dir.mkdir();
        File f = new File("test/test.txt");
    }
}
