package Jogo.Models;

public class Regras {

	public Boolean verificaVitoria(String[][] Matriz ,  String simbolo) {
		
		if(Matriz[0][0].equals(simbolo) && Matriz[0][1].equals(simbolo) && Matriz[0][2].equals(simbolo)) {
			
			return  true;
		}
		
		if(Matriz[1][0].equals(simbolo) && Matriz[1][1].equals(simbolo) && Matriz[1][2].equals(simbolo)) {
			
			return  true;
		}
		
		if(Matriz[2][0].equals(simbolo) && Matriz[2][1].equals(simbolo) && Matriz[2][2].equals(simbolo)) {
			
			return  true;
		}
		if(Matriz[0][0].equals(simbolo) && Matriz[1][0].equals(simbolo) && Matriz[2][0].equals(simbolo)) {
			
			return  true;
		}
		
		if(Matriz[0][1].equals(simbolo) && Matriz[1][1].equals(simbolo) && Matriz[2][1].equals(simbolo)) {
			
			return  true;
		}

		if(Matriz[0][2].equals(simbolo) && Matriz[1][2].equals(simbolo) && Matriz[2][2].equals(simbolo)) {
	
			return  true;
		}
		
		if(Matriz[0][0].equals(simbolo) && Matriz[1][1].equals(simbolo) && Matriz[2][2].equals(simbolo)) {
			
			return  true;
		}
		if(Matriz[0][2].equals(simbolo) && Matriz[1][1].equals(simbolo) && Matriz[2][0].equals(simbolo)) {
			
			return  true;
		}
		
		return false;
		
	}
	
}
