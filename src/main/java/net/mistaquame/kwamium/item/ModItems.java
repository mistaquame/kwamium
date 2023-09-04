package net.mistaquame.kwamium.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mistaquame.kwamium.kwamium;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, kwamium.MOD_ID);

    public static final RegistryObject<Item> KWAMIUM = ITEMS.register("kwamium",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
