package io.github.manwithmustash.taratech.taratech.util;

import io.github.manwithmustash.taratech.taratech.TaraTech;
import io.github.manwithmustash.taratech.taratech.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TaraTech.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TaraTech.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> FERUM_DUST = ITEMS.register("ferum_dust", ItemBase::new);
    public static final RegistryObject<Item> AURUM_DUST = ITEMS.register("aurum_dust", ItemBase::new);
    public static final RegistryObject<Item> IMPURE_CARBON = ITEMS.register("impure_carbon", ItemBase::new);
    //Blocks
    public static final RegistryObject<Block> GENERATOR_BLOCK = BLOCKS.register("generator_block", GeneratorBlock::new);


    //BlockItems
    public static final RegistryObject<BlockItem> GENERATOR =
}
