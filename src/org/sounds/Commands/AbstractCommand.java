package org.sounds.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Raymart on 7/13/2017.
 */
public abstract class AbstractCommand {

    private CommandSender sender;

    public AbstractCommand(CommandSender sender) {
        this.sender = sender;;
    }

    public void sendMessage(String message) {
        sender.sendMessage(message);
    }

    public boolean isAuthorize() {
        return sender.hasPermission("soundevent.admin");
    }

    public boolean isSenderPlayer() {
        return sender instanceof Player;
    }

    public boolean isSenderConsole() {
        return sender instanceof ConsoleCommandSender;
    }

    public boolean isSenderRemoteConsole() {
        return sender instanceof RemoteConsoleCommandSender;
    }

    public ConsoleCommandSender getConsole() {
        return Bukkit.getConsoleSender();
    }

    public abstract void execute(CommandSender sender, Command cmd, String label, String[] args);
}
