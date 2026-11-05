package mvc;

import java.util.ArrayList;

public class DrawingModel {
	//Lista oblika
	ArrayList<Point> shapes = new ArrayList<Point>();
	
	public void add(Point p) {
		shapes.add(p);
	}
	
	public void remove(Point p) {
		shapes.remove(p);
	}
	
	public Point get(int index) {
		return shapes.get(index);
	}
	
	public ArrayList<Point> getShapes() {
		return shapes;
	}

}
