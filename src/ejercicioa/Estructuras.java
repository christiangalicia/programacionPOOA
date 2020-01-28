/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa;

/**
 *
 * @author Christian
 */
public class Estructuras {

    public int si() {
        int a = 5;
        if (a >= 5) {
            System.out.println("mayor igual a 5");
            return 5;
        }

        if (a >= 5) {
            System.out.println("mayor igual a 5");
            return 4;
        } else {
            System.out.println("menor a 5");
        }

        if (a <= 4) {
            System.out.println("menor igual a 4");
            return 5;
        } else if (a == 5) {
            System.out.println(" igual a 5");
            return 5;
        } else if (a > 5) {
            System.out.println("mayor a 5");
            return 5;
        } else {
            System.out.println("es otra cosa");
            return 5;
        }
        
    }

    public void ciclos() {
        //mientras
        int a = 5;
        while (a <= 10) {
            System.out.println(a);
            //&a=a+1;
            a++;
        }

        //para
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        do {
            System.out.println("hola");
        } while (a > 100);
    }

    public void otrosTemas() {
        //aritmeticas
        int a = 4 + 5 - 6 * 6 / 7;
        //relacional
        boolean b = 5 > 4; // true
        boolean c = 4 < 2; // false
        boolean d = 3 >= 3; // true
        boolean f1= 4<=4; //true menor que
        
        boolean e = 5 != 5;//false

        //logica
        boolean fz = 5 > 5 && 4 > 2; // and y ; false
        boolean g = 5 > 5 || 4 > 2; // or o ; true
        boolean h = !(5 > 5);  //true
    }

    public void envolventes() {
        //primitivos
        int a = 5;
        double b = 6.5;
        float c = 6.5f;
        boolean d = true;
        long e = 6;
        char f = 'y';

        //envolventes;
        Integer a1 = 5;
        Double b1 = 6.5;
        Float c1 = 6.5f;
        Boolean d1 = true;
        Long e1 = 6l;
        Character f1 = 'y';

    }
}
