>>>
/* Gilberto é um famoso vendedor de esfirras na região. Porém, apesar de todos gostarem de suas
esfirras, ele só sabe dar o troco com duas notas, ou seja, nem sempre é possível receber o troco
certo. Para facilitar para ele, escreva um programa para determinar se é possível ou não devolver
o troco exato utilizando duas notas.

Notas disponíveis: 2, 5, 10, 20, 50 e 100.
*/

import java.io.IOException;
import java.util.Scanner;

public class DIO {

    //complete o código para que ele funcione corretamente

    public static void main(String[] args) throws IOException {
	//a classe Scanner auxilia na leitura dos dados de entrada
    	Scanner leitor = new Scanner(System.in);

    	while (true) {
        	int N = leitor.nextInt();
        	int M = leitor.nextInt();
        	int troco = M - N;
        	int[] notas = {2, 5, 10, 20, 50, 100};
        	boolean possivel = false;
        	
        	if (N == 0 && M == 0) break;
        	
    		for (int i = 0; i < 6; i++) {
    			for (int j = 0; j < 6; j++) {
    				if (troco - notas[j] == notas[i]) possivel = true;
    			}
    		}
    		
    		if (possivel) System.out.println("possible");
    		else System.out.println("impossible");
    	}
    }
	
}
