package br.com.zsguil.maquina_cafe.exceptions;

public class FaltaAguaException extends RuntimeException {

	public FaltaAguaException() {
		super("Não há água o suficiente para realizar operação. É"
				+ " necessário reabastecer.");
	}
	
}
