package genetico;
import java.util.Random;

public class Individuo {
	
	protected char[][] individuo = new char[100][11];
	protected char[][] pai = new char[100][11];
	private Random r = new Random();
	
	public void povoaIndividuo() {
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 11; j++) {
				switch(r.nextInt(37)) {
					case 1: individuo[i][j] = ' ';
					break;
					case 2: individuo[i][j] = 'a';
					break;
					case 3: individuo[i][j] = 'b';
					break;
					case 4: individuo[i][j] = 'c';
					break;
					case 5: individuo[i][j] = 'd';
					break;
					case 6: individuo[i][j] = 'e';
					break;
					case 7: individuo[i][j] = 'f';
					break;
					case 8: individuo[i][j] = 'g';
					break;
					case 9: individuo[i][j] = 'h';
					break;
					case 10: individuo[i][j] = 'i';
					break;
					case 11: individuo[i][j] = 'j';
					break;
					case 12: individuo[i][j] = 'k';
					break;
					case 13: individuo[i][j] = 'l';
					break;
					case 14: individuo[i][j] = 'm';
					break;
					case 15: individuo[i][j] = 'n';
					break;
					case 16: individuo[i][j] = 'o';
					break;
					case 17: individuo[i][j] = 'p';
					break;
					case 18: individuo[i][j] = 'q';
					break;
					case 19: individuo[i][j] = 'r';
					break;
					case 20: individuo[i][j] = 's';
					break;
					case 21: individuo[i][j] = 't';
					break;
					case 22: individuo[i][j] = 'u';
					break;
					case 23: individuo[i][j] = 'v';
					break;
					case 24: individuo[i][j] = 'w';
					break;
					case 25: individuo[i][j] = 'x';
					break;
					case 26: individuo[i][j] = 'y';
					break;
					case 27: individuo[i][j] = 'z';
					break;
					case 28: individuo[i][j] = '0';
					break;
					case 29: individuo[i][j] = '1';
					break;
					case 30: individuo[i][j] = '2';
					break;
					case 31: individuo[i][j] = '3';
					break;
					case 32: individuo[i][j] = '4';
					break;
					case 33: individuo[i][j] = '5';
					break;
					case 34: individuo[i][j] = '6';
					break;
					case 35: individuo[i][j] = '7';
					break;
					case 36: individuo[i][j] = '8';
					break;
					case 37: individuo[i][j] = '9';
					break;
				}
			}
		}
	}
	
	public void copiarString() {
		for(int i = 0; i < 100; i++) {
			pai[i] = individuo[i];
		}
	}

	public void completarCruzamento(int TAM[], int aux) {
		int aux1 = 0;
		int[] qt = new int[1000];
		int aux2 = 0;
		
		for(int i = 0; i <= aux-2; i++) {
			for( int j = i+1; j<=aux-1; j++) {
				if(TAM[i]>TAM[j]) {
					aux1 = TAM[i];
					TAM[i] = TAM[j];
					TAM[j] = aux1;
				}
			}
		}
		
		aux1 = 0;
		
		for(int i=0; i < aux-1; i++) {
			if(i != 0) {
				if(TAM[i] != TAM[i-1]) {
					for(int j = TAM[i-1]; j < TAM[i]; j++) {
						qt[aux1] = j;
						aux1++;
					}
				}
			}
		}
		
		if(aux1>=23) {
			for(int i = 76; i < 100; i++) {
				individuo[qt[aux2]]	= pai[i] ;
				aux2++;
			}
		}else if(aux<23){
			aux2 = 76;
			for(int i=0; i < 24; i++) {
				individuo[i] = pai[aux2];
				aux2++;
		}
		}
	}
	
	public char[][] getIndividuo() {
		return individuo;
	}

	public void setIndividuo(char[][] individuo) {
		this.individuo = individuo;
	}
	
	public void crossOver() {
		switch(r.nextInt(37)) {
		case 1: individuo[r.nextInt(100)][r.nextInt(11)] = ' ';
		break;
		case 2: individuo[r.nextInt(100)][r.nextInt(11)] = 'a';
		break;
		case 3: individuo[r.nextInt(100)][r.nextInt(11)] = 'b';
		break;
		case 4: individuo[r.nextInt(100)][r.nextInt(11)] = 'c';
		break;
		case 5: individuo[r.nextInt(100)][r.nextInt(11)] = 'd';
		break;
		case 6: individuo[r.nextInt(100)][r.nextInt(11)] = 'e';
		break;
		case 7: individuo[r.nextInt(100)][r.nextInt(11)] = 'f';
		break;
		case 8: individuo[r.nextInt(100)][r.nextInt(11)] = 'g';
		break;
		case 9: individuo[r.nextInt(100)][r.nextInt(11)] = 'h';
		break;
		case 10: individuo[r.nextInt(100)][r.nextInt(11)] = 'i';
		break;
		case 11: individuo[r.nextInt(100)][r.nextInt(11)] = 'j';
		break;
		case 12: individuo[r.nextInt(100)][r.nextInt(11)] = 'k';
		break;
		case 13: individuo[r.nextInt(100)][r.nextInt(11)] = 'l';
		break;
		case 14: individuo[r.nextInt(100)][r.nextInt(11)] = 'm';
		break;
		case 15: individuo[r.nextInt(100)][r.nextInt(11)] = 'n';
		break;
		case 16: individuo[r.nextInt(100)][r.nextInt(11)] = 'o';
		break;
		case 17: individuo[r.nextInt(100)][r.nextInt(11)] = 'p';
		break;
		case 18: individuo[r.nextInt(100)][r.nextInt(11)] = 'q';
		break;
		case 19: individuo[r.nextInt(100)][r.nextInt(11)] = 'r';
		break;
		case 20: individuo[r.nextInt(100)][r.nextInt(11)] = 's';
		break;
		case 21: individuo[r.nextInt(100)][r.nextInt(11)] = 't';
		break;
		case 22: individuo[r.nextInt(100)][r.nextInt(11)] = 'u';
		break;
		case 23: individuo[r.nextInt(100)][r.nextInt(11)] = 'v';
		break;
		case 24: individuo[r.nextInt(100)][r.nextInt(11)] = 'w';
		break;
		case 25: individuo[r.nextInt(100)][r.nextInt(11)] = 'x';
		break;
		case 26: individuo[r.nextInt(100)][r.nextInt(11)] = 'y';
		break;
		case 27: individuo[r.nextInt(100)][r.nextInt(11)] = 'z';
		break;
		case 28: individuo[r.nextInt(100)][r.nextInt(11)] = '0';
		break;
		case 29: individuo[r.nextInt(100)][r.nextInt(11)] = '1';
		break;
		case 30: individuo[r.nextInt(100)][r.nextInt(11)] = '2';
		break;
		case 31: individuo[r.nextInt(100)][r.nextInt(11)] = '3';
		break;
		case 32: individuo[r.nextInt(100)][r.nextInt(11)] = '4';
		break;
		case 33: individuo[r.nextInt(100)][r.nextInt(11)] = '5';
		break;
		case 34: individuo[r.nextInt(100)][r.nextInt(11)] = '6';
		break;
		case 35: individuo[r.nextInt(100)][r.nextInt(11)] = '7';
		break;
		case 36: individuo[r.nextInt(100)][r.nextInt(11)] = '8';
		break;
		case 37: individuo[r.nextInt(100)][r.nextInt(11)] = '9';
		break;
		}
	}
	
	public int Avaliar(char palavra[]) {
		char[] comp = new char[11];
		int cont = 0;
		comp[0] = 'm';
		comp[1] = 'e';
		comp[2] = ' ';
		comp[3] = 'd';
		comp[4] = 'e';
		comp[5] = ' ';
		comp[6] = 'u';
		comp[7] = 'm';
		comp[8] = ' ';
		comp[9] = '1';
		comp[10] = '0';
		
		for(int i = 0; i < 11; i++) {
			if (comp[i] == palavra[i]) {
				cont++;
			}
		}
		return cont;
	}
	
	public int soma() {
		int soma = 0;
		for(int i = 0; i < 100; i++) {
			soma = soma + Avaliar(individuo[i]);
		}
		return soma;
	}
	
	public void melhorMembro() {
		
		int[] aux = new int[100];
		int pot = 95;
		int aux2;
		
		for(int i = 0; i < 100; i++) {
			aux[i] = Avaliar(individuo[i]);
		}
		for(int i = 0; i < 98; i++) {
			for(int j = i + 1; j < 99; j++) {
				if(aux[i] > aux[j]) {
					aux2 = aux[i];
					aux[i] = aux[j];
					aux[j] = aux2;
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 100; j++) {
				if(aux[pot] == Avaliar(individuo[j]) && individuo[j].equals(pai[0]) == false && individuo[j].equals(pai[1]) == false && individuo[j].equals(pai[2]) == false && individuo[j].equals(pai[3]) == false && individuo[j].equals(pai[4]) == false) {
					individuo[i] = pai[j];
					pot++;
					break;
				}
			}
		}
	}
	
	public int roleta(int tiro) {
		
		int aux = r.nextInt(tiro);
		int cont = 0;

		for(int i = 0; i < 100; i++) {
			
			cont = cont + Avaliar(individuo[i]);
			if(aux < cont) {
				return i;
			}
		}
		return 0;
	}
	
	public void cruzamento (int aux, int aux2, int aux3) {
		int aux4 = -1;
		char[] palavra = new char[11];
		
		while(aux4!=0) {
			aux4 = r.nextInt(11);
		}
		
		individuo[aux] = pai[aux3 + 5];
		individuo[aux2] = pai[aux3 + 6];
		
		for(int i = 0; i <= aux4; i++) {
			palavra[i] = pai[aux3 + 5][i];
			pai[aux3 + 5][i] = pai[aux3 + 6][i];
			pai[aux3 + 6][i] = palavra[i];
		}
	}
	
	public int melhor() {
		int Max = -1;
		int aux = 0;
		
		for(int i = 0; i < 100; i++) {
			if(Avaliar(individuo[i]) > Max) {
				Max = Avaliar(individuo[i]);
				aux = i;
			}
		}
		
//		for(int i = 0; i < aux; i++ ) {
//			individuo[i];
//		}
		System.out.print("Melhor ");
		System.out.print(individuo[aux]);
		System.out.println(" (" + Max + " )");
		return Max;
	}
	
	public void mostra() {
		for(int i = 0; i<100; i++) {
			for( int j=0; j<11 ; j++) {
				System.out.print(individuo[i] );
			}
			System.out.println(" ");
		}
	}
		
}
