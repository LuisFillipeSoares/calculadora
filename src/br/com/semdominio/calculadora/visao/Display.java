package br.com.semdominio.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import br.com.semdominio.calculadora.modelo.Memoria;
import br.com.semdominio.calculadora.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private JLabel label; //texto numero condido no painel
	
	
	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50)); // cor do display
		label = new JLabel(Memoria.getInstancia().getTextoAtual()); //instanciando o label no construtor
		label.setForeground(Color.WHITE); //ajustando cor da label
		label.setFont(new FontUIResource("courier", Font.PLAIN, 20)); //selecionando tipo da letra, fonte e tamanho
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); //gerenciador de layout
		
		add(label);
	
	}


	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}
	
}
