package com.senati.ddw04;

public class Implementar {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Crear un objeto Celular1 de la clase Celular
		//Clase objeto  = new Clase (1,"Huawey",900);
		//Clase objeto  = new Clase();
		//objeto.id=1;
		//objecto.marcA="Huawey";
		//objecto.precio = 900f;
		
		Celular Cel1 = new Celular();
		Cel1.id = 1;
		Cel1.modelo = "Venus 2019";
		Cel1.precio = 900f;
		
		System.out.println("Datos registrados");
		System.out.println(Cel1.toString());
		
		//Crear un objeto Cel2  y agrega sus caracteristicas
		Celular Cel2 = new Celular(2,"Spire", 2018);

	}

}
