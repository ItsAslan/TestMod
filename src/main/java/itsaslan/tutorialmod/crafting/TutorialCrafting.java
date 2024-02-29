package itsaslan.tutorialmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.tutorialmod.blocks.TutorialModBlocks;
import itsaslan.tutorialmod.items.TutorialModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TutorialCrafting {

    public static void init()
    {

        GameRegistry.addSmelting(TutorialModBlocks.stellarOre, new ItemStack(TutorialModItems.stellarIngot), 10.0f);
        //GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(TutorialModItems.stellarIngot), 10.0f);
        GameRegistry.addRecipe(new ItemStack(TutorialModBlocks.blockOfStellarOre), new Object[]{"III", "III", "III", 'I', TutorialModItems.stellarIngot});

        //GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarGem), new Object[]{"III", "IKI", "III", 'I', TutorialModItems.stellarIngot, 'K', Items.nether_star});
        GameRegistry.addShapelessRecipe(new ItemStack(TutorialModItems.stellarGem), new Object[]{TutorialModItems.wax, TutorialModItems.sandPaper, TutorialModItems.stellarIngot});

        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarHelmet), new Object[]{"III", "I I", 'I', TutorialModItems.stellarGem});
        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarChestplate), new Object[]{"I I", "III", "III", 'I', TutorialModItems.stellarGem});
        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarLeggings), new Object[]{"III", "I I", "I I", 'I', TutorialModItems.stellarGem});
        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarBoots), new Object[]{"I I", "I I", 'I', TutorialModItems.stellarGem});

        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarSword), new Object[]{"I", "I", "K", 'I', TutorialModItems.stellarIngot, 'K', Items.stick});
        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarAxe), new Object[]{"II", "IK", " K", 'I', TutorialModItems.stellarIngot, 'K', Items.stick});
        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarPickaxe), new Object[]{"III", " K ", " K ", 'I', TutorialModItems.stellarIngot, 'K', Items.stick});
        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarShovel), new Object[]{"I", "K", "K", 'I', TutorialModItems.stellarIngot, 'K', Items.stick});
        GameRegistry.addRecipe(new ItemStack(TutorialModItems.stellarHoe), new Object[]{"II", " K", " K", 'I', TutorialModItems.stellarIngot, 'K', Items.stick});

        GameRegistry.addShapelessRecipe(new ItemStack(TutorialModItems.sandPaper, 16), new Object[]{Blocks.sand, Blocks.sand, Items.paper});

    }

}