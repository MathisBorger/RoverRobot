package roverrobot;

public class Rover {
		
	private Commands commands;
	private Position position;
	private Direction direction;
	
	public Rover() {
		this.commands = new Commands();
		this.position = new Position(0,0);
		this.direction = Direction.NORTH;
	}

	public Commands getCommands() {
		return commands;
	}

	public void setCommands(Commands commands) {
		this.commands = commands;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	
	
	
	
}
