package retourClassePoint;

public class Point<a> {
	//propriétés
	private int id;
	private double positionX;
	private double positionY;
	public static int count;

	
	//constructeurs vide et initialisé
	public Point(){
		id = ++count;
		positionX = 00.0;
		positionY = 00.0;
	}
	public Point(double positionX, double positionY){
		id = ++count;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	//accesseurs et mutateurs
	public int getId(){
		return id;
	}
	public void setId(){
		id = ++count;
	}
	
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

	public static double distance(Point P1, Point P2){
		return Math.sqrt(Math.pow(P1.positionX - P2.positionX,2)+ Math.pow(P1.positionY - P2.positionY, 2));
	}

	public String toString(){
		return "p"+this.getId()+" = "+ (this.getPositionX()+" ,"+this.getPositionY());
	}
}




