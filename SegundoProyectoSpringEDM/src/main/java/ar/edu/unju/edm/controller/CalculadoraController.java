package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraController {
	public void resolverSuma(){
		int a=20, b=5;
		
		Calculadora nuevaCalculadora=new Calculadora();
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		
		System.out.println("El resultado de la suma es: "+ nuevaCalculadora.sumar());
	}	
}
