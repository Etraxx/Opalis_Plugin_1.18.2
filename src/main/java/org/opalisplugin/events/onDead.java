package org.opalisplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.opalisplugin.Opalis;
import org.opalisplugin.util.PlayerManager.PlayerProfile;

public class onDead implements Listener {
    @EventHandler
    public void onDead(PlayerDeathEvent event) {
        String message = "";
        Player player = event.getEntity().getPlayer();
        Player Killer = event.getEntity().getKiller();

        if(Killer == null) {
            event.setDeathMessage(player.getDisplayName() + ChatColor.RED + " est mort ");
        }else{
            event.setDeathMessage(ChatColor.RED + Killer.getDisplayName() + ChatColor.RED +  " vient de tuer " + player.getDisplayName());
        }
        event.setKeepLevel(true);
    }
}
