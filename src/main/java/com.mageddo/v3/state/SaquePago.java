package com.mageddo.v3.state;

import com.mageddo.v3.MaquinaSaque;

/**
 * Created by elvis on 8/12/17.
 */

public class SaquePago implements Estado {

	private MaquinaSaque maquinaSaque;

	public SaquePago(MaquinaSaque maquinaSaque) {
		this.maquinaSaque = maquinaSaque;
	}

	public void enviarBanco() {
		System.err.println("nao pode enviar");
	}

	public void pagar() {
	System.err.println("nao pode pagar");
	}

	public void cancelar() {
		System.err.println("nao pode cancelar");
	}

	public void analisar() {
		System.err.println("nao pode analisar");
	}

	public void aprovarAnalise() {
		System.err.println("nao pode aprovar analise");
	}

	public void negarAnalise() {
		System.err.println("nao pode negar analise");
	}
}