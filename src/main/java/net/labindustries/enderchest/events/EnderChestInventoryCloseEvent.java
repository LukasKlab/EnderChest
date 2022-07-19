package net.labindustries.enderchest.events;

import net.labindustries.enderchest.EnderChest;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;

public class EnderChestInventoryCloseEvent implements Listener {

    private EnderChest plugin;

    public EnderChestInventoryCloseEvent() {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEnderChestInventoryClose(InventoryCloseEvent event) {
        if (!event.getView().getTopInventory().getType().equals(InventoryType.ENDER_CHEST)) return;
        Player player = (Player) event.getPlayer();
        Location location = player.getLocation();
        player.playSound(location, Sound.BLOCK_ENDER_CHEST_CLOSE, 2, 1);


    }
}
