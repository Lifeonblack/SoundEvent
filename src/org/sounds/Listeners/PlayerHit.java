package org.sounds.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerHit implements Listener {

    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        if(!(e.getDamager() instanceof Player)) {
            return;
        }
        if(!(e.getEntity() instanceof Player)) {
            return;
        }
        if(Util.isDisabled("PlayerHit")) {
            return;
        }
        Player player = (Player) e.getEntity();
        PlayerUtil.playSound(player, "PlayerHit");
    }
}
