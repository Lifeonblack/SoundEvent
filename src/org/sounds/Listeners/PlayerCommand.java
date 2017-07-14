package org.sounds.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;
import org.sounds.Util.PlayerUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerCommand implements Listener {

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        if(e.isCancelled()) {
            return;
        }
        if(Util.isDisabled("CommandUse")) {
            return;
        }
        PlayerUtil.playSound(e.getPlayer(), "CommandUse");
        String msg = e.getMessage().split(" ")[0];
        HelpTopic helpTopic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
        if(helpTopic == null) {
            if(Util.isDisabled("UnknownCommandUse")) {
                return;
            }
            PlayerUtil.playSound(e.getPlayer(), "UnknownCommandUse");
        }
    }
}
