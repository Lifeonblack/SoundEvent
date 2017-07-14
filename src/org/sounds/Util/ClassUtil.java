package org.sounds.Util;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.sounds.Listeners.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raymart on 7/13/2017.
 */
public class ClassUtil {

    public static void addListeners(PluginManager pm, Plugin plugin) {
        for(Listener listener : listeners()) {
            pm.registerEvents(listener, plugin);
        }
    }

    private static List<Listener> listeners() {
        List<Listener> listener = new ArrayList<>();
        listener.add(new OpenInventory());
        listener.add(new CloseInventory());
        listener.add(new BlockPlace());
        listener.add(new PlayerBreak());
        listener.add(new PlayerDropItem());
        listener.add(new PlayerPickupItem());
        listener.add(new WorldChange());
        listener.add(new PlayerMoveEvent());
        listener.add(new PlayerJoin());
        listener.add(new PlayerLeave());
        listener.add(new InventoryClick());
        listener.add(new PlayerHit());
        listener.add(new EntityHit());
        listener.add(new PlayerCommand());
        return listener;
    }
}
