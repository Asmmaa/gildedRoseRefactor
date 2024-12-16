package com.gildedrose.updater;

import com.gildedrose.Item;

public class BackstagePasses extends CustomisedItem implements Updater{

	public BackstagePasses(Item item) {
    	super(item);
    }

    public void updateState(Item item) {
        if (sellByDayValueIsOver(10)) {
            increaseQualityBy(1);
        } else if (sellByDayValueIsOver(5)) {
            increaseQualityBy(2);
        } else if (sellByDayValueIsOver(0)) {
            increaseQualityBy(3);
        } else {
            dropQualityToZero();
        }
        decreaseSellByDay();
    }

}