package org.sounds.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.sounds.Util.SoundUtil;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/14/2017.
 */
public class EnableCommand extends AbstractCommand {

    public EnableCommand(CommandSender sender) {
        super(sender);
    }

    @Override
    public void execute(CommandSender sender, Command cmd, String label, String[] args) {
        if(!isAuthorize()) {
            playNoPermissionSound(getPlayer());
            sendMessage(Util.colorize("&cYou have no permission to do that"));
            return;
        }
        SoundUtil.enableAllEvents();
        sendMessage(Util.colorize("&aSuccessfully enabled all sounds"));
        return;
    }
}
