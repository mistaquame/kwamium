package net.mistaquame.kwamium.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mistaquame.kwamium.block.ModBlocks;
import net.mistaquame.kwamium.kwamium;

public class modCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, kwamium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KWAMIUM_MOD = CREATIVE_MODE_TABS.register("kwamium_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KWAMIUM.get()))
                    .title(Component.translatable("creativetab.kwamium_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KWAMIUM.get());
                        pOutput.accept(ModBlocks.KWAMIUM_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
