package br.com.semdominio.calculadora.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		
		setSize(232, 322);//tamanho da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE); //finalizar a tela junto com aplicação
		setLocationRelativeTo(null); //abrir no centro da tela
		setVisible(true);//abrir a tela
	
	}	
	
	public static void main(String[] args) {
		new Calculadora();
	}
	
}
