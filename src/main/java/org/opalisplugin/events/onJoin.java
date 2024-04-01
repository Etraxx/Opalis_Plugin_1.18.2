package org.opalisplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.opalisplugin.Opalis;
import org.opalisplugin.util.Grades;
import org.opalisplugin.util.PlayerManager.PlayerProfile;

public class onJoin implements Listener {
    @EventHandler

    public void OnJoin(PlayerJoinEvent event) {

        String grade = "";

        String faction = "";

        Player player = event.getPlayer();

        Player Etrax = Bukkit.getPlayer("Etraxx_");

        if(player == Etrax) {
            grade = Grades.Developpeur();
        }
        Opalis.getPlayers().connectPlayer(player, grade, faction);

        Location spawn = new Location(event.getPlayer().getWorld(), 0.5, 33, 0.5);
        event.getPlayer().teleport(spawn);

        PlayerProfile pp = Opalis.getPlayers().getPlayer(player);

        String name = pp.getFaction() + " " + pp.getGrade() + " " + pp.getPseudo();

        player.setDisplayName(name);
        player.setCustomName(name);
        player.setPlayerListName(name);

        event.setJoinMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + ">" + ChatColor.GRAY + "] " + Opalis.getPlayers().getPlayer(player).getFaction() + " " + Opalis.getPlayers().getPlayer(player).getGrade() + " " + Opalis.getPlayers().getPlayer(player).getPseudo());
    }
}
