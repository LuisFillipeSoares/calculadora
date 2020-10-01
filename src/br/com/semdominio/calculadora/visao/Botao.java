package br.com.semdominio.calculadora.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;

@SuppressWarnings("serial")
public class Botao extends JButton{
	
	public Botao(String texto, Color cor) { //vou receber um texto e uma cor no construtor
		setText(texto); //colocando o texto
		setOpaque(true); //true para mudar a cor
		setBackground(cor); // recebendo qual vai ser a cor
		setFont(new FontUIResource("courier", Font.PLAIN, 15)); //selecionando tipo da letra, fonte e tamanho
		setForeground(Color.WHITE); // cor da fonte da letra
		setBorder(BorderFactory.createLineBorder(Color.BLACK)); //criando a borda dos botoes
	}
	
}
