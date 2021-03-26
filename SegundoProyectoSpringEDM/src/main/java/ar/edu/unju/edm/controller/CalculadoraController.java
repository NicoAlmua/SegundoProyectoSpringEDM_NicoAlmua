package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraController {
	public void resolverSuma(){
		int a=20, b=0;
		
		Calculadora nuevaCalculadora=new Calculadora();
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		
		System.out.println("El resultado de la suma es: "+ nuevaCalculadora.sumar());
		System.out.println("El resultado de la division: " + nuevaCalculadora.dividir());
	}	
}
