
package reto7;

import java.util.Scanner;

public class Reto7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String dificultad, continuar;
        do{
            System.out.println("Escriba A, B o C, según la dificultad del nivel que guste jugar:\n "
                    + "Opción A. Fácil \n Opción B. Intermedio \n Opción C. Difícil \nPara salir del juego, introduzca el número 0");
            dificultad = sc.next();
            descifrarPalabra(dificultad);
            System.out.println("Felicidades! Has encontrado la palabra!\n ¿Deseas continuar jugando? S/N");
            continuar = sc.next();
        }while(continuar.equals("S")||continuar.equals("s"));
    }
    
    public static void descifrarPalabra(String dificultad){
        Scanner letra = new Scanner(System.in);
        String palabraSelec = "none", intento;
        StringBuilder palabraX = new StringBuilder();
        String[] palabras4 = {"gato", "lago", "casa", "pesa", "pato", "pata", "cosa", "mono", "mesa", "cama", "lata", "maiz", "mano",
        "pala", "palo", "paso"};
        String[] palabras8 = {"carruaje", "carrusel", "agricola", "adjetivo", "atrevido", "aventura", "bailarin", "baratija", "barbacoa",
        "avestruz", "blancura", "bofetada", "bombilla", "cafetera", "callejon", "camarero"};
        String[] palabras12 = {"chocolateria", "comprometido", "caballeresco", "calculatoria", "congestionar", "colonizadora", "cognoscitivo",
        "blanqueadura", "burocratizar", "burocratismo", "chachalaqueo", "crematistica", "creiblemente", "cuadragesimo", "cuadrangular", "cuadriculado"};
        
        switch (dificultad){
            case "A":
            case "a":
                palabraSelec = palabras4[(int)(Math.random()*16)];
                palabraX.insert(0, "XXXX");
                break;
            case "B":
            case "b":
                palabraSelec = palabras8[(int)(Math.random()*16)];
                palabraX.insert(0, "XXXXXXXX");
                break;
            case "C":
            case "c":
                palabraSelec = palabras12[(int)(Math.random()*16)];
                palabraX.insert(0, "XXXXXXXXXXXX");
                break;
            case "0":
                System.exit(0);
        }
        do{
            System.out.print(">> Introduce la letra: ");
            intento = letra.next();
            intento = String.valueOf(intento.charAt(0));
            for(int i = 0; i<palabraSelec.length(); i++){
                if(intento.equals(String.valueOf(palabraSelec.charAt(i)))){
                    palabraX.replace(i, i+1, intento);
                }
            }
            System.out.println(palabraX);
        }while(!palabraX.toString().equals(palabraSelec));
    }
    
}
