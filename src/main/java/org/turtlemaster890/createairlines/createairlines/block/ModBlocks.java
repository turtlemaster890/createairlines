package org.turtlemaster890.createairlines.createairlines.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.turtlemaster890.createairlines.createairlines.Createairlines;
import org.turtlemaster890.createairlines.createairlines.item.ModCreativeTab;
import org.turtlemaster890.createairlines.createairlines.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Createairlines.MODID);

    public static final RegistryObject<Block> BELT_COVER = registerBlock("belt_cover", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).requiresCorrectToolForDrops()), ModCreativeTab.CREATE_AIRLINES_TAB);

    public static final RegistryObject<Block> BELT_XRAY_TUNNEL = registerBlock("xray_tunnel", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).requiresCorrectToolForDrops()), ModCreativeTab.CREATE_AIRLINES_TAB);

    public static final RegistryObject<Block> METAL_DETECTOR_PART = registerBlock("metal_detector_part", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS).requiresCorrectToolForDrops()), ModCreativeTab.CREATE_AIRLINES_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
