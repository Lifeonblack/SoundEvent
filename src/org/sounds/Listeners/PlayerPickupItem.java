package org.sounds.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerPickupItem implements Listener {

    @EventHandler
    public void onPickup(PlayerPickupItemEvent e) {
        if(Util.isDisabled("PickupItem")) {
            return;
        }
        PlayerUtil.playSound(e.getPlayer(), e.getItem().getLocation(), "PickupItem");
    }
}
