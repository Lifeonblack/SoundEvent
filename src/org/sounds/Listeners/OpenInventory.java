package org.sounds.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class OpenInventory implements Listener {

    @EventHandler
    public void onOpenInventory(InventoryOpenEvent e) {
        Player player = (Player) e.getPlayer();
        if(Util.isDisabled("OpenInventory")) {
            return;
        }
        PlayerUtil.playSound(player, "OpenInventory");
    }

}
