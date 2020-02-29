package com.supinfo.gameoflife;

public class World {
	Cell [][] gameboard;
	int ligne;
	int colonne;
	
	public World(int ligne, int colonne) {
		this.ligne = ligne;
		this.colonne = colonne;
		gameboard = new Cell[ligne][colonne];
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {
				if (Math.random() < 0.5) {
					gameboard[i][j] = new AliveCell();
				}
				else {
					gameboard[i][j] = new DeadCell();
				}
			}
		}
	}
	
	
	public void newGeneration() {
		Cell [][] tempgameboard = new Cell[ligne][colonne];;
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {
				int compt = 0;
				if (i > 0 && gameboard[i-1][j].isAlive()) {
					compt++;
				}
				if (i < ligne - 1 && gameboard[i+1][j].isAlive()){
					compt++;
				}
				if (j > 0 && gameboard[i][j-1].isAlive()){
					compt++;
				}
				if (j < colonne - 1 && gameboard[i][j+1].isAlive()){
					compt++;
				}
				tempgameboard[i][j] = gameboard[i][j].newGeneration(compt);
			}
		}
		this.gameboard = tempgameboard;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String couille = "";
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {
				couille += gameboard[i][j].getAsString();
			}
			couille += '\n';
		}
		return couille;
	}
}
