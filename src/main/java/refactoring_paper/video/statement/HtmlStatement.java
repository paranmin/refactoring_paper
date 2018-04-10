package refactoring_paper.video.statement;

import refactoring_paper.video.Customer;
import refactoring_paper.video.Rental;

public class HtmlStatement extends Statement {

	@Override
	protected String footerString(Customer customer) {
		return String.format("<p>누적 대여료 : <em>%s</em>%n<p>적립 포인트 : <em>%s</em>%n", customer.getTotalCharge(),
				customer.getTotalFrequentRenterPoints());
	}

	@Override
	protected String eachRentalString(Rental each) {
		return String.format("\t%-15s\t%s<br>%n", each.getMovie().getTitle(), each.getCharge());
	}

	@Override
	protected String headerString(String name) {
		return String.format("<h1><em>%s 고객님의 대여 기록</em></h1><p>\n", name);
	}
}
