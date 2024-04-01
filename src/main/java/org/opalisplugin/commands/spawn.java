package org.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;

            Location spawn = new Location(player.getWorld(), 0.0, 81, 0.0);
            player.teleport(spawn);
            player.sendMessage(ChatColor.WHITE + "Vous avez été Téléporté au spawn");
            return true;
        }
        return false;
    }
}
