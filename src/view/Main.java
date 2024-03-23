
package view;

import model.CirculoObj;

/**
 * @author Lucas Batista 17 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		double raio = 5;
        CirculoObj circulo = new CirculoObj(raio);
        System.out.println("Raio do círculo: " + raio);
        System.out.println("Perímetro do círculo: " + circulo.getPerimetro());
        System.out.println("Área do círculo: " + circulo.getArea());
	}

}
