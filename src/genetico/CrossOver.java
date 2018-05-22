package genetico;
import java.util.Random;

public class CrossOver extends Individuo{
	
	private Random r = new Random();
	
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
	
}
