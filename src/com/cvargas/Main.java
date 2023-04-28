package com.cvargas;
// Usa un Iterador para recorrer en bucle una colección
// en dirección hacia delante.
//
// Usa un ListIterator para recorrer en bucle una colección
// en dirección inversa.

import java.util.*;

// Demuestra Iterator y ListIterator.
public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<EntradaTelefono> agenda =
                new LinkedList<EntradaTelefono>( );
        agenda.add(new EntradaTelefono("Ernesto", "555–3456"));
        agenda.add(new EntradaTelefono("Carlos", "555–3976"));
        agenda.add(new EntradaTelefono("Karen", "555–1010"));
// Usa un Iterador para mostrar la lista.
        Iterator<EntradaTelefono> itr = agenda.iterator( );
        EntradaTelefono et;
        System.out.println("Itera en la lista en " +
                "direcci\u00a2n hacia delante:");
        while(itr.hasNext( )) {
            et = itr.next( );
            System.out.println(et.nombre + ": " + et.numero);
        }
        System.out.println( );
// Usa un ListIterator para mostrar la lista en orden inverso.
        ListIterator<EntradaTelefono> litr =
                agenda.listIterator(agenda.size( ));
        System.out.println("Itera en la lista en " +
                "direcci\u00a2n inversa:");
        while(litr.hasPrevious( )) {
            et = litr.previous( );
            System.out.println(et.nombre + ": " + et.numero);
        }
    }
}
