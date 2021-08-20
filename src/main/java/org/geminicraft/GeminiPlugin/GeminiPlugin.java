package org.geminicraft.GeminiPlugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public class GeminiPlugin extends JavaPlugin implements Listener {

    private static volatile GeminiPlugin plugin;

    private static String version;

    private static String name;

    private static File source;

    private static File data;


    public static GeminiPlugin getInstance() {
       if (plugin == null) {
           try {
               plugin = JavaPlugin.getPlugin(GeminiPlugin.class);
           } catch (final IllegalStateException exception) {
               Bukkit.getLogger().severe("Couldn't load this library. We should disable all associated plugins.");
           }
       }
       return plugin;
    }

    @Override
    public void onEnable() {
        System.out.println("Loaded library");
    }

    @Override
    public void onDisable() {
        System.out.println("Disabled library");
    }
}
