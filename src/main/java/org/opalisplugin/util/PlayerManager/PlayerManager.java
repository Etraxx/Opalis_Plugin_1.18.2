package org.opalisplugin.util.PlayerManager;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class PlayerManager {

    public static ArrayList<PlayerProfile> profiles = new ArrayList<PlayerProfile>( );

    public void connectPlayer(Player player, String grade, String faction) {
        profiles.add(new PlayerProfile(player, grade, faction));
    }

    public PlayerProfile getPlayer(Player player) {
        PlayerProfile playerProfile = null;
        int i3 = 0;
        for(int i4 = 0; i4<profiles.size();i4 += 1) {
            if(profiles.get(i3).getPlayer() == player) {
                playerProfile = profiles.get(i3);
            }
        }
        i3 += 1;
        return playerProfile;
    }

    public boolean isRegistered(Player player) {
        boolean isRegistered = false;
        int i3 = 0;
        for(int i4 = 0; i4<profiles.size();i4 += 1) {
            if(profiles.get(i3).getPlayer() == player) {
                isRegistered = true;
            }
        }
        i3 += 1;
        return isRegistered;
    }
}
