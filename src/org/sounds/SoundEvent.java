package org.sounds;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.sounds.Util.ClassUtil;

/**
 * Created by Raymart on 7/13/2017.
 */
public class SoundEvent extends JavaPlugin {
    private static SoundEvent instance;
    private String version = "";

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        PluginManager pm = getServer().getPluginManager();
        ClassUtil.addListeners(pm, this);
        version += getDescription().getVersion();
    }

    @Override
    public void onDisable() {
    }

    public static SoundEvent getInstance() {
        return instance;
    }

    public String getVersion() {
        return version;
    }

}
