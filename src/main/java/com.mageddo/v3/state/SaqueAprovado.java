package com.mageddo.v3.state;

import com.mageddo.v3.MaquinaSaque;

/**
 * Created by elvis on 8/12/17.
 */

public class SaqueAprovado implements Estado {

	private MaquinaSaque maquinaSaque;

	public SaqueAprovado(MaquinaSaque maquinaSaque) {
		this.maquinaSaque = maquinaSaque;
	}

	public void enviarBanco() {
		System.out.println("enviado");
		maquinaSaque.estado = maquinaSaque.enviado;
	}

	public void pagar() {
		System.out.println("nao pode pagar");
	}

	public void cancelar() {
		System.out.println("nao pode cancelar");
	}

	public void analisar() {
		System.out.println("nao pode analisar");
	}

	public void aprovarAnalise() {
		System.out.println("nao pode aprovar analise");
	}

	public void negarAnalise() {
		System.out.println("nao pode negar analise");
	}
}
