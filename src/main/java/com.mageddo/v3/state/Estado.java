package com.mageddo.v3.state;

/**
 * Created by elvis on 8/12/17.
 */

public interface Estado {
	void enviarBanco();
	void pagar();
	void cancelar();
	void analisar(); // enviando para a analise de risco
	void aprovarAnalise(); // analise de risco aprovou
	void negarAnalise(); // analise de risco reprovou
}
