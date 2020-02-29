package com.supinfo.gameoflife;

public class DeadCell implements Cell{

	@Override
	public Cell newGeneration(int nbNeighbours) {
		// TODO Auto-generated method stub
		if (nbNeighbours == 3) {
			return new AliveCell();
		}
		return this;
	}

	@Override
	public String getAsString() {
		// TODO Auto-generated method stub
		return "-";
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
