package com.mageddo.v2;

/**
 * Created by elvis on 8/12/17.
 */

public class MaquinaSaque {

void enviarBanco(Saque saque){
	switch (saque.status){
		case "criado":
			if(saque.perfilRisco){
				enviarParaAnalise(saque);
				saque.status = "analisando";
			} else {
				System.out.println("enviado ao banco");
				saque.status = "enviado-banco";
			}
			break;
		case "analise-aprovado":
			System.out.println("enviado ao banco depois da análise");
			saque.status = "enviado-banco";
			break;
		default:
			System.out.println("não posso enviar ao banco");
	}
}

	void cancelar(Saque saque){
	switch (saque.status){
		case "criado":
		case "analisando":
			System.out.println("cancelado");
			saque.status = "cancelado";
			break;
		default:
			System.out.println("não posso cancelar");
	}
}

void pagar(Saque saque){
	switch (saque.status){
		case "enviado-banco":
			System.out.println("pago");
			saque.status = "pago";
			break;
		default:
			System.out.println("não posso pagar");
	}
}

private void enviarParaAnalise(Saque saque) {

}
}
