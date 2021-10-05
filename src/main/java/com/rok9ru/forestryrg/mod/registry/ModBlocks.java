package com.rok9ru.forestryrg.mod.registry;

import com.rok9ru.forestryrg.mod.ForestryRG;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BLOCK_APATITE = new Block(FabricBlockSettings
            .of(Material.AMETHYST)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(2.0f, 15)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    );

    public static final Block BEE_NEST_MEADOWS = new BeehiveBlock(FabricBlockSettings.of(Material.WOOD, MapColor.YELLOW).strength(0.3F).sounds(BlockSoundGroup.WOOD));



    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(ForestryRG.MOD_ID, "block_apatite"), BLOCK_APATITE);
        Registry.register(Registry.BLOCK, new Identifier(ForestryRG.MOD_ID, "bee_nest_meadows"), BEE_NEST_MEADOWS);
        
        //register("bee_nest", new BeehiveBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.YELLOW).strength(0.3F).sounds(BlockSoundGroup.WOOD)));

    }
}
