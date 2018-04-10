package refactoring_paper.video.price;

import refactoring_paper.video.ActionPrice;

public class FactoryPrice {
	public enum PriceType {
		REGULAR, NEW_RELEASE, CHIDLENS, ACTION;
	}

	public static Price createPrice(PriceType type) {
		switch (type) {
		case REGULAR:
			return RegularPrice.getInstance();
		case NEW_RELEASE:
			return NewReleasePrice.getInstance();
		case CHIDLENS:
			return ChildrenPrice.getInstance();
		case ACTION:
			return ActionPrice.getInstance();
		default:
			throw new IllegalArgumentException("가격 코드가 잘못되었습니다.");
		}
	}
}
