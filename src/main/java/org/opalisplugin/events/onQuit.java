package org.opalisplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuit implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {

        event.setQuitMessage(ChatColor.GRAY + "[" + ChatColor.RED + "<" + ChatColor.GRAY + "] " + ChatColor.RED + event.getPlayer().getDisplayName());
    }
}
