package genetico;

public class main {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int C;
		int D;
		int[] E = new int[1000];
		int cont = 0;
		
		Individuo i = new Individuo();
		
		i.povoaIndividuo();
		i.melhor();
		
		while(i.melhor() != 11  ) {
			
			cont++;
			D = 0;
			C = i.soma();
			i.melhorMembro();
			for(int k = 0; k < 70 ; k++) {
				if(C!=0) {
					A = i.roleta();
					B = i.roleta();
					while(A != B) {
					A = i.roleta();
					B = i.roleta();
					}
				E[D] = A;
				E[D+1] = B;
				i.cruzamento(A, B, k);
				D = D+2;
				}
			}
			
		i.completarCruzamento(E, D);
		i.copiarString();
		i.crossOver(); 
		
		}
		System.out.println( cont + " Gera��es Foram Necessarias Para Chegar No Resultado");
	}

}
