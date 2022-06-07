>>>
/* ENTRADA - Um número inteiro C (quantidade de casos de teste) será informado. Cada caso de teste
inicia com um número inteiro N (1 ≤ N ≤ 1000), indicando o número de termos da soma.
SAÍDA - Para cada caso de teste imprima um número S, que é o resultado da soma dos N termos da expressão.
*/

import java.io.IOException;
import java.util.*;
public class DIO {
        public static void main(String[] args) throws IOException {
                Scanner input = new Scanner(System.in);
                while(input.hasNext()) {
                        int entrada = input.nextInt();
                        if(entrada % 2 == 0) {
                                System.out.println("0");
                        } else {
                                System.out.println("1");
                        }
                }
        }
}
>>>
