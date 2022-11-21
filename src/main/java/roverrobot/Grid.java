package roverrobot;

public class Grid {

	
	private Object[][] grid;
	private Obstacles obstacles;
	
	
	public Grid() {
		this.obstacles = new Obstacles();
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				grid[i][j] = null;
				
				if (obstacles.getListObstacles()[i][j] == true){
					grid[i][j] = obstacles;
				}
			}
		}
		

	}
	
	
	
	public Object[][] getGrid() {
		return grid;
	}



	public void setGrid(Object[][] grid) {
		this.grid = grid;
	}



	public void createGrid() {
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				grid[i][j] = null;
			}
		}
	}
}
