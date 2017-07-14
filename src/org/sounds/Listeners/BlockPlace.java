package org.sounds.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class BlockPlace implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        if(Util.isDisabled("BlockPlace")) {
            return;
        }
        PlayerUtil.playSound(e.getPlayer(), e.getBlock().getLocation(), "BlockPlace");
    } 
}
