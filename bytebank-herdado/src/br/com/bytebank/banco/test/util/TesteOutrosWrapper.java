package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue());

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero1 = Integer.valueOf(29);
        Number refNumero2 = Double.valueOf(29);
        Number refNumero3 = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);

        for (Number obj:lista) {
            System.out.println(obj);
        }
    }
}
