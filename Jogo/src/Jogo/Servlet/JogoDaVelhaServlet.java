package Jogo.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Jogo.Models.Regras;


@WebServlet("/JogoDaVelhaServlet")
public class JogoDaVelhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public JogoDaVelhaServlet() {

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Regras regras = new Regras();
		String Matriz [][] = new String[3][3];
		List<String> jogadasDisponiveis = new   ArrayList<String>();
		
		String j0x0 = new String();
		String j0x1 = new String();
		String j0x2 = new String();
		String j1x0 = new String();
		String j1x1 = new String();
		String j1x2 = new String();
		String j2x0 = new String();
		String j2x1 = new String();
		String j2x2 = new String();

		
		Matriz[0][0] = request.getParameter( "0x0" );
		Matriz[0][1] = request.getParameter( "0x1" );
		Matriz[0][2] = request.getParameter( "0x2" );
		Matriz[1][0] = request.getParameter( "1x0" );
		Matriz[1][1] = request.getParameter( "1x1" );
		Matriz[1][2] = request.getParameter( "1x2" );
		Matriz[2][0] = request.getParameter( "2x0" );
		Matriz[2][1] = request.getParameter( "2x1" );
		Matriz[2][2] = request.getParameter( "2x2" );
		
		Boolean vitoriaJogador = regras.verificaVitoria(Matriz, "X");
		
		 if(vitoriaJogador == true) {
			 
			 String b = "";
			 
		 }
		
		for(int i = 0; i < Matriz.length; i++) {
			
			for(int j = 0; j < Matriz.length; j++) {
				
				if(Matriz[i][j].equals("")) {
					jogadasDisponiveis.add(Integer.toString(i)+ ","+ Integer.toString(j));
					
				}
			}
			
		}
		
		Collections.shuffle(jogadasDisponiveis);
		String jogadaPC[] = new  String[2];
		jogadaPC = jogadasDisponiveis.get(0).split(",");
		int linha = Integer.parseInt(jogadaPC[0]);
		int coluna = Integer.parseInt(jogadaPC[1]); 
		
		Matriz[linha][coluna] = "O";
		
		Boolean vitoriaPC = regras.verificaVitoria(Matriz, "O");
		
		
		if(vitoriaPC == true ) {
			
			String a  ="";
		}
		
		
		out.println("<!DOCTYPE html>");
        out.println("<html>"); 
        out.println("<head>");
   
        out.println("<meta charset='UTF-8'/>");
       
        out.println("</head>");
      
        out.println("<body>");
        out.println("<center>");
        out.println("<h3>Jogo da Velha</h3>");
        out.println("<form>");
        
        out.println("<table>");
		out.println("<thead>");
        out.println("<tr>");
        
        out.println("<th>AA");
        out.println("</th>");
        
        out.println("<th>BB");
        out.println("</th>");
        out.println("<th>CC");
        out.println("</th>");
        
		out.println("</tr>");
		out.println("<thead>");
		
		out.println("<tbody>");
		
		out.println("<tr>");
		out.println("<td><input type='text' name='0x0' value='" + Matriz[0][0]+"'></td>");
		out.println("<td><input type='text' name='0x1'value='" + Matriz[0][1]+"'></td>");
		out.println("<td><input type='text' name='0x2' value='" + Matriz[0][2]+"'></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><input type='text' name='1x0' value='" + Matriz[1][0]+"'></td>");
		out.println("<td><input type='text' name='1x1'value='" + Matriz[1][1]+"'></td>");
		out.println("<td><input type='text' name='1x2' value='" + Matriz[1][2]+"'></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td><input type='text' name='2x0' value='" + Matriz[2][0]+"'></td>");
		out.println("<td><input type='text' name='2x1'value='" + Matriz[2][1]+"'></td>");
		out.println("<td><input type='text' name='2x2' value='" + Matriz[2][2]+"'></td>");
		out.println("</tr>");
		
		out.println("</tbody>");
        
		out.println("</table>");
		out.println("<button type='submit' >Jogar</button>");
		out.println("</form>");
		out.println("</center>");
        out.println("</body>"); 
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
