package refactoring_paper.video.statement;

import java.util.List;

import refactoring_paper.video.Customer;
import refactoring_paper.video.Rental;

public abstract class Statement {

	public String value(Customer customer) {
		StringBuilder result = new StringBuilder();
		List<Rental> rentals = customer.getRentals();

		result.append(headerString(customer.getName()));
		for (Rental each : rentals) {
			result.append(eachRentalString(each));
		}
		result.append(footerString(customer));

		return result.toString();
	}

	protected abstract String footerString(Customer customer);

	protected abstract String eachRentalString(Rental each);

	protected abstract String headerString(String name);

}