package refactoring_paper.video.price;

public class ChildrenPrice extends Price {
	private static final ChildrenPrice instance = new ChildrenPrice();

	public static ChildrenPrice getInstance() {
		return instance;
	}

	private ChildrenPrice() {
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 0.0;
		result += 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
