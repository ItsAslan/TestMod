package itsaslan.tutorialmod.items;

import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.tutorialmod.blocks.TutorialModBlocks;
import itsaslan.tutorialmod.enums.ArmorMaterials;
import itsaslan.tutorialmod.enums.ToolMaterials;
import itsaslan.tutorialmod.items.base.*;
import itsaslan.tutorialmod.lib.ModVars;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;

public class TutorialModItems {

    public static Item stellarIngot;
    public static Item stellarGem;
    public static Item stellarNugget;
    public static Item steelIngot;
    public static Item steelMix;

    public static Item stellarSword;
    public static Item stellarPickaxe;
    public static Item stellarAxe;
    public static Item stellarHoe;
    public static Item stellarShovel;

    public static ItemArmor stellarHelmet;
    public static ItemArmor stellarChestplate;
    public static ItemArmor stellarLeggings;
    public static ItemArmor stellarBoots;

    public static Item waxSeed;
    public static Item wax;

    public static Item sandPaper;
    public static Item cloth;
    public static Item emeraldMix;

    public static Item copperMix;
    public static Item copperIngot;

    public static Item infusingRod;

    public static Item blackBrick;

    public static ItemArmor infusedHelmet;
    public static ItemArmor infusedChestplate;
    public static ItemArmor infusedLeggings;
    public static ItemArmor infusedBoots;

    public static Item pickle;

    public static Item igniter;
    public static Item fuselage;
    public static Item bombCore;

    public static Item specialGrassSeed;
    public static Item specialGrassItem;
    public static Item cubeOfSpecialGrass;

    public static Item emeraldInfusedEgg;

    public static Item lithiumCube;
    public static Item uraniumIngot;
    public static Item grenade;
    public static Item dynamite;

    public static Item proton;

    public static void init()
    {

        //Armor

        stellarHelmet = new ArmorBase(ArmorMaterials.STELLARARMOR, 0, 0, "stellar");
        stellarHelmet.setUnlocalizedName("stellarHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:stellarHelmet");
        GameRegistry.registerItem(stellarHelmet, "stellarHelmet");

        stellarChestplate = new ArmorBase(ArmorMaterials.STELLARARMOR, 0, 1, "stellar");
        stellarChestplate.setUnlocalizedName("stellarChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:stellarChestplate");
        GameRegistry.registerItem(stellarChestplate, "stellarChestplate");

        stellarLeggings = new ArmorBase(ArmorMaterials.STELLARARMOR, 0, 2, "stellar");
        stellarLeggings.setUnlocalizedName("stellarLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:stellarLeggings");
        GameRegistry.registerItem(stellarLeggings, "stellarLeggings");

        stellarBoots = new ArmorBase(ArmorMaterials.STELLARARMOR, 0, 3, "stellar");
        stellarBoots.setUnlocalizedName("stellarBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:stellarBoots");
        GameRegistry.registerItem(stellarBoots, "stellarBoots");

        //-------------------------

        infusedHelmet = new ArmorBase(ArmorMaterials.INFUSEDARMOR, 0, 0, "infused");
        infusedHelmet.setUnlocalizedName("infusedHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:infusedHelmet");
        GameRegistry.registerItem(infusedHelmet, "infusedHelmet");

        infusedChestplate = new ArmorBase(ArmorMaterials.INFUSEDARMOR, 0, 1, "infused");
        infusedChestplate.setUnlocalizedName("infusedChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:infusedChestplate");
        GameRegistry.registerItem(infusedChestplate, "infusedChestplate");

        infusedLeggings = new ArmorBase(ArmorMaterials.INFUSEDARMOR, 0, 2, "infused");
        infusedLeggings.setUnlocalizedName("infusedLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:infusedLeggings");
        GameRegistry.registerItem(infusedLeggings, "infusedLeggings");

        infusedBoots = new ArmorBase(ArmorMaterials.INFUSEDARMOR, 0, 3, "infused");
        infusedBoots.setUnlocalizedName("infusedBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName("tutorialmod:infusedBoots");
        GameRegistry.registerItem(infusedBoots, "infusedBoots");

        // Items

        stellarIngot = new Item().setUnlocalizedName("stellarIngot").setCreativeTab(CreativeTabs.tabMaterials);
        stellarIngot.setTextureName(ModVars.MOD_ID + ":" + stellarIngot.getUnlocalizedName());
        GameRegistry.registerItem(stellarIngot, stellarIngot.getUnlocalizedName());

        stellarGem = new Item().setUnlocalizedName("stellarGem").setCreativeTab(CreativeTabs.tabMaterials);
        stellarGem.setTextureName((ModVars.MOD_ID + ":" + stellarGem.getUnlocalizedName()));
        GameRegistry.registerItem(stellarGem, stellarGem.getUnlocalizedName());

        sandPaper = new Item().setUnlocalizedName("sandpaper").setCreativeTab(CreativeTabs.tabMisc);
        sandPaper.setTextureName(ModVars.MOD_ID + ":" + sandPaper.getUnlocalizedName());
        GameRegistry.registerItem(sandPaper, sandPaper.getUnlocalizedName());

        stellarNugget = new Item().setUnlocalizedName("stellarNugget").setCreativeTab(CreativeTabs.tabMaterials);
        stellarNugget.setTextureName(ModVars.MOD_ID + ":" + stellarNugget.getUnlocalizedName());
        GameRegistry.registerItem(stellarNugget, stellarNugget.getUnlocalizedName());

        steelIngot = new Item().setUnlocalizedName("steelIngot").setCreativeTab(CreativeTabs.tabMaterials);
        steelIngot.setTextureName(ModVars.MOD_ID + ":" + steelIngot.getUnlocalizedName());
        GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName());

        steelMix = new Item().setUnlocalizedName("steelMix").setCreativeTab(CreativeTabs.tabMaterials);
        steelMix.setTextureName(ModVars.MOD_ID + ":" + steelMix.getUnlocalizedName());
        GameRegistry.registerItem(steelMix, steelMix.getUnlocalizedName());

        cloth = new Item().setUnlocalizedName("cloth").setCreativeTab(CreativeTabs.tabMaterials);
        cloth.setTextureName(ModVars.MOD_ID + ":" + cloth.getUnlocalizedName());
        GameRegistry.registerItem(cloth, cloth.getUnlocalizedName());

        emeraldMix = new Item().setUnlocalizedName("emeraldMix").setCreativeTab(CreativeTabs.tabMaterials);
        emeraldMix.setTextureName(ModVars.MOD_ID + ":" + emeraldMix.getUnlocalizedName());
        GameRegistry.registerItem(emeraldMix, emeraldMix.getUnlocalizedName());

        copperMix = new Item().setUnlocalizedName("copperMix").setCreativeTab(CreativeTabs.tabMaterials);
        copperMix.setTextureName(ModVars.MOD_ID + ":" + copperMix.getUnlocalizedName());
        GameRegistry.registerItem(copperMix, copperMix.getUnlocalizedName());

        copperIngot = new Item().setUnlocalizedName("copperIngot").setCreativeTab(CreativeTabs.tabMaterials);
        copperIngot.setTextureName(ModVars.MOD_ID + ":" + copperIngot.getUnlocalizedName());
        GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName());

