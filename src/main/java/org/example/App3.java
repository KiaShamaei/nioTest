package org.example;


import java.io.*;

/**
 * Hello world!
 *
 */
public class App3
{
    public static void main( String[] args ) throws IOException {
        String source = "tt.pdf";
        String destination = "et6.pdf";
        try(InputStream in = new BufferedInputStream(new FileInputStream(source) , 8*1024) ;
        OutputStream out = new BufferedOutputStream(new FileOutputStream(destination) , 8*1024)
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
