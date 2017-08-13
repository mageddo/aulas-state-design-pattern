package com.mageddo.v3.state;

import com.mageddo.v3.MaquinaSaque;

/**
 * Created by elvis on 8/12/17.
 */

public class SaqueCancelado implements Estado {

	private MaquinaSaque maquinaSaque;

	public SaqueCancelado(MaquinaSaque maquinaSaque) {
		this.maquinaSaque = maquinaSaque;
	}

	public void enviarBanco() {
		System.err.println("nao pode cancelar");
	}

	public void pagar() {
		System.err.println("nao pode cancelar");
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
