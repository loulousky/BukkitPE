package net.BukkitPE.block;

import net.BukkitPE.item.ItemTool;
import net.BukkitPE.utils.BlockColor;

/**
 * Created on 2015/11/25 by xtypr.
 * Package net.BukkitPE.block in project BukkitPE .
 */
public class BlockStairsSandstone extends BlockStairs {
    public BlockStairsSandstone() {
        this(0);
    }

    public BlockStairsSandstone(int meta) {
        super(meta);
    }

    @Override
    public int getId() {
        return SANDSTONE_STAIRS;
    }

    @Override
    public double getHardness() {
        return 0.8;
    }

    @Override
    public double getResistance() {
        return 4;
    }

    @Override
    public int getToolType() {
        return ItemTool.TYPE_PICKAXE;
    }

    @Override
    public String getName() {
        return "Sandstone Stairs";
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.SAND_BLOCK_COLOR;
    }
}
