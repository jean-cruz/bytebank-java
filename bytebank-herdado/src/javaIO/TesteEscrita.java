package javaIO;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //fluxo de entrada com arquivo
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");
        bw.newLine();
        bw.newLine();
        bw.write("dasdasdasdasd dladsadjçasdka daçldas");

        bw.close();
    }
}
