package net.labindustries.enderchest.commands;

import net.labindustries.enderchest.EnderChest;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class EnderChestCommand implements CommandExecutor {


    public EnderChestCommand(EnderChest enderChest) {

    }


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {


        if (sender instanceof Player player){
            Location location = player.getLocation();
            player.openInventory(player.getEnderChest());


        }

        return false;
    }
}
