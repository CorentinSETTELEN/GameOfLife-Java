package com.supinfo.gameoflife;

public class AliveCell implements Cell{
	
	private int age = 0;

	@Override
	public Cell newGeneration(int nbNeighbours) {
		// TODO Auto-generated method stub
		if (nbNeighbours < 2 || nbNeighbours > 3) {
			return new DeadCell();
		}
		age++;
		return this;
	}

	@Override
	public String getAsString() {
		// TODO Auto-generated method stub
		if (age == 0) {
			return "0";
		}
		return "+";
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return true;
	}

}
