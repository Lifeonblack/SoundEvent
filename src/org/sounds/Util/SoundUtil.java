package org.sounds.Util;

import org.sounds.SoundEvent;

import java.util.Set;

/**
 * Created by Raymart on 7/13/2017.
 */
public class SoundUtil {

    public static void disableAllEvents() {
        Set<String> sets = SoundEvent.getInstance().getConfig().getKeys(false);
        for(String set : sets) {
            SoundEvent.getInstance().getConfig().set(set + ".enable", Boolean.valueOf(false));
        }
        SoundEvent.getInstance().saveConfig();
    }

    public static void enableAllEvents() {
        Set<String> sets = SoundEvent.getInstance().getConfig().getKeys(false);
        for(String set : sets) {
            SoundEvent.getInstance().getConfig().set(set + ".enable", Boolean.valueOf(true));
        }
        SoundEvent.getInstance().saveConfig();
    }

    public static void enableEvent(String eventName) {
        SoundEvent.getInstance().getConfig().set(eventName + ".enable", Boolean.valueOf(true));
    }

    public static void disableEvent(String eventName) {
        SoundEvent.getInstance().getConfig().set(eventName + ".enable", Boolean.valueOf(false));
    }
}
