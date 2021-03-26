package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaController {

	public void operarConCuenta () {
		//instancia de la clase cuenta
		Cuenta nuevaCuenta = new Cuenta();
		
		int numCuenta = 1;
		int dni = 44515404;
		double saldo = 123;
		
		//una instancia de la clase Cuenta con valores asignados a sus atributos
		Cuenta otraCuenta = new Cuenta(numCuenta, dni, saldo);
		
		System.out.println("Valor DNI de nuevaCuenta "+ nuevaCuenta.getDni());
		System.out.println("Valor DNI de otraCuenta "+ otraCuenta.getDni());
		
		System.out.println("Valor del SALDO: " + otraCuenta.getSaldo());
		
		otraCuenta.depositar(1000);
		otraCuenta.depositar(5000);
		
		System.out.println("Valor del SALDO: " + otraCuenta.getSaldo());
		
		otraCuenta.extraer(9000);
		
		if (otraCuenta.getSaldo()<0) {
			System.out.println("Saldo insuficiente, no se puede hacer la operacion");
			otraCuenta.depositar(9000);
		}
	}
}
