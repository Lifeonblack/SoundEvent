package org.sounds.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class WorldChange implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        if(!e.getFrom().getWorld().equals(e.getTo().getWorld())) {
            if(Util.isDisabled("WorldChange")) {
                return;
            }
            PlayerUtil.playSound(e.getPlayer(), "WorldChange");
        }
    }
}
