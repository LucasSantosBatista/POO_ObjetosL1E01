/**
 * 
 */
package model;

/**
 * @author Lucas Batista 17 de mar. de 2024
 */
public class CirculoObj {
	public double raio;

	public CirculoObj(double raio) {
		super();
		this.raio = raio;
	}

	// Perimentro = 2 * π * r
	public double getPerimetro() {
		return (2 * Math.PI * raio);
	}

	// Area = π * r^2
	public double getArea() {
		return (Math.PI * (Math.pow(raio, 2)));
	}
}
