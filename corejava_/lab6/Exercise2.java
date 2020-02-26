package lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class Exercise2{
       public static void main(String args[]) throws IOException{
            	int z=1;
                char ch;
                String filePath="D:\\java_w\\Workspace\\fileRead\\hello.txt";
                InputStream input=new FileInputStream(filePath);
                System.out.println("\nContents of the file are");
                int n=input.available();
                System.out.print(z+": ");
                for(int i=0;i<n;i++){
                  ch=(char)input.read();
                  System.out.print(ch);
                  if(ch=='\n'){
                    System.out.print(++z+"-");
                  }                               
                }
       }
}

