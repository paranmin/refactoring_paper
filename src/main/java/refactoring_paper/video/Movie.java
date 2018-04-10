package refactoring_paper.video;

import refactoring_paper.video.price.FactoryPrice;
import refactoring_paper.video.price.FactoryPrice.PriceType;
import refactoring_paper.video.price.Price;

public class Movie {
	private String title;
	private Price price;

	public Movie(String title, PriceType type) {
		this.title = title;
		setPriceCode(type);
	}

	public void setPriceCode(PriceType type) {
		price = FactoryPrice.createPrice(type);
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}

}
