package refactoring_paper.video;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		StringBuilder result = new StringBuilder(getName() + " 고객님의 대여 기록\n");

		for (Rental each : rentals) {
			double thisAmount = each.getCharge();

			frequentRenterPoints++;

			if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}

			result.append("\t" + each.getMovie().getTitle());
			result.append("\t" + String.valueOf(thisAmount) + "\n");
			
			totalAmount += thisAmount;
		}

		result.append("누적 대여료 : " + String.valueOf(totalAmount) + "\n");
		result.append("적립 포인트 : " + String.valueOf(frequentRenterPoints));

		return result.toString();
	}
}
