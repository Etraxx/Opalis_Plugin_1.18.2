package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class  alert implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings){

        if(commandSender instanceof Player){

            Player player = (Player) commandSender;
            Player Etrax = Bukkit.getPlayerExact("Etraxx_");
            if(player.isOp() && player == Etrax){

                if(strings.length == 0){
                    player.sendMessage("La commande est : /alert <message>");
                }
                if(strings.length >= 1){
                    StringBuilder stringBuilder = new StringBuilder();
                    for(String part : strings){
                        stringBuilder.append(part + " ");
                    }
                    Bukkit.broadcastMessage("§c[" + "Annonce" + "]"+ " " + stringBuilder.toString());
                }

                return true;
            }else{
                player.sendMessage(ChatColor.WHITE + "Vous n'avez pas les permissions requises pour effectuer cette commande !");
            }
        }
        return false;
    }
}
