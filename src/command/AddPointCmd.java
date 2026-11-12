package command;

import mvc.DrawingModel;
import mvc.Point;

public class AddPointCmd implements Command {
	public DrawingModel model;
	public Point point;
	
	public AddPointCmd(DrawingModel model, Point point) {
		this.model = model;
		this.point = point;
	}

	@Override
	public void execute() {
		model.add(point);
	}

	@Override
	public void unexecute() {
		model.remove(point);

	}

}
