package refactoring_paper.video.price;

public class RegularPrice extends Price {
	private static final RegularPrice instance = new RegularPrice();

	public static RegularPrice getInstance() {
		return instance;
	}

	private RegularPrice() {
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 0.0;

		result += 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}

		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
