package org.example;


import java.io.*;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args ) throws IOException {
        String source = "tt.pdf";
        String destination = "et5.pdf";
        try(InputStream in = new BufferedInputStream(new FileInputStream(source)) ;
        OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))
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
