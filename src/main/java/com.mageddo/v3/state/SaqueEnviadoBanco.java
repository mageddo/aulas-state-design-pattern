package com.mageddo.v3.state;

import com.mageddo.v3.MaquinaSaque;

/**
 * Created by elvis on 8/12/17.
 */

public class SaqueEnviadoBanco implements Estado {

	private MaquinaSaque maquinaSaque;

	public SaqueEnviadoBanco(MaquinaSaque maquinaSaque) {
		this.maquinaSaque = maquinaSaque;
	}

	public void enviarBanco() {
		System.err.println("nao pode enviar");
	}

	public void pagar() {
		maquinaSaque.estado = maquinaSaque.pago;
		System.out.println("pago");
	}

	public void cancelar() {
		System.err.println("nao pode ser cancelado");
	}

	public void analisar() {
		System.err.println("nao pode analisar");
	}

	public void aprovarAnalise() {
		System.err.println("nao pode aprovar");
	}

	public void negarAnalise() {
		System.err.println("nao pode negar");
	}
}
