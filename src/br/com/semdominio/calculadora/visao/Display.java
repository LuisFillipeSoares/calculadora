package br.com.semdominio.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private JLabel label; //texto numero condido no painel
	
	
	public Display() {
		setBackground(new Color(46, 49, 50)); // cor do display
		label = new JLabel("1234,56"); //instanciando o label no construtor
		label.setForeground(Color.WHITE); //ajustando cor da label
		label.setFont(new FontUIResource("courier", Font.PLAIN, 20)); //selecionando tipo da letra, fonte e tamanho
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); //gerenciador de layout
		
		add(label);
	
	}
	
}
