package com.supinfo.gameoflife;

import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Cb nombre le lignes colonnes ?");
		Scanner sc = new Scanner(System.in);
		int ligne = sc.nextInt(),colonne = sc.nextInt();
		World pute = new World(ligne, colonne);
		System.out.println(pute.toString());
		while (true) {
			pute.newGeneration();
			System.out.println(pute.toString());
			Thread.sleep(500);
		}
	}
}
