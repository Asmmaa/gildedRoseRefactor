package com.gildedrose.updater;

import com.gildedrose.Item;

public class CommonUpdater extends CustomisedItem implements Updater{

	public CommonUpdater(Item item) {
		super(item);
	}

	@Override
	public void updateState(Item item) {

			decreaseQualityByOne();
			if (pastExpirationDate(item)) {
				decreaseQualityByOne();
			}

		decreaseSellByDay();

	}

}
