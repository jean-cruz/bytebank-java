package javaIO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + ", " +charset.displayName());
        String sNovo = new String(bytes,charset.displayName());
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes.length + ", "+StandardCharsets.UTF_16.displayName());
        sNovo = new String(bytes,StandardCharsets.UTF_16.displayName());
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println(bytes.length + ", "+StandardCharsets.ISO_8859_1.displayName());
        sNovo = new String(bytes,StandardCharsets.ISO_8859_1.displayName());
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", "+StandardCharsets.US_ASCII.displayName());
        sNovo = new String(bytes,StandardCharsets.US_ASCII);
        System.out.println(sNovo);
    }
}
