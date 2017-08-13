package com.mageddo.v3.state;

import com.mageddo.v3.MaquinaSaque;

/**
 * Created by elvis on 8/12/17.
 */

public class SaqueAnalise implements Estado {

	private MaquinaSaque maquinaSaque;

	public SaqueAnalise(MaquinaSaque maquinaSaque) {
		this.maquinaSaque = maquinaSaque;
	}

	public void enviarBanco() {
		System.err.println("nao pode enviar");
	}

	public void pagar() {
		System.err.println("nao pode pagar");
	}

	public void cancelar() {
		maquinaSaque.estado = maquinaSaque.cancelado;
		System.out.println("cancelado");
	}

	public void analisar() {
		System.err.println("nao pode analisar");
	}

	public void aprovarAnalise() {
		maquinaSaque.estado = maquinaSaque.aprovado;
		System.out.println("analise positiva");
	}

	public void negarAnalise() {
		maquinaSaque.estado = maquinaSaque.negado;
		System.out.println("analise negativa");
	}
}
