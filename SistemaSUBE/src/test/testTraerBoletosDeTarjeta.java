package test;

import java.util.ArrayList;
import java.util.List;

import datos.Boleto;
import datos.Lector;
import negocio.BoletoABM;
import negocio.TarjetaABM;

public class testTraerBoletosDeTarjeta {

	public static void main(String[] args) {
		
		List<Boleto> lista=new ArrayList<Boleto>();
		TarjetaABM tABM=TarjetaABM.getInstanciaTarjetaABM();
		BoletoABM bABM=BoletoABM.getInstanciaBoletoABM();
		
		lista=tABM.traerBoletosDeTarjeta(2);
		
		System.out.println(lista);
		
		Boleto boletoAux = lista.get(lista.size()-1);
		System.out.println("el ultimo es "+boletoAux);
		
		Boleto boletoCompleto = bABM.traerBoletoCompleto(boletoAux.getIdBoleto());
		Lector lectorAux = boletoCompleto.getLector();

	}
	

}
