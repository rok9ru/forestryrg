package com.rok9ru.forestryrg.mod.registry;


import net.fabricmc.fabric.mixin.lookup.BlockEntityTypeAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

import static java.util.stream.Collectors.toCollection;

public class ModEntity {


    public static void registerEntities(){
       // ((MutableRegistry<Block>)Registry.BLOCK)


       // BlockEntityType<?> entity = Registry.BLOCK_ENTITY_TYPE.get(new Identifier("beehive"));
       // assert entity != null;

       // BlockEntityTypeAccessor e = (BlockEntityTypeAccessor) entity;

       // e.getBlocks().add(ModBlocks.BEE_NEST_MEADOWS);

        //b//locks.
        //BlockEntityType.BEEHIVE.
       // Registry.


       // if()
/*

        BlockEntityType<?> entity = Registry.BLOCK_ENTITY_TYPE.get(new Identifier("beehive"));

       // MutableRegistry mutableRegistry = (MutableRegistry)Registry.BLOCK_ENTITY_TYPE;
       // mutableRegistry
        //mutableRegistry.s

        try {
            BlockEntityType<BeehiveBlockEntity> bh = (BlockEntityType<BeehiveBlockEntity>) entity;
        }
        catch (ClassCastException ignored) {
            return;
        }
*/



        /*if(bh instanceof BlockEntityType<BeehiveBlockEntity>){

        }*/



       // BEEHIVE = create("beehive", BlockEntityType.Builder.create(BeehiveBlockEntity::new, Blocks.BEE_NEST, Blocks.BEEHIVE));
    }


/*
    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
     *//*   if (builder.blocks.isEmpty()) {
            LOGGER.warn((String)"Block entity type {} requires at least one valid block to be defined!", (Object)id);
        }*//*

        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return (BlockEntityType) Registry.register(Registry.BLOCK_ENTITY_TYPE, (String)id, builder.build(type));
    }*/

}
