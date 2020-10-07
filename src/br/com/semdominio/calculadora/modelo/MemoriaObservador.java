package br.com.semdominio.calculadora.modelo;


@FunctionalInterface
public interface MemoriaObservador {
	
	void valorAlterado(String novoValor); //todos os metodos que estao dentro de interfaces são metodos publicos
	
}
