package org.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if(player.isOp()){
                player.setAllowFlight(true);
                player.setFlying(true);
                player.sendMessage(ChatColor.AQUA + "FLY > " + ChatColor.RED + "Vous pouvez volez à partir de maintenant");
                return true;
            } else {
                player.sendMessage(ChatColor.RED + "Vous n'avez pas les permissions requises pour effectuer cette commande !");
            }
        }
        return false;
    }
}
