package ar.edu.unju.edm.model;

public class Calculadora {
	private float a, b;
	
	//constructor
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	

	public float getA() {
		return a;
	}



	public void setA(float a) {
		this.a = a;
	}



	public float getB() {
		return b;
	}



	public void setB(float b) {
		this.b = b;
	}



	public float sumar() {
		float suma;
		suma=a+b;
		return suma;
	}
	public float dividir() {
		float division=0;
		if(b==0) {
			System.out.println("El divisor no pude ser igual a 0");
		}
		else {
			division=a / b;
		}
		return division;
	}
	
	//clase object
	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + "]";
	}


	
}
