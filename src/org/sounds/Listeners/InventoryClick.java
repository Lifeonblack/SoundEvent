package org.sounds.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class InventoryClick implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if(Util.isDisabled("InventoryClick")) {
            return;
        }
        Player player = (Player) e.getWhoClicked();
        PlayerUtil.playSound(player, "InventoryClick");
    }
}
