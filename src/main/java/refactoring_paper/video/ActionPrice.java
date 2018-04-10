package refactoring_paper.video;

import refactoring_paper.video.price.Price;

public class ActionPrice extends Price {
	private static final ActionPrice instance = new ActionPrice();

	public static ActionPrice getInstance() {
		return instance;
	}

	private ActionPrice() {
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
