package adapter;

import hexagon.Hexagon;

public class BoatAdapter implements Vehicle {
	private Boat boat;
	//private Hexagon hexagon;
	
	public BoatAdapter(Boat boat) {
		this.boat = boat;
	}

	@Override
	public void goFaster() {
		boat.rowFaster();
		//hexagon.paint(g);
	}

}
