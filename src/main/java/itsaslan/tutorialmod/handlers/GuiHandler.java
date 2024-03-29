package itsaslan.tutorialmod.handlers;

import cpw.mods.fml.common.network.IGuiHandler;
import itsaslan.tutorialmod.containers.*;
import itsaslan.tutorialmod.gui.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{

    public static final int TEST_GUI = 1;
    public static final int TEST_CRAFTING_GUI = 2;
    public static final int KILN_GUI = 3;
    public static final int BOMB_GUI = 4;
    public static final int BOMBTABLEGUI = 5;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {

        TileEntity tileEntity = world.getTileEntity(x, y, z);

        switch(ID)
        {
            case TEST_GUI:
                return new ContainerGeneric(player.inventory, tileEntity);
            case TEST_CRAFTING_GUI:
                return new CraftingContainer(player.inventory, tileEntity);
            case KILN_GUI:
                return new KilnContainer(player.inventory, tileEntity);
            case BOMB_GUI:
                return new BombContainer(player.inventory, tileEntity);
            case BOMBTABLEGUI:
                return new BombTableContainer(player.inventory, tileEntity);
            default:
                return null;
        }

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {

        TileEntity tileEntity = world.getTileEntity(x, y, z);

        switch(ID)
        {
            case TEST_GUI:
                return new TestGui(player.inventory, tileEntity, world.getBlock(x, y, z));
            case TEST_CRAFTING_GUI:
                return new TestCraftingGui(player.inventory, tileEntity, world.getBlock(x, y, z));
            case KILN_GUI:
                return new KilnGui(player.inventory, tileEntity, world.getBlock(x, y, z));
            case BOMB_GUI:
                return new BombGui(player.inventory, tileEntity, world.getBlock(x, y, z));
            case BOMBTABLEGUI:
                return new BombTableGui(player.inventory, tileEntity, world.getBlock(x, y, z));
            default:
                return null;
        }

    }
}
