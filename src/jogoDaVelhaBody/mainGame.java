package jogoDaVelhaBody;

import java.util.Scanner;

public class mainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Tabuleiro jogo = new Tabuleiro();
		int jogadas = 0;
		jogo.printTabu();
		
		while (jogadas <=9) {
			System.out.println("Jogador um faça sua jogada(X): ");
			int jogada1 = sc.nextInt();
			jogo.makePlay(jogada1, "X");
			jogo.printTabu();
			if(jogo.checkWin()) {
				System.out.println("Jogador 1 venceu");
				break;
			}
			System.out.println("Jogador dois faça sua jogada(O): ");
			int jogada2 = sc.nextInt();
			jogo.makePlay(jogada2, "O");
			jogo.printTabu();
			if(jogo.checkWin()) {
				System.out.println("Jogador 2 venceu");
				break;
			}
			if (jogadas == 9) {
				System.out.println("Jogo empatado");
				break;
			}
		}
		sc.close();
	}
}
