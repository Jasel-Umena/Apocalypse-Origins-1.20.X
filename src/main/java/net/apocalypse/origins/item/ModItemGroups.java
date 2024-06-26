package net.apocalypse.origins.item;

import net.apocalypse.origins.Apocalypse_Origins;
import net.apocalypse.origins.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.apocalypse.origins.item.ModItems.*;

public class ModItemGroups {
    public static final ItemGroup APOCALYPSE_ORIGINS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Apocalypse_Origins.MOD_ID, "apocalypse_origins"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.apocalypse_origins"))
                    .icon(() -> new ItemStack(ModItems.SYRINGE_ACTIVE)).entries((displayContext, entries) -> {
                        entries.add(SYRINGE);
                        entries.add(SYRINGE_REINFORCED);
                        entries.add(SYRINGE_LIVING);
                        entries.add(SYRINGE_AQUATIC);
                        entries.add(SYRINGE_ARTHROPOD);
                        entries.add(SYRINGE_CREEPER);
                        entries.add(SYRINGE_END);
                        entries.add(SYRINGE_NETHER);
                        entries.add(SYRINGE_UNDEAD);
                        entries.add(SYRINGE_ACTIVE);
                        entries.add(STABILIZER);
                        entries.add(ANALYZER);
                        entries.add(MUTAGENS);
                        entries.add(RNABACKUP);
                        entries.add(ANTIMUTAGENS);
                        entries.add(GENELOCK);
                        entries.add(GENERASER);
                        entries.add(MIRROR);
                        entries.add(MIRROR_NETHER);
                        entries.add(REGULATOR);
                        entries.add(RETURN_SHARD);
                        entries.add(CRYSTALLINE_EMBLEM);
                        entries.add(LUCKY_GEMSTONE);
                        entries.add(SANDS_FOCUS);
                        entries.add(SIGHT_FOCUS);
                        entries.add(SUNDERING_FOCUS);
                        entries.add(SEETHING_FOCUS);
                        entries.add(SCRYING_FOCUS);
                        entries.add(SAGACITY_FOCUS);
                        entries.add(SEAS_FOCUS);
                        entries.add(SKIES_FOCUS);
                        entries.add(SMITING_FOCUS);
                        entries.add(UNNAMED_FOCUS);
                        entries.add(DDD_FOCUS);
                        entries.add(FFF_FOCUS);
                        entries.add(SSS_FOCUS);

                        entries.add(ModBlocks.X_BLOCK);
                        entries.add(ModBlocks.Y_BLOCK);
                        entries.add(ModBlocks.Z_BLOCK);
                        entries.add(ModBlocks.UNBUDDING_AMETHYST);
                        entries.add(ModBlocks.HEXALTAR);
                        entries.add(ModBlocks.HEXALTAR2);
                        entries.add(ModBlocks.HEXALTAR3);
                        entries.add(ModBlocks.WORLD);
                        entries.add(ModBlocks.WORLD_HELL);
                        entries.add(ModBlocks.WORLD_END);
                    }).build());
    public static void registerItemGroups() {}
}
