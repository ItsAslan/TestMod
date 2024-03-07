package itsaslan.tutorialmod.register;

import itsaslan.tutorialmod.handlers.RecipeHandler;
import itsaslan.tutorialmod.items.TutorialModItems;
import net.minecraft.item.ItemStack;

public class registerCustomRecipes
{

    public static void init()
    {
        RecipeHandler.addRecipe(new ItemStack(TutorialModItems.stellarGem), new ItemStack(TutorialModItems.wax), new ItemStack(TutorialModItems.sandPaper), new ItemStack(TutorialModItems.stellarIngot));
    }

}