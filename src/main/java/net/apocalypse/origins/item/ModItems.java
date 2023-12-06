package net.apocalypse.origins.item;

import net.apocalypse.origins.Apocalypse_Origins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SYRINGE_LIVING = registerItem("syringe_living", new Item(new FabricItemSettings()));
    public static final Item SYRINGE_AQUATIC = registerItem("syringe_aquatic", new Item(new FabricItemSettings()));
    public static final Item SYRINGE_ARTHROPOD = registerItem("syringe_arthropod", new Item(new FabricItemSettings()));
    public static final Item SYRINGE_CREEPER = registerItem("syringe_creeper", new Item(new FabricItemSettings()));
    public static final Item SYRINGE_END = registerItem("syringe_end", new Item(new FabricItemSettings()));
    public static final Item SYRINGE_NETHER = registerItem("syringe_nether", new Item(new FabricItemSettings()));
    public static final Item SYRINGE_UNDEAD = registerItem("syringe_undead", new Item(new FabricItemSettings()));
    public static final Item SYRINGE_ACTIVE = registerItem("syringe_active", new Item(new FabricItemSettings()));
    public static final Item STABILIZER = registerItem("stabilizer", new Item(new FabricItemSettings()));
    public static final Item ANALYZER = registerItem("analyzer", new Item(new FabricItemSettings()));
    public static final Item MUTAGENS = registerItem("mutagens", new Item(new FabricItemSettings()));
    public static final Item RNABACKUP = registerItem("rnabackup", new Item(new FabricItemSettings()));
    public static final Item ANTIMUTAGENS = registerItem("antimutagens", new Item(new FabricItemSettings()));
    public static final Item GENELOCK = registerItem("genelock", new Item(new FabricItemSettings()));
    public static final Item GENERASER = registerItem("generaser", new Item(new FabricItemSettings()));
    public static final Item MIRROR = registerItem("mirror", new Item(new FabricItemSettings()));
    public static final Item REGULATOR = registerItem("regulator", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
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
        entries.add(REGULATOR);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Apocalypse_Origins.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Apocalypse_Origins.LOGGER.info("Registering items for "+Apocalypse_Origins.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
