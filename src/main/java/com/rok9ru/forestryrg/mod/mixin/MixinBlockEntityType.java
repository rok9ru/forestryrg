package com.rok9ru.forestryrg.mod.mixin;

import com.rok9ru.forestryrg.mod.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.mojang.datafixers.types.Type;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toCollection;


//@Mixin(BlockEntityType.Builder.class)
//public class MixinBlockEntityType <T extends BlockEntity>{

    //public static final BlockEntityType<BeehiveBlockEntity>  BEEHIVE = create("beehive",BlockEntityType.Builder.create(BeehiveBlockEntity::new, Blocks.BEE_NEST, Blocks.BEEHIVE));

/*    @Mutable
    @Shadow @Final private BlockEntityType.BlockEntityFactory<? extends T> factory;

    @Mutable
    @Shadow @Final private Set<Block> blocks;

    @Inject(at = @At("HEAD"), method = "<init>")
    private void Builder(BlockEntityType.BlockEntityFactory<? extends T> factory, Set<Block> blocks, CallbackInfo ci) {
        this.factory = factory;
        this.blocks = blocks;
    }*/


//}


@Mixin(BlockEntityType.Builder.class)
public class MixinBlockEntityType<T> {

    @Mutable
    @Shadow @Final
    Set<Block> blocks;

    @Inject(at = @At("HEAD"), method = "build")
    private void build(Type<?> type, CallbackInfoReturnable cir) {
      //  this.blocks = this.blocks.;

        this.blocks = new HashSet<Block>(this.blocks);

        boolean found = false;
        for (var b : this.blocks){
            if(b == Blocks.BEE_NEST){
                found = true;
                break;
            }
        }

        if(found){
            this.blocks.add(ModBlocks.BEE_NEST_MEADOWS);
        }

      //  System.out.println("This line is printed by an example mod mixin!");


    }
}

