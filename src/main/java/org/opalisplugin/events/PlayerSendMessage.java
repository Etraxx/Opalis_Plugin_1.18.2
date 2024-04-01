package org.opalisplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.opalisplugin.Opalis;

public class PlayerSendMessage implements Listener {
    @EventHandler
    public void onTalk(PlayerChatEvent event) {

        Player player = event.getPlayer();
        if (!player.isOp() && Opalis.getMutedChat()) {
            event.setCancelled(true);
            player.sendMessage("Le chat est mute, désolé de la gène, votre message n'a pas été envoyé ...");
        }

        String name = player.getDisplayName();


        if (!player.isOp()) {
            event.setFormat(name + " >> " + ChatColor.RESET + event.getMessage());

        } else {
            event.setFormat(name + " >> " + ChatColor.BOLD + ChatColor.RED + event.getMessage());
        }
    }
}
