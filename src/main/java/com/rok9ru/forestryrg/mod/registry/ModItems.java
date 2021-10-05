package com.rok9ru.forestryrg.mod.registry;

import com.rok9ru.forestryrg.mod.ForestryRG;
import com.rok9ru.forestryrg.mod.core.UniversalMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ITEM_GEAR_COPPER = new Item(new Item.Settings().group(ForestryRG.ITEM_GROUP));

    public static final Item WOVEN_SILK = new Item(new Item.Settings().group(ForestryRG.ITEM_GROUP));

    public static final Item ITEM_APATITE = new Item(new Item.Settings().group(ForestryRG.ITEM_GROUP));
    public static final BlockItem BLOCK_APATITE = new BlockItem(ModBlocks.BLOCK_APATITE, new Item.Settings().group(ForestryRG.ITEM_GROUP));



    public static final BlockItem BEE_NEST_MEADOWS = new BlockItem(ModBlocks.BEE_NEST_MEADOWS, new Item.Settings().group(ForestryRG.ITEM_GROUP));


    //armor
    public static final ArmorMaterial APIARIST_ARMOR_MATERIAL = new UniversalMaterial("apiarist_armor", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F,0.0F, WOVEN_SILK);

    public static final Item APIARIST_ARMOR_HELMET = new ArmorItem(APIARIST_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ForestryRG.ITEM_GROUP));
    public static final Item APIARIST_ARMOR_CHESTPLATE = new ArmorItem(APIARIST_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ForestryRG.ITEM_GROUP));
    public static final Item APIARIST_ARMOR_LEGGINGS = new ArmorItem(APIARIST_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ForestryRG.ITEM_GROUP));
    public static final Item APIARIST_ARMOR_BOOTS = new ArmorItem(APIARIST_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ForestryRG.ITEM_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "gear_copper"), ITEM_GEAR_COPPER);
        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "woven_silk"), WOVEN_SILK);

        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "apatite"), ITEM_APATITE);

        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "block_apatite"), BLOCK_APATITE);
        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "bee_nest_meadows"), BEE_NEST_MEADOWS);



        //armor
        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "apiarist_helmet"), APIARIST_ARMOR_HELMET);
        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "apiarist_chestplate"), APIARIST_ARMOR_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "apiarist_leggings"), APIARIST_ARMOR_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(ForestryRG.MOD_ID, "apiarist_boots"), APIARIST_ARMOR_BOOTS);



    }
}
