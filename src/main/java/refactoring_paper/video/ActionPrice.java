package refactoring_paper.video;

import refactoring_paper.video.price.Price;

public class ActionPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.ACTION;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 0.0;
		result += 2;
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
