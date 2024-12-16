package com.gildedrose.updater;

import static java.lang.Math.min;
import static java.lang.Math.max;

import com.gildedrose.Item;

public class CustomisedItem {

    private final Item item;
    
    public static int MAX_QUALITY_ALLOWED = 50;
	
    public static int MIN_QUALITY_ALLOWED = 0;

    public CustomisedItem(Item item) {
        this.item = item;
    }
    public void decreaseSellByDay() {
        item.sellIn -= 1;
    }	

    public boolean sellByDayValueIsOver(int dayNumber) {
        return item.sellIn > dayNumber;
    }

    public void increaseQualityBy(int qualityValue) {
    	item.quality = min(item.quality + qualityValue, MAX_QUALITY_ALLOWED);
    }
    
    public void decreaseQualityByOne() {
    	item.quality = max(item.quality - 1, MIN_QUALITY_ALLOWED);
    }	

    public void dropQualityToZero() {
        item.quality = 0;
    }
    
	public boolean pastExpirationDate(Item item) {
		return item.sellIn <= 0;
	}
	public boolean canLowerQuality(Item item) {
		return item.quality > 0;
	}
	
	public boolean canIncreaseQuality(Item item) {
		return item.quality < 50;
	}

	}
