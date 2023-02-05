package org.turtlemaster890.createairlines.createairlines.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.turtlemaster890.createairlines.createairlines.Createairlines;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Createairlines.MODID);

    public static final RegistryObject<Item> SUITCASE = ITEMS.register("suitcase",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.CREATE_AIRLINES_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
