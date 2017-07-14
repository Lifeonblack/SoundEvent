package org.sounds.Util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.sounds.SoundEvent;

/**
 * Created by Raymart on 7/13/2017.
 */
public class PlayerUtil {

    public static void playSound(Player player, String path) {
        FileConfiguration config = SoundEvent.getInstance().getConfig();
        if(player.hasPermission("sound.play." + path) || (player.hasPermission("sound.play.*"))) {
            Sound s = Sound.valueOf(config.getString("NoPermission").toUpperCase());
            double v = config.getDouble("NoPermission");
            double p = config.getDouble("NoPermission");
            if(Util.isDisabled("NoPermission")) {
                return;
            }
            player.playSound(player.getLocation(), s, (float)v, (float)p);
            return;
        }
        Sound sound = Sound.valueOf(config.getString(path + ".sound").toUpperCase());
        double volume = config.getDouble(path + ".volume");
        double pitch = config.getDouble(path + ".pitch");
        player.playSound(player.getLocation(), sound, (float) volume, (float) pitch);
    }

    public static void playSound(String playerName, String path) {
        Player player = Bukkit.getPlayer(playerName);
        if(player == null) {
            return;
        }
        playSound(player, path);
    }

    public static void playSound(Player player, Location location, String path) {
        FileConfiguration config = SoundEvent.getInstance().getConfig();
        if(player.hasPermission("sound.play." + path) || (player.hasPermission("sound.play.*"))) {
            Sound s = Sound.valueOf(config.getString("NoPermission").toUpperCase());
            double v = config.getDouble("NoPermission");
            double p = config.getDouble("NoPermission");
            if(Util.isDisabled("NoPermission")) {
                return;
            }
            player.playSound(location, s, (float)v, (float)p);
            return;
        }
        Sound sound = Sound.valueOf(config.getString(path + ".sound").toUpperCase());
        double volume = config.getDouble(path + ".volume");
        double pitch = config.getDouble(path + ".pitch");
        player.playSound(location, sound, (float) volume, (float) pitch);
    }
}
