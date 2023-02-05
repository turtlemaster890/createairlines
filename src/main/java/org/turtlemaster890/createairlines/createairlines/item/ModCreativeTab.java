package org.turtlemaster890.createairlines.createairlines.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab CREATE_AIRLINES_TAB = new CreativeModeTab("createairlinestab") {
        @Override
        public ItemStack makeIcon() {return new ItemStack(ModItems.SUITCASE.get());
        }
    };
}
