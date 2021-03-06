package net.BukkitPE.event.level;

import net.BukkitPE.event.Cancellable;
import net.BukkitPE.event.HandlerList;
import net.BukkitPE.level.Level;

/**
 * author: funcraft
 * BukkitPE Project
 */
public class ThunderChangeEvent extends WeatherEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final boolean to;

    public static HandlerList getHandlers() {
        return handlers;
    }

    public ThunderChangeEvent(Level level, boolean to) {
        super(level);
        this.to = to;
    }

    /**
     * Gets the state of thunder that the world is being set to
     *
     * @return true if the thunder is being set to start, false otherwise
     */
    public boolean toThunderState() {
        return to;
    }

}
