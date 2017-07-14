package org.sounds.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.sounds.SoundEvent;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class HelpCommand extends AbstractCommand {

    public HelpCommand(CommandSender sender) {
        super(sender);
    }

    @Override
    public void execute(CommandSender sender, Command cmd, String label, String[] args) {
        if(!isAuthorize()) {
            playNoPermissionSound(getPlayer());
            sendMessage(Util.colorize("&cYou have no permission to do that"));
            return;
        }
        sendMessage(Util.colorize("&bSoundEvent v" + SoundEvent.getInstance().getVersion()));
        sendMessage(Util.colorize("&3/" + label + " reload &7: to reload config"));
        sendMessage(Util.colorize("&3/" + label + " disableAll &7: to disable all sound events"));
        return;
    }
}
