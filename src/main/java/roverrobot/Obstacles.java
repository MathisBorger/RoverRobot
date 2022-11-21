package roverrobot;

public class Obstacles {
	private Boolean[][] listObstacles;
	
	public Obstacles() {
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				listObstacles[i][j] = false;
			}
		}
		
		
		listObstacles[3][3] = true;
		listObstacles[1][2] = true;
		listObstacles[6][2] = true;
		listObstacles[4][3] = true;
	}

	public Boolean[][] getListObstacles() {
		return listObstacles;
	}
	
	
}
