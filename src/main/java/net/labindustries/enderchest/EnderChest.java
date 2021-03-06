package net.labindustries.enderchest;

import net.labindustries.enderchest.commands.EnderChestCommand;
import net.labindustries.enderchest.events.EnderChestInventoryCloseEvent;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderChest extends JavaPlugin implements Listener {


    private static EnderChest plugin;



    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new EnderChestInventoryCloseEvent(), this);

        getCommand("enderchest").setExecutor(new EnderChestCommand(this));

    }

    @Override
    public void onDisable(){
        // Plugin shutdown logic
    }
}
