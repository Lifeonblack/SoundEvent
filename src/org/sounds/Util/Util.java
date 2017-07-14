package org.sounds.Util;

import org.bukkit.ChatColor;
import org.sounds.SoundEvent;

/**
 * Created by Raymart on 7/13/2017.
 */
public class Util {

    public static String colorize(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public static String removeColor(String msg) {
        return ChatColor.stripColor(msg);
    }

    public static boolean isInt(String msg) {
        try {
            Integer.parseInt(msg);
        }catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static boolean isDisabled(String eventName) {
        return !SoundEvent.getInstance().getConfig().getBoolean(eventName + ".enable");
    }
}
