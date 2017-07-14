package org.sounds.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.sounds.SoundEvent;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class ReloadCommand extends AbstractCommand {
    public ReloadCommand(CommandSender sender) {
        super(sender);
    }

    @Override
    public void execute(CommandSender sender, Command cmd, String label, String[] args) {
        if(!isAuthorize()) {
            sendMessage(Util.colorize("&cYou have no permission to do that"));
            return;
        }
        SoundEvent.getInstance().reloadConfig();
        sendMessage(Util.colorize("&aReload the config successfully"));
        return;
    }
}
