package org.iesvdm.modelo.PruebaGenéricos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaGenericos {
    public static void main(String[] args) {
        //Antes de JAVA 5
        List lista = new ArrayList();
        List <Integer>listaInt = new ArrayList();
        List <String>listaString = new ArrayList();
        Integer integer = 1;
        String string = "hola";
        Boolean bool = true;

        listaInt.add(integer);
        listaString.add(string);
        //lista.add(bool);

        for (Object o : lista) {
            System.out.println(o);
            if(o instanceof Integer){
                Integer integer1 = (Integer) o;
                System.out.println(integer1++);
            }
            if(o instanceof String){
                String string1 = (String)o;
                System.out.println(string1+"a");
            }
            for(Integer i : listaInt){
                System.out.println(i++);
            }
            for (String s : listaString) {
                System.out.println(s+"a");
            }
        }
    }
}
