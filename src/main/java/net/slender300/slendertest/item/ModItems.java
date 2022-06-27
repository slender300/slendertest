package net.slender300.slendertest.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.slender300.slendertest.SlenderMod;

public class ModItems {

    
    public static final Item GLOCK = registerItem("glock", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item) {
      return Registry.register(Registry.ITEM, new Identifier(SlenderMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
      SlenderMod.LOGGER.debug("Registring Mod Items for " + SlenderMod.MOD_ID);
    }
}