        infusingRod = new Item().setUnlocalizedName("infusingRod").setCreativeTab(CreativeTabs.tabMisc);
        infusingRod.setTextureName(ModVars.MOD_ID + ":" + infusingRod.getUnlocalizedName());
        GameRegistry.registerItem(infusingRod, infusingRod.getUnlocalizedName());

        blackBrick = new Item().setUnlocalizedName("blackBrick").setCreativeTab(CreativeTabs.tabMaterials);
        blackBrick.setTextureName(ModVars.MOD_ID + ":" + blackBrick.getUnlocalizedName());
        GameRegistry.registerItem(blackBrick, blackBrick.getUnlocalizedName());

        pickle = new ItemFood(6, 0.5f, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("pickle");
        pickle.setTextureName(ModVars.MOD_ID + ":" + pickle.getUnlocalizedName());
        GameRegistry.registerItem(pickle, "pickle");

        emeraldInfusedEgg = new Item().setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("emeraldInfusedEgg");
        emeraldInfusedEgg.setTextureName(ModVars.MOD_ID + ":" + emeraldInfusedEgg.getUnlocalizedName());
        GameRegistry.registerItem(emeraldInfusedEgg, emeraldInfusedEgg.getUnlocalizedName());

        cubeOfSpecialGrass = new ItemDescription(EnumChatFormatting.GREEN, new String[]{"Now this is the good stuff"}).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("cubeOfSpecialGrass");
        cubeOfSpecialGrass.setTextureName(ModVars.MOD_ID + ":" + cubeOfSpecialGrass.getUnlocalizedName());
        GameRegistry.registerItem(cubeOfSpecialGrass, cubeOfSpecialGrass.getUnlocalizedName());

        lithiumCube = new PotionEffectEdible(2, 0.2f, true, new Potion[]{Potion.poison, Potion.wither, Potion.hunger, Potion.moveSpeed}, new int[]{600, 600, 600, 600}, new int[]{1, 1, 1, 2}).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("lithiumCube");
        lithiumCube.setTextureName(ModVars.MOD_ID + ":" + lithiumCube.getUnlocalizedName());
        GameRegistry.registerItem(lithiumCube, lithiumCube.getUnlocalizedName());

        uraniumIngot = new PotionEffectEdible(200, 2000.f, true, new Potion[]{Potion.damageBoost}, new int[]{10000}, new int[]{3}, EnumChatFormatting.GREEN, new String[]{"\"You don't get energy from eating Uranium;", "you just get cancer.\""}).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("uraniumIngot");
        uraniumIngot.setTextureName(ModVars.MOD_ID + ":" + uraniumIngot.getUnlocalizedName());
        GameRegistry.registerItem(uraniumIngot, uraniumIngot.getUnlocalizedName());

        grenade = new GrenadeThrowable(5).setUnlocalizedName("grenade");
        grenade.setTextureName(ModVars.MOD_ID + ":" + grenade.getUnlocalizedName());
        GameRegistry.registerItem(grenade, grenade.getUnlocalizedName());

        dynamite = new PotionEffectEdible(0, 0f, false, new Potion[]{Potion.hunger}, new int[]{1000}, new int[]{3}, EnumChatFormatting.YELLOW, new String[]{"You didn't expect", "this one to be edible huh?"}).setUnlocalizedName("dynamite").setCreativeTab(CreativeTabs.tabMisc);
        dynamite.setTextureName(ModVars.MOD_ID + ":" + dynamite.getUnlocalizedName());
        GameRegistry.registerItem(dynamite, dynamite.getUnlocalizedName());

        proton = new ItemFood(5, 0.2f, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("proton");
        proton.setTextureName(ModVars.MOD_ID + ":" + proton.getUnlocalizedName());
        GameRegistry.registerItem(proton, proton.getUnlocalizedName());

        // Tools

        stellarSword = new ItemSword(ToolMaterials.FUNNYMAT).setUnlocalizedName("stellarSword").setCreativeTab(CreativeTabs.tabCombat);
        stellarSword.setTextureName(ModVars.MOD_ID + ":" + stellarSword.getUnlocalizedName());
        GameRegistry.registerItem(stellarSword, "stellarSword");

        stellarPickaxe = new PickaxeBase(ToolMaterials.STELLARMATERIAL).setUnlocalizedName("stellarPickaxe").setCreativeTab(CreativeTabs.tabTools);
        stellarPickaxe.setTextureName(ModVars.MOD_ID + ":" + stellarPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(stellarPickaxe, "stellarPickaxe");

        stellarAxe = new AxeBase(ToolMaterials.STELLARMATERIAL).setUnlocalizedName("stellarAxe").setCreativeTab(CreativeTabs.tabTools);
        stellarAxe.setTextureName(ModVars.MOD_ID + ":" + stellarAxe.getUnlocalizedName());
        GameRegistry.registerItem(stellarAxe, "stellarAxe");

        stellarHoe = new HoeBase(ToolMaterials.STELLARMATERIAL).setUnlocalizedName("stellarHoe").setCreativeTab(CreativeTabs.tabTools);
        stellarHoe.setTextureName(ModVars.MOD_ID + ":" + stellarHoe.getUnlocalizedName());
        GameRegistry.registerItem(stellarHoe, "stellarHoe");

        stellarShovel = new ShovelBase(ToolMaterials.STELLARMATERIAL).setUnlocalizedName("stellarShovel").setCreativeTab(CreativeTabs.tabTools);
        stellarShovel.setTextureName(ModVars.MOD_ID + ":" + stellarShovel.getUnlocalizedName());
        GameRegistry.registerItem(stellarShovel, "stellarShovel");

        // Crops

        waxSeed = new ItemSeeds(TutorialModBlocks.waxCrop, Blocks.farmland).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("waxSeed");
        waxSeed.setTextureName(ModVars.MOD_ID + ":" + waxSeed.getUnlocalizedName());
        GameRegistry.registerItem(waxSeed, "waxSeed");

        wax = new ItemFood(6, 0.5f, false).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("wax");
        wax.setTextureName(ModVars.MOD_ID + ":" + wax.getUnlocalizedName());
        GameRegistry.registerItem(wax, "wax");

        specialGrassSeed = new ItemSeeds(TutorialModBlocks.specialGrassBottom, Blocks.farmland).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("specialGrassSeed");
        specialGrassSeed.setTextureName(ModVars.MOD_ID + ":" + specialGrassSeed.getUnlocalizedName());
        GameRegistry.registerItem(specialGrassSeed, specialGrassSeed.getUnlocalizedName());

        specialGrassItem = new PotionEffectEdible(6, 1.0f, false, new Potion[]{Potion.moveSlowdown, Potion.damageBoost, Potion.hunger}, new int[]{600, 600, 600}, new int[]{0, 1, 2}).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("specialGrassItem");
        specialGrassItem.setTextureName(ModVars.MOD_ID + ":" + specialGrassItem.getUnlocalizedName());
        GameRegistry.registerItem(specialGrassItem, specialGrassItem.getUnlocalizedName());

        // Bomb Items

        igniter = new Item().setUnlocalizedName("igniter").setCreativeTab(CreativeTabs.tabMisc);
        igniter.setTextureName(ModVars.MOD_ID + ":" + igniter.getUnlocalizedName());
        GameRegistry.registerItem(igniter, igniter.getUnlocalizedName());

        fuselage = new Item().setUnlocalizedName("fuselage").setCreativeTab(CreativeTabs.tabMisc);
        fuselage.setTextureName(ModVars.MOD_ID + ":" + fuselage.getUnlocalizedName());
        GameRegistry.registerItem(fuselage, fuselage.getUnlocalizedName());

        bombCore = new Item().setUnlocalizedName("bombCore").setCreativeTab(CreativeTabs.tabMisc);
        bombCore.setTextureName(ModVars.MOD_ID + ":" + bombCore.getUnlocalizedName());
        GameRegistry.registerItem(bombCore, bombCore.getUnlocalizedName());

    }

}
