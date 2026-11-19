package adapter;


public class TestAdapter {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		//Vehicle boat = new Boat();
		Boat boat = new Boat();
		Vehicle boatAdapter = new BoatAdapter(boat);
		Vehicle boatAdapter2 = new BoatAdapter2();
		
		car.goFaster();
		plane.goFaster();
		train.goFaster();
		boat.rowFaster();
		boatAdapter.goFaster();
		boatAdapter2.goFaster();

	}

}
