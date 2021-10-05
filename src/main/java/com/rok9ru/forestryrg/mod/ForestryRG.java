package com.rok9ru.forestryrg.mod;

import com.rok9ru.forestryrg.mod.registry.ModBlocks;
import com.rok9ru.forestryrg.mod.registry.ModEntity;
import com.rok9ru.forestryrg.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPool;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ForestryRG implements ModInitializer {
    //Loot Table Generator https://misode.github.io/loot-table/
    //Additional Info https://minecraft.fandom.com/wiki/Loot_table
    //Fabric Versions https://fabricmc.net/versions.html
    //Crafting Recipe Generator: https://crafting.thedestruc7i0n.ca/

    //Mixin Cheatsheet https://github.com/2xsaiko/mixin-cheatsheet/blob/master/README.md

    //https://github.com/raphydaphy/MultiBlockAPI
    //https://github.com/TechReborn/Energy

    public static final String MOD_ID = "forestryrg";


    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.ITEM_APATITE));



    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModEntity.registerEntities();
    }


}
