package net.apocalypse.origins.block;

import net.apocalypse.origins.Apocalypse_Origins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block X_BLOCK = registerBlock("x_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block Y_BLOCK = registerBlock("y_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block Z_BLOCK = registerBlock("z_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block UNBUDDING_AMETHYST = registerBlock("gob_complainer",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    public static final Block HEXALTAR = registerBlock("hexaltar",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)));
    public static final Block HEXALTAR2 = registerBlock("hexaltar2",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)));
    public static final Block HEXALTAR3 = registerBlock("hexaltar3",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)));
    public static final Block WORLD = registerBlock("world",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)));
    public static final Block WORLD_HELL = registerBlock("world_hell",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)));
    public static final Block WORLD_END = registerBlock("world_end",
            new Block(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Apocalypse_Origins.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Apocalypse_Origins.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Apocalypse_Origins.LOGGER.info("Registering blocks for "+Apocalypse_Origins.MOD_ID);
    }
}
