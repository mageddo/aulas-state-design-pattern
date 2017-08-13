package com.mageddo.v3;


import com.mageddo.v3.state.Estado;
import com.mageddo.v3.state.*;

/**
 * Created by elvis on 8/12/17.
 */

public class MaquinaSaque {

	public Estado estado;
	public final Saque saque;

	public final Estado criado;
	public final Estado analise;
	public final Estado enviado;
	public final Estado pago;
	public final Estado cancelado;
	public final Estado aprovado;
	public final Estado negado;

	public MaquinaSaque(Saque saque) {
		
		this.saque = saque;
		
		this.criado = new SaqueCriado(this);
		this.analise = new SaqueAnalise(this);
		this.pago = new SaquePago(this);
		this.cancelado = new SaqueCancelado(this);
		this.enviado = new SaqueEnviadoBanco(this);
		this.aprovado = new SaqueAprovado(this);
		this.negado = new SaqueNegado(this);

		this.estado = criado;
	}

	public static void main(String[] args) {

		Saque saque = new Saque(true);
		MaquinaSaque maquinaSaque = new MaquinaSaque(saque);

		maquinaSaque.estado.enviarBanco();
		maquinaSaque.estado.pagar();
	}
}
