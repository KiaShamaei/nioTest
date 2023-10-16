package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        String source = "tt.pdf";
        String destination = "et1.pdf";
        try(InputStream in = new FileInputStream(source) ;
        FileOutputStream out = new FileOutputStream(destination)
        ){
            long before = System.currentTimeMillis();
            int length ;
            while ((length= in.read())!=-1){
                out.write(length);
            }
            long after = System.currentTimeMillis();
            System.out.println(after - before);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
