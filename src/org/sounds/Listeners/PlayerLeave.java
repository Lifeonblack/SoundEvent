package org.sounds.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerLeave implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        if(Util.isDisabled("PlayerLeave")) {
            return;
        }
        PlayerUtil.playSound(e.getPlayer(), "PlayerLeave");
    }
}
