package javaIO;

import java.io.*;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
        //fluxo de entrada com arquivo
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw = new BufferedWriter(osw);

        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        //PrintStream ps = new PrintStream(new File("lorem2.txt"));
        PrintWriter ps = new PrintWriter("lorem2.txt");
        ps.println("during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");
        ps.println();
        ps.println();
        ps.println();
        ps.println("dasdasdasdasd dladsadjçasdka daçldas teste escrita 3"+ps.getClass().getName());
        ps.close();
    }
}
