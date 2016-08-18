/**
 * Diferentes métodos de integração por quadratura numérica
 */
package org.mack.an2.ativ1;

/**
 * @author Yuri Serrano
 *
 */
public abstract class IntegraSimples {
	/**
	 * a, b intervalo de integração
	 */
	double a,b;
	public IntegraSimples(double a, double b) {
		this.a = a;
		this.b = b;
	}
	/**
	 * Função a ser integrada
	 * @param x
	 * @return
	 */
	abstract double f(double x);
	/**
	 * Regra do trapezio
	 * @return double com a aproximação pela regra trapezoidal
	 */
	double integraTrapezio() {
		return (b-a)*(f(a)+f(b))/2;
	}
	double integraSimpson() {
		double h=(b-a)/2;
		return (h/3)*(f(a)+4*f(a+h)+f(b));
	}
	double integraSimpson38() {
		double h=(b-a)/3;
		return (3*h/8)*(f(a)+3*f(a+h)+3*f(a+2*h)+f(b));
	}
	public String toString() {
		String s="Exercício 3\n";
		s += "Regra trapezoidal = " + integraTrapezio() + "\n";
		s += "Regra de Simpson = " + integraSimpson() + "\n";
		s += "Regra de três oitavos de Simpson = " + integraSimpson38() + "\n";
		return s;
	}
}
