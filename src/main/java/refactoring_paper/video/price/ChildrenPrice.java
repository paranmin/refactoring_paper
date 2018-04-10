package refactoring_paper.video.price;

import refactoring_paper.video.Movie;

public class ChildrenPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.CHIDLENS;
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
