/**
 * Meu primeiro programa Java
 * 
 */
package meu_1_ProgramaJava;

import java.util.Scanner;

/** @author PC */
public class Principal {
	/** @param args */
	public static void main(String[] args) {
		System.out.println("Olá amigo!\n\nQual é o seu nome?"); // Uso do println
		// Ler uma string do console usando a biblioteca Scanner.
		// Teste Novo teste
		Scanner oi = new Scanner(System.in);
		String nome = oi.nextLine();
		System.out.printf("Olá %s!\n", nome);
	}
}
