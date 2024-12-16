package com.gildedrose;

import static java.util.Arrays.asList;

import com.gildedrose.updater.UpdaterFactory;

class GildedRose {

	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		asList(items).forEach(item -> UpdaterFactory.updaterFor(item).updateState(item));
	}

}
