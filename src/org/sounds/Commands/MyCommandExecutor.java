package org.sounds.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.sounds.Util.Util;

/**
 * Created by Raymart on 7/13/2017.
 */
public class MyCommandExecutor implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        AbstractCommand help = new HelpCommand(sender);
        AbstractCommand disableall = new DisableCommand(sender);
        AbstractCommand reload = new ReloadCommand(sender);
        AbstractCommand enableall = new EnableCommand(sender);
        if(cmd.getName().equalsIgnoreCase("soundevent")) {
            if(args.length == 0) {
                help.execute(sender, cmd, label, args);
                return true;
            }
            if(args.length > 0) {
                if(args[0].equalsIgnoreCase("disableall")) {
                    disableall.execute(sender, cmd, label, args);
                    return true;
                }
                if(args[0].equalsIgnoreCase("reload")) {
                    reload.execute(sender, cmd, label, args);
                    return true;
                }
                if(args[0].equalsIgnoreCase("enableall")) {
                    enableall.execute(sender, cmd, label, args);
                }
                sender.sendMessage(Util.colorize("&cUnknown Command"));
                return true;
            }
            return true;
        }
        return false;
    }
}
