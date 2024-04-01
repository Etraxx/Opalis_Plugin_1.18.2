package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            Player Etrax = Bukkit.getPlayerExact("Etraxx_");
            if(player == Etrax){
                player.setFoodLevel(20);
                player.setSaturation(20);
            }else{
                player.sendMessage(ChatColor.WHITE + "Unknown command. Type \"/help\" for help");
            }
            return true;
        }
        return false;
    }
}
