package com.anahisalgado.entradasalida;

import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Hola PlatziJava";
		String ruta = "/Users/anahisalgado/Desktop/Java/";
		String nombreArchivo = "miArchivoPlatzi.txt";
		
		try {
			FileWriter archivo =  new FileWriter(ruta+nombreArchivo);
			archivo.write(texto);
			archivo.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
