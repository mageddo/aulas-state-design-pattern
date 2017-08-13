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
		System.out.println("nao pode enviar");
	}

	public void pagar() {
		System.out.println("nao pode pagar");
	}

	public void cancelar() {
		maquinaSaque.estado = maquinaSaque.cancelado;
		System.out.println("cancelado");
	}

	public void analisar() {
		System.out.println("nao pode analisar");
	}

	public void aprovarAnalise() {
		maquinaSaque.estado = maquinaSaque.aprovado;
		System.out.println("analise positiva");
		maquinaSaque.estado.enviarBanco();
	}

	public void negarAnalise() {
		System.out.println("analise negativa");
		this.cancelar();
	}
}
