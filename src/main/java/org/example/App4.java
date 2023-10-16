package org.example;


import java.io.*;
import java.nio.channels.FileChannel;

/**
 * Hello world!
 */
public class App4 {
    public static void main(String[] args) throws IOException {
        String source = "tt.pdf";
        String destination = "et7.pdf";
        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(destination);
             FileChannel f1 = in.getChannel();
             FileChannel f2 = out.getChannel()
        ) {
            long before = System.currentTimeMillis();

            f1.transferTo(0, f1.size(), f2);
            long after = System.currentTimeMillis();
            System.out.println(after - before);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
