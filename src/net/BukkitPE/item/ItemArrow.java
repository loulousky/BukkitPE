package net.BukkitPE.item;

/**
 * author: MagicDroidX
 * BukkitPE Project
 */
public class ItemArrow extends Item {

    public ItemArrow() {
        this(0, 1);
    }

    public ItemArrow(Integer meta) {
        this(meta, 1);
    }

    public ItemArrow(Integer meta, int count) {
        super(ARROW, meta, count, "Arrow");
    }

}