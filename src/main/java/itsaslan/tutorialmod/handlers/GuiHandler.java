package itsaslan.tutorialmod.handlers;

import cpw.mods.fml.common.network.IGuiHandler;
import itsaslan.tutorialmod.containers.ContainerGeneric;
import itsaslan.tutorialmod.gui.TestGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{

    public static final int TEST_GUI = 1;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {

        TileEntity tileEntity = world.getTileEntity(x, y, z);

        switch(ID)
        {
            case TEST_GUI:
                return new ContainerGeneric(player.inventory, tileEntity);
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
            default:
                return null;
        }

    }
}
