package com.mageddo.v1;

/**
 * Created by elvis on 8/12/17.
 */

public class MaquinaSaque {

	void enviarBanco(Saque saque) {
		switch (saque.status) {
			case "criado":
				System.out.println("enviado ao banco");
				saque.status = "enviado-banco";
				break;
			default:
				System.out.println("não posso enviar ao banco");
		}
	}

	void pagar(Saque saque) {
		switch (saque.status) {
			case "enviado-banco":
				System.out.println("pago");
				saque.status = "pago";
				break;
			default:
				System.out.println("não posso pagar");
		}
	}

	void cancelar(Saque saque) {
		switch (saque.status) {
			case "criado":
				System.out.println("cancelado");
				saque.status = "cancelado";
				break;
			default:
				System.out.println("não posso cancelar");
		}
	}

}
