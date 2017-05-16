package retourClassePoint;

public class Point {
	//propriétés
	private double positionX;
	private double positionY;
	
	//constructeurs vide et initialisé
	public Point(){
		positionX = 00.00;
		positionY = 00.00;
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
}
