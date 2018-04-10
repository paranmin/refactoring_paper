package refactoring_paper.video.statement;

import refactoring_paper.video.Customer;
import refactoring_paper.video.Rental;

public class TextStatement extends Statement {
	private static final TextStatement instance = new TextStatement();

	public static TextStatement getInstance() {
		return instance;
	}

	private TextStatement() {
	}

	@Override
	protected String footerString(Customer customer) {
		return String.format("누적 대여료 : %s%n적립 포인트 : %s", customer.getTotalCharge(),
				customer.getTotalFrequentRenterPoints());
	}

	@Override
	protected String eachRentalString(Rental each) {
		return String.format("\t%-15s\t%s%n", each.getMovie().getTitle(), each.getCharge());
	}

	@Override
	protected String headerString(String name) {
		return String.format("%s 고객님의 대여 기록\n", name);
	}
}
