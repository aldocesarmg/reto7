
package reto7;

import java.util.Scanner;

public class Reto7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String dificultad;
        do{
            System.out.println("Elija la dificultad del nivel:\n A. Fácil \n B. Intermedio \n C. Difícil \nPara salir del juego, introduzca el número 0");
            dificultad = sc.next();
        }while(!dificultad.equals("0"));
    }
    
    public static void descifrarPalabra(){
        String[] palabras4 = {"gato", "lago", "casa", "pesa", "pato", "pata", "cosa", "mono", "mesa", "cama", "lata", "maiz", "mano",
        "pala", "palo", "paso"};
        String[] palabras8 = {"carruaje", "carrusel", "agricola", "adjetivo", "atrevido", "aventura", "bailarin", "baratija", "barbacoa",
        "avestruz", "blancura", "bofetada", "bombilla", "cafetera", "callejon", "camarero"};
        String[] palabras12 = {"chocolateria", "comprometido", "caballeresco", "calculatoria", "congestionar", "colonizadora", "cognoscitivo",
        "blanqueadura", "burocratizar", "burocratismo", "chachalaqueo", "crematistica", "creiblemente", "cuadragesimo", "cuadrangular", "cuadriculado"};
    }
    
}
