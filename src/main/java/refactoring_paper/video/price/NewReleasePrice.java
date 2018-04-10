package refactoring_paper.video.price;

public class NewReleasePrice extends Price {
	private static final NewReleasePrice instance = new NewReleasePrice();

	public static NewReleasePrice getInstance() {
		return instance;
	}

	private NewReleasePrice() {
	}
	
	@Override
	public double getCharge(int daysRented) {
		double result = 0.0;
		result += daysRented * 3;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}

}
