package com.mageddo.v3.state;

import com.mageddo.v3.MaquinaSaque;

import java.util.Random;

/**
 * Created by elvis on 8/12/17.
 */

public class SaqueCriado implements Estado {

	private MaquinaSaque maquinaSaque;

	public SaqueCriado(MaquinaSaque maquinaSaque) {
		this.maquinaSaque = maquinaSaque;
	}

	public void enviarBanco() {
		if(maquinaSaque.saque.perfilRisco){

			maquinaSaque.estado = maquinaSaque.analise;
			System.out.println("analisando ...");

			if(new Random().nextBoolean()){
				maquinaSaque.estado.aprovarAnalise();
			} else {
				maquinaSaque.estado.negarAnalise();
			}

		} else {
			maquinaSaque.estado = maquinaSaque.enviado;
			System.out.println("enviado");
		}
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
		System.err.println("nao pode aprovar analise");
	}

	public void negarAnalise() {
		System.err.println("nao pode negar analise");
	}
}
