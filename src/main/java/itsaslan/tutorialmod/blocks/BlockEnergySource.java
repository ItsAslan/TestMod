package itsaslan.tutorialmod.blocks;

import itsaslan.tutorialmod.tileentity.energy.energySourceTileEntity;
import itsaslan.tutorialmod.tileentity.energy.energyStorageTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEnergySource extends Block
{
    protected BlockEnergySource(Material material) {
        super(material);
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);

        if (!world.isRemote) {
            energySourceTileEntity tile = (energySourceTileEntity) world.getTileEntity(x, y, z);
            tile.connectOrCreateNetwork();
        }

    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {

        if (!world.isRemote) {
            energySourceTileEntity tile = (energySourceTileEntity) world.getTileEntity(x, y, z);
            tile.disconnectNetwork();
        }

        super.breakBlock(world, x, y, z, block, meta);
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new energySourceTileEntity();
    }
}