>>>
/* O jogo PAR ou ÍMPAR há tempos decide o destino de pessoas. Suas regras são simples: Dois jogadores
informam um número e se sua soma for par o jogador que escolheu PAR ganha e vice-versa. Em um jogo que
os meninos do bairro estão jogando, eles não conseguem decidir quem será o próximo da brincadeira. Para
solucionar esse problema, você foi chamado.

Essa brincadeira só poderá ser jogada de dois em dois jogadores e para escolher o próximo jogador uma 
das crianças pediu sua ajuda para desenvolver um programa que, dado o nome dos jogadores, suas respectivas
escolhas PAR ou ÍMPAR e os números, informe quem foi o vencedor.
*/

import java.util.*;

public class DIO {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int QT = Integer.parseInt(leitor.nextLine());
        String linha1[], linha2[], nome1, escolha1, nome2, escolha2;
        int N, M;
        for (int i = 0; i < QT; i++) {
            linha1 = leitor.nextLine().split(" ");
            linha2 = leitor.nextLine().split(" ");
            N = Integer.parseInt(linha2[0]);
            M = Integer.parseInt(linha2[1]);
            nome1 = linha1[0];
            escolha1 = linha1[1];
            nome2 = linha1[2];
            escolha2 = linha1[3];
            if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) || ((N + M) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))) System.out.println(nome1);
            else System.out.println(nome2);
        }
    }
}
>>>
