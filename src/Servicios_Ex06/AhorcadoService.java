package Servicios_Ex06;

import Entidades_Ex06.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);
    int cont = 0;
    int cont2 = 0;
    boolean auxb = false;

    public Ahorcado crearJuego(Ahorcado a) {
        System.out.println("Ingresar la palabra a buscar:");
        String palabra = leer.nextLine();
        a.setLongitud(palabra.length());
        String[] aux = new String[palabra.length()];
        System.out.println("Ingresar la cantidad de intentos:");
        a.setCantIntentos(leer.nextInt());
        for (int i = 0; i < a.getLongitud(); i++) {
            aux[i] = palabra.substring(i, i + 1);
        }
        a.setPalabra(aux);
        return a;
    }

    public void longitud(Ahorcado a) {
        System.out.println("La palabra tiene: " + a.getLongitud() + " letras");
    }

    public Ahorcado buscar(String letra, Ahorcado a) {
        for (int i = 0; i < a.getLongitud(); i++) {
            if (a.getPalabra()[i].equalsIgnoreCase(letra)) {
                cont++;
                auxb = true;
                System.out.println("La letra ha sido encontrada en la posicion: " + (i + 1));
            }
        }
        if (auxb == false) {
            System.out.println("La letra no esta en la palabra");
            cont2++;
            a.setIntentos(cont2);
            
        }
        a.setLetras(cont);
        return a;
    }

    public void encontradas(Ahorcado a) {
        System.out.println("Número de letras (encontradas, faltantes): [" + a.getLetras() + "] " + "[" + (a.getLongitud() - a.getLetras()) + "]");
    }

    public void intentos(Ahorcado a) {
        System.out.println("Número de oportunidades restantes:" + (a.getCantIntentos() - a.getIntentos()));
        System.out.println("----------------------------------------------");
    }

    public void juego(Ahorcado a) {
        crearJuego(a);
        do {
            longitud(a);
            System.out.println("Ingrese una letra:");
            String letra = leer.next();
            buscar(letra, a);
            encontradas(a);
            intentos(a);
        } while (a.getLetras() < a.getLongitud() && a.getIntentos() < a.getCantIntentos());
        if (a.getLetras() == a.getLongitud() && a.getIntentos() < a.getCantIntentos()) {
            System.out.println("Felicitaciones! a completado la palabra: ");
        } else if (a.getLetras() < a.getLongitud() && a.getIntentos() == a.getCantIntentos()) {
            System.out.println("Lo sentimos, no hay más oportunidades");
        }

    }
}
