package refactoring_paper.video;

import refactoring_paper.video.price.ChildrenPrice;
import refactoring_paper.video.price.NewReleasePrice;
import refactoring_paper.video.price.Price;
import refactoring_paper.video.price.RegularPrice;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHIDLENS = 2;
	public static final int ACTION = 3;

	private String title;
	private Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		switch(priceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHIDLENS:
			price = new ChildrenPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case ACTION:
			price = new ActionPrice();
			break;
		default: throw new IllegalArgumentException("가격 코드가 잘못되었습니다.");
		}
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
