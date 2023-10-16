package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args ) throws IOException {
        String source = "tt.pdf";
        String destination = "et4.pdf";
        try(InputStream in = new FileInputStream(source) ;
        FileOutputStream out = new FileOutputStream(destination)
        ){
            long before = System.currentTimeMillis();
            int length ;
            byte[] b = new byte[4*1024];
            while ((length= in.read(b))!=-1){
                out.write(b,0,length);
            }
            long after = System.currentTimeMillis();
            System.out.println(after - before);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
