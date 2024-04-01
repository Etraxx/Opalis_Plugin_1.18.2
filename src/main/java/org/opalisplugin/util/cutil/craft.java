package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class craft implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            Player Etrax = Bukkit.getPlayerExact("Etraxx_");

            if(player == Etrax){
                Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, "Craft");
                player.openInventory(inv);
            }else{
                player.sendMessage(ChatColor.WHITE + "Unknown command. Type \"/help\" for help");
            }
        }
        return false;
    }
}
