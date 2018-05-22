package genetico;
import java.util.Random;

public class Util extends Individuo{

	private Random r = new Random();
	
	public int Avaliar(char palavra[]) {
		char[] comp = new char[12];
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
		int aux4;
		char[] palavra = new char[12];
		
		do {
			aux4 = r.nextInt(11);
		}while(aux4==0);
		
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
		
		System.out.println("Melhor " + individuo[aux] + " (" + Max + " )" );
		return Max;
	}
	
}
