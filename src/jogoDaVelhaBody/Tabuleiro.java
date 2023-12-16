package jogoDaVelhaBody;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private String[][] tabuleiro = {
			{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"}
	};
	
	private List<Integer> plays = new ArrayList<>();
	
	boolean win = false;
	
	public Tabuleiro() {
	}
	 
	public void printTabu() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(tabuleiro[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void makePlay(int pos, String simbol) {
	    if (pos < 1 || pos > 9) {
	        System.out.println("Posição inválida");
	        return;
	    }

	    if (plays.contains(pos)) {
	        System.out.println("Casa já ocupada");
	        return;
	    }

	    plays.add(pos);

	    switch (pos) {
	        case 1:
	            tabuleiro[0][0] = simbol;
	            break;
	        case 2:
	            tabuleiro[0][1] = simbol;
	            break;
	        case 3:
	            tabuleiro[0][2] = simbol;
	            break;
	        case 4:
	            tabuleiro[1][0] = simbol;
	            break;
	        case 5:
	            tabuleiro[1][1] = simbol;
	            break;
	        case 6:
	            tabuleiro[1][2] = simbol;
	            break;
	        case 7:
	            tabuleiro[2][0] = simbol;
	            break;
	        case 8:
	            tabuleiro[2][1] = simbol;
	            break;
	        case 9:
	            tabuleiro[2][2] = simbol;
	            break;
	        default:
	            System.out.println("Posição inválida");
	    }
	}
	
	public boolean checkWin() {
		for (int i=0; i<3; i++) {
			/*linhas*/
			if(tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] &&  tabuleiro[i][0] != "\0") {
				return true;	
			}
			/*colunas*/
			if(tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != "\0") {
				return true;
			}
		}
		
		if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != "\0") {
			return true;
		}
		
		if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != "\0") {
			return true;
		}
		return false;
	}
	

	}
