package Jogo.Models;

import java.util.ArrayList;

public class Regras {
	
	
	public Boolean verificaEmpate(Boolean vitoriaJogador, Boolean vitoriaPc, Integer jogadas) {
		
		if(	vitoriaJogador == false && vitoriaPc == false & jogadas == 0) {
			return true;
		}else
		    return false;
	 }

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
