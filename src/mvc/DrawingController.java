package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;
import composite.Snowflake;

public class DrawingController {
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model,DrawingFrame frame) {
		  this.model = model;
		  this.frame = frame;
	}

	//MVC and Command
	public void drawPoint(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.BLACK);
		//model.add(p);
		AddPointCmd addPointCmd = new AddPointCmd(model, p);
		addPointCmd.execute();
		frame.repaint();
		
	}
	
	//Composite
	public void drawComposite(MouseEvent e) {
		Snowflake snowflake = new Snowflake();
		
		int x = e.getX();
		int y = e.getY();
		
		Line line1 = new Line(
				new Point(x+40, y, Color.BLUE),
				new Point(x-40, y, Color.BLUE),
				Color.BLUE);
		
		Line line2 = new Line(
				new Point(x+20, y-35, Color.BLUE),
				new Point(x-20, y+35, Color.BLUE),
				Color.BLUE);
		
		Line line3 = new Line(
				new Point(x+20, y+35, Color.BLUE),
				new Point(x-20, y-35, Color.BLUE),
				Color.BLUE);
		
		snowflake.add(line1);
		snowflake.add(line2);
		snowflake.add(line3);
		
		model.add(snowflake);
		frame.repaint();
		
	}

}
