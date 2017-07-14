package org.sounds.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerBreak implements Listener {

    @EventHandler
    public void playerBreak(BlockBreakEvent e) {
        Player player = e.getPlayer();
        if(Util.isDisabled("BlockBreak")) {
            return;
        }
        PlayerUtil.playSound(player, e.getBlock().getLocation(), "BlockBreak");
    }
}
