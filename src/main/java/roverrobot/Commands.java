package roverrobot;
public class Commands {

	private Rover rover;
	
	
	public void forward() {
		if (rover.getDirection() == Direction.NORTH) {
			rover.getPosition().setY(rover.getPosition().getY()+1);
		}
		else if (rover.getDirection() == Direction.WEST) {
			rover.getPosition().setX(rover.getPosition().getX()-1);
		}
		else if (rover.getDirection() == Direction.SOUTH) {
			rover.getPosition().setY(rover.getPosition().getY()-1);
		}
		else {
			rover.getPosition().setX(rover.getPosition().getX()+1);;
		}
	}
	
	
	public void backward() {
		if (rover.getDirection() == Direction.NORTH) {
			rover.getPosition().setY(rover.getPosition().getY()-1);
		}
		else if (rover.getDirection() == Direction.WEST) {
			rover.getPosition().setX(rover.getPosition().getX()+1);
		}
		else if (rover.getDirection() == Direction.SOUTH) {
			rover.getPosition().setY(rover.getPosition().getY()+1);
		}
		else {
			rover.getPosition().setX(rover.getPosition().getX()-1);;
		}
	}
	
	
	
	public void left() {
		if (rover.getDirection() == Direction.NORTH) {
			rover.setDirection(Direction.WEST);
		}
		else if (rover.getDirection() == Direction.WEST) {
			rover.setDirection(Direction.SOUTH);
		}
		else if (rover.getDirection() == Direction.SOUTH) {
			rover.setDirection(Direction.EST);
		}
		else {
			rover.setDirection(Direction.NORTH);
		}	
	}
			
		
	public void right() {
		if (rover.getDirection() == Direction.NORTH) {
			rover.setDirection(Direction.EST);
		}
		else if (rover.getDirection() == Direction.EST) {
			rover.setDirection(Direction.SOUTH);
		}
		else if (rover.getDirection() == Direction.SOUTH) {
			rover.setDirection(Direction.WEST);
		}
		else {
			rover.setDirection(Direction.NORTH);
		}
	}
}
