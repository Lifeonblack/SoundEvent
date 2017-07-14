package org.sounds.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerDropItem implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        if(Util.isDisabled("DropItem")) {
            return;
        }
        PlayerUtil.playSound(e.getPlayer(), e.getItemDrop().getLocation(), "DropItem");
    }
}
