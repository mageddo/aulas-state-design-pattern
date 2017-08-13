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
		System.out.println("nao pode enviar");
	}

	public void pagar() {
		maquinaSaque.estado = maquinaSaque.pago;
		System.out.println("pago");
	}

	public void cancelar() {
		System.out.println("nao pode ser cancelado");
	}

	public void analisar() {
		System.out.println("nao pode analisar");
	}

	public void aprovarAnalise() {
		System.out.println("nao pode aprovar");
	}

	public void negarAnalise() {
		System.out.println("nao pode negar");
	}
}
