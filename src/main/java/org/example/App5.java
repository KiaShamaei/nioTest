package org.example;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


/**
 * Hello world!
 */
public class App5 {
    public static void main(String[] args) throws IOException {
        String source = "tt.pdf";
        String destination = "et9.pdf";

        long before = System.currentTimeMillis();
        Files.copy(new File(source).toPath(),new File(destination).toPath());

        long after = System.currentTimeMillis();
        System.out.println(after - before);


    }
}
