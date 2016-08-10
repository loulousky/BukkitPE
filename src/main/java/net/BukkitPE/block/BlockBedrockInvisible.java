package net.BukkitPE.block;

import net.BukkitPE.item.Item;
import net.BukkitPE.utils.BlockColor;


public class BlockBedrockInvisible extends BlockSolid {

    public BlockBedrockInvisible() {
        this(0);
    }

    public BlockBedrockInvisible(int meta) {
        super(0);
    }

    @Override
    public int getId() {
        return INVISIBLE_BEDROCK;
    }

    @Override
    public String getName() {
        return "Invisible Bedrock";
    }

    @Override
    public double getHardness() {
        return -1;
    }

    @Override
    public double getResistance() {
        return 18000000;
    }

    @Override
    public boolean isBreakable(Item item) {
        return false;
    }

    @Override
    public BlockColor getColor() {
        return BlockColor.TRANSPARENT_BLOCK_COLOR;
    }

}