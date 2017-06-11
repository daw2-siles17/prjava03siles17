package prjava01siles17;
import java.io.*;
public class Prjava01siles17 {

    public static void main(String[] args) throws IOException { 
        File f = new File("fitxer01siles17.html"); 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) { 
            bw.write("<html>");
            bw.newLine();
            bw.write(" <head>");
            bw.newLine();
            bw.write(" <title>");
            bw.newLine();
            bw.write(" Nova p&agrave;gina web de siles17");
            bw.newLine();
            bw.write(" </title>");
            bw.newLine(); 
            bw.write(" </head>");
            bw.newLine(); 
            bw.write(" <body>");
            bw.newLine();
            bw.write(" Nova p&agrave;gina web de 17");
            bw.newLine();
            bw.write(" </body>");
            bw.newLine();
            bw.write("</html>");
            bw.newLine();
            bw.close(); 
            }
        } 
    }
    

