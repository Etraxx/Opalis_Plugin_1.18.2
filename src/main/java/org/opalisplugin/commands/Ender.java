package org.opalisplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ender implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            if(player.isOp()) {
                player.openInventory(player.getEnderChest());
            }else{
                player.sendMessage(ChatColor.WHITE + "Vous n'avez pas les permissions requises pour effectuer cette commande !");
            }



            return true;
        }
        return false;
    }
}
