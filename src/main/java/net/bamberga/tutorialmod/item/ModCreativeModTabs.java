package net.bamberga.tutorialmod.item;

import net.bamberga.tutorialmod.TutorialMod;
import net.bamberga.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);
        public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
                () ->  CreativeModeTab.builder().icon(() -> new ItemStack(ModItemClass.SAPPHIRE.get()))
                        .title(Component.translatable("creativetab.tutorial_tab"))
                        .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItemClass.SAPPHIRE.get());
                            output.accept(ModItemClass.RAW_SAPPHIRE.get());
                            output.accept(Items.DIAMOND);
                            output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                            output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                            output.accept(ModItemClass.METAL_DETECTOR.get());

                            output.accept(ModBlocks.SAPPHIRE_ORE.get());
                            output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                            output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                            output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                            output.accept(ModBlocks.SOUND_BLOCK.get());
                        })
                        .build());
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
