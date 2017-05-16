package application;

import retourClassePoint.Point;

public class TestPoint {

	public static void main(String[] args) {
		// instancier les classes
		Point[] points = new Point[2];
		points[0] = new Point(1.0, 3.0);
		points[1] = new Point(5.0, 6.0);
		
		Point p3 = points[0].translation(2.0, 1.5);
		
		//appeler les méthodes
		double d = Point.distance(points[0], points[1]);
		
		for(Point s : points)
		System.out.println(s);
		//System.out.println("p2 = "+ points[1]);
		System.out.println("p3 = "+ p3);
		System.out.println("Distance = " + d);
		
	}

}
