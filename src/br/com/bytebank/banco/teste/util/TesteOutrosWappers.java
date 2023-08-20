package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		//Double dRef = 3.2;//não deveria ser utilizado
		//Double dRef = new Double(3.2);//não deveria ser utilizado
		Double dRef = Double.valueOf(3.2);//autoboxing
		
		System.out.println(dRef.doubleValue());//unboxing
		
		//Boolean bRef = false;//não deveria ser utilizado
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		//Float refNumero = Float.valueOf(29.9f);
		Number refNumero = Float.valueOf(29.9f);//mais generica
		//Object refNumero = Float.valueOf(29.9f);
		System.out.println(refNumero);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(32.6f);
		System.out.println(lista);
	}

}
