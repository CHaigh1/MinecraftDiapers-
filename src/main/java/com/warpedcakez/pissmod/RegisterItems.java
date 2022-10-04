package com.warpedcakez.pissmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final FabricItem FABRIC_ITEM = new FabricItem(new FabricItemSettings().group(Pissmod.ITEM_GROUP));
    public static final ArmorMaterial PAPER_DIAPER_MATERIAL = new PaperDiaperArmor();
    public static final Item PAPER_DIAPER_LEGGINGS = new ArmorItem(PAPER_DIAPER_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Pissmod.ITEM_GROUP));
    public static final ArmorMaterial IRON_DIAPER_MATERIAL = new IronPaperDiaperArmor();
    public static final Item IRON_DIAPER_LEGGINGS = new ArmorItem(IRON_DIAPER_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Pissmod.ITEM_GROUP));
    public static final ArmorMaterial GOLD_DIAPER_MATERIAL = new GoldPaperDiaperArmor();
    public static final Item GOLD_DIAPER_LEGGINGS = new ArmorItem(GOLD_DIAPER_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Pissmod.ITEM_GROUP));
    public static final ArmorMaterial DIAMOND_DIAPER_MATERIAL = new DiamondPaperDiaperArmor();
    public static final Item DIAMOND_DIAPER_LEGGINGS = new ArmorItem(DIAMOND_DIAPER_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Pissmod.ITEM_GROUP));
    public static final ArmorMaterial NETHERITE_DIAPER_MATERIAL = new NetheritePaperDiaperArmor();
    public static final Item NETHERITE_DIAPER_LEGGINGS = new ArmorItem(NETHERITE_DIAPER_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Pissmod.ITEM_GROUP));

    public static final StatusEffect Pee = new PeeStatusEffect();

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("pissmod", "fabric_item"), FABRIC_ITEM);
        Registry.register(Registry.ITEM, new Identifier("pissmod", "paper_diaper_leggings"), PAPER_DIAPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("pissmod", "iron_diaper_leggings"), IRON_DIAPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("pissmod", "gold_diaper_leggings"), GOLD_DIAPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("pissmod", "diamond_diaper_leggings"), DIAMOND_DIAPER_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("pissmod", "netherite_diaper_leggings"), NETHERITE_DIAPER_LEGGINGS);

        Registry.register(Registry.STATUS_EFFECT, new Identifier("pissmod", "pee"), Pee);
    }
}
