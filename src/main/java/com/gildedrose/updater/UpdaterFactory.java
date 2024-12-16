package com.gildedrose.updater;

import com.gildedrose.GildedConstant;
import com.gildedrose.Item;

public class UpdaterFactory {
	
	public UpdaterFactory() {
		// constructor stub
	}

	public static Updater updaterFor(Item currentItem) {
		if (isAgedBrie(currentItem)) {
			return new AgedBrie(currentItem);
		}
		else if(isBackstagePass(currentItem)) {
			return new BackstagePasses(currentItem);
		}
		else if(isSulfuras(currentItem)) {
			return new Sulfuras(currentItem);
		}
		else {
			return new CommonUpdater(currentItem);    			
		}
	}

	private static boolean isAgedBrie(Item currentItem) {
		return currentItem.name.equals(GildedConstant.AGED_BRIE);
	}

	private static boolean isBackstagePass(Item currentItem) {
		return currentItem.name.equals(GildedConstant.BACKSTAGE_PASS);
	}

	private static boolean isSulfuras(Item currentItem) {
		return currentItem.name.equals(GildedConstant.SULFURAS);
	}

}