package javaIO;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner  linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            System.out.format("formatando %06.3f",9.3);

            String tipo = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt","BR"),
                    "%s - %04d-%08d, %20s: %08.2f %n",
                    tipo,agencia,numero,titular,saldo);

            linhaScanner.close();

            //String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));
        }
        scanner.close();
    }
}
