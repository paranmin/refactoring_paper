package refactoring_paper.video.price;

public abstract class Price {
	public abstract int getPriceCode();

	public abstract double getCharge(int daysRented);

	public abstract int getFrequentRenterPoints(int daysRented);
}
