>>>
/* O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura
de dados que armazena uma coleção de dados em um bloco de memória. Faça um programa para ler um número
N (idade de N pessoas). Depois disso, coloque qual idade será considerada mínima para se entrar no 
local. Retorne às idades de quem não puder entrar.
*/

import java.util.*;
public class DIO {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String string = scan.nextLine();
		double[] idade = new double[N];
		for (int i = 0; i < N; i++) {
			string = scan.nextLine();
			idade[i] = Integer.parseInt(string);
		}
		System.out.println("Não poderão entrar: "); /* Atenção aqui! Coloquei acento para ficar bem redigido, no seu código os acentos deverão sumir. */
		for (int i = 0; i < N; i++) {
			if(idade[i] < 18) {
				System.out.println((int) idade[i]);
			}
		}
	}
}
>>>
