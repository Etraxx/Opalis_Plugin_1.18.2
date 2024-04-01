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

        PlayerProfile pf = Opalis.getPlayers().getPlayer(player);
        PlayerProfile kf = Opalis.getPlayers().getPlayer(Killer);

        if(Killer == null) {
            event.setDeathMessage(player.getDisplayName() + ChatColor.RED + " est mort ");


            pf.getConfig().getConfig().set("killstreak", 0);
            pf.getConfig().getConfig().set("prime", 500);
        }else{
            event.setDeathMessage(ChatColor.RED + Killer.getDisplayName() + ChatColor.RED +  " vient de tuer " + player.getDisplayName());


            pf.getConfig().getConfig().set("killstreak", 0);
            pf.getConfig().getConfig().set("prime", 500);

            int Killstreak = kf.getConfig().getConfig().getInt("killstreak");
            pf.getConfig().getConfig().set("killstreak", Killstreak + 1);
            int prime = kf.getConfig().getConfig().getInt("prime");
            kf.getConfig().getConfig().set("prime", prime * 2);
        }

        event.setKeepLevel(true);
    }
}
