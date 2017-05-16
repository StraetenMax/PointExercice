package retourClassePoint;

public class Point<a> {
	//propriétés
	private double positionX;
	private double positionY;

	
	//constructeurs vide et initialisé
	public Point(){
		positionX = 00.0;
		positionY = 00.0;
	}
	public Point(double positionX, double positionY){
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	//accesseurs et mutateurs
	public double getPositionX(){
		return positionX;
	}
	public void setPositionX(double positionX){
		this.positionX = positionX;
	}
	public double getPositionY(){
		return positionY;	
	}
	public void setPositionY(double positionY){
		this.positionY = positionY;	
	}
	
	//méthodes
	public Point translation(double a, double b){
		return new Point(this.positionX + a, this.positionY + b);
	
	}
}

