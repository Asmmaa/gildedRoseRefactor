package com.gildedrose.updater;

import com.gildedrose.Item;

public class AgedBrie extends CustomisedItem implements Updater {

	public AgedBrie(Item item) {
		super(item);
	}

	public void updateState(Item item) {
			increaseQualityBy(1);
			if (pastExpirationDate(item)) {
				increaseQualityBy(1);
			}

		decreaseSellByDay();

	}
}