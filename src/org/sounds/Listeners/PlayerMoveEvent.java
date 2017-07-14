package org.sounds.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerMoveEvent implements Listener {

    @EventHandler
    public void onMove(org.bukkit.event.player.PlayerMoveEvent e) {
        if(Util.isDisabled("PlayerMove")) {
            return;
        }
        PlayerUtil.playSound(e.getPlayer(), "PlayerMove");
    }
}
