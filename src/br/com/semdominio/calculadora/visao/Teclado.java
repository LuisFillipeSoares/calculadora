package br.com.semdominio.calculadora.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.semdominio.calculadora.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener{ //aqui eu vou usar os botoes

	private final Color COR_CINZA_ESCURO = new Color(68, 69, 68); //instanciado uma para os botoes
	private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);
			
			
	
	public Teclado() {
		//setLayout(new GridLayout(5, 4)); //quantas linhas e quantas colunas de botoes no teclado
		//o grid layout não permite botoes maiores que outros
		GridBagLayout layout = new GridBagLayout(); 
		GridBagConstraints constraints = new GridBagConstraints(); //recebe um x e y para linha e coluna
		
		setLayout(layout);
		constraints.weightx = 1; //peso para ocupar os espaços
		constraints.weighty = 1;
		constraints.fill = GridBagConstraints.BOTH; //PRENCHER O BOTAO
		
		// linha 1
		constraints.gridwidth = 2; //largura da linha para ocupar 2 linhas;
		adicionarBotao("AC", COR_CINZA_ESCURO, constraints, 0, 0);
		constraints.gridwidth = 1; //voltando pro peso inicial para que as demais não ocupem 2 linhas;
		adicionarBotao("+-", COR_LARANJA, constraints, 2, 0);
		adicionarBotao("/", COR_LARANJA, constraints, 3, 0);
	
		// linha 2
		adicionarBotao("7", COR_CINZA_CLARO, constraints, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, constraints, 1, 1);
		adicionarBotao("9", COR_CINZA_CLARO, constraints, 2, 1);
		adicionarBotao("*", COR_LARANJA, constraints, 3, 1);
		
		// linha 3
		adicionarBotao("4", COR_CINZA_CLARO, constraints, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, constraints, 1, 2);
		adicionarBotao("6", COR_CINZA_CLARO, constraints, 2, 2);
		adicionarBotao("-", COR_LARANJA, constraints, 3, 2);
		
		// linha 4
		adicionarBotao("1", COR_CINZA_CLARO, constraints, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, constraints, 1, 3);
		adicionarBotao("3", COR_CINZA_CLARO, constraints, 2, 3);
		adicionarBotao("+", COR_LARANJA, constraints, 3, 3);
		
		// linha 5
		constraints.gridwidth = 2;
		adicionarBotao("0", COR_CINZA_CLARO, constraints, 0, 4);
		constraints.gridwidth = 1;
		adicionarBotao(",", COR_CINZA_CLARO, constraints, 2, 4);
		adicionarBotao("=", COR_LARANJA, constraints, 3, 4);
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints constraints, int x, int y) { //metodo criado para ser possivel adicionar logo linha e coluna direto na instaciação de um novo botao
		constraints.gridy = y;
		constraints.gridx = x;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, constraints);	
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof JButton) {
				JButton botao = (JButton) e.getSource();
				Memoria.getInstancia().processarComando(botao.getText());
			}
		}
	
}
