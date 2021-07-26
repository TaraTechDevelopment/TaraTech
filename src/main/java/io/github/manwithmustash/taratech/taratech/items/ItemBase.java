package io.github.manwithmustash.taratech.taratech.items;

import io.github.manwithmustash.taratech.taratech.TaraTech;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(TaraTech.MAINTAB));
    }
}
