package com.warpedcakez.pissmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;


public class Pissmod implements ModInitializer {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("pissmod", "general"),
            () -> new ItemStack(Blocks.COBBLESTONE));

    @Override
    public void onInitialize() {
        RegisterItems.register();
    }
}
