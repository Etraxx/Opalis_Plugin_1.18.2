package org.opalisplugin.util.PlayerManager;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.opalisplugin.util.Grades;
import org.opalisplugin.util.Yml.PlayerConfig;

import java.util.ArrayList;

public class PlayerProfile {
    private static String pseudo = "";
    private static String Grade = "";

    private static String Faction = "";

    private static String CompleteName = Faction + " " + Grade + " " + pseudo;
    private static String defCompleteName = Faction + " " + Grade + " " + pseudo;
    private static Boolean isNicked = false;
    private static Boolean isFreeze = false;

    private static PlayerConfig config;

    private static Player player = null;

    public static ArrayList<String> tpDemands;

    public PlayerProfile(Player input_player, String input_grade, String input_faction) {
        player = input_player;
        Grade = input_grade;
        Faction = input_faction;

        pseudo = player.getName();

        config = new PlayerConfig("players/" + player.getUniqueId().toString());
    }

    public PlayerConfig getConfig() { return config; }

    public String getPseudo() {
        return pseudo;
    }
    public String getGrade() {
        return Grade;
    }
    public String getFaction() {
        return Faction;
    }
    public String getCompleteName() {
        return CompleteName;
    }

    public boolean isNicked() {return isNicked; }
    public boolean isFreezed() {return isFreeze; }

    public void Nick(Player sender, String faction, String name, String grade) {

        player.sendMessage(ChatColor.RED + "Nom > " + ChatColor.RESET+ " Vous avez été renommé");
        pseudo = name;
        Grade = grade;
        Faction = faction;
        actualizeCompleteName();
    }
    public void deNick() {
        player.setDisplayName(defCompleteName);
    }

    public void Froze() {
        isFreeze = true;
    }

    public void unFroze() {
        isFreeze = true;
    }

    public void addTPDemand(String teleported) {
        tpDemands.add(teleported);
    }

    public void cancelTPDemand(String teleported) {
        int i = 0;
        for(String tp : tpDemands) {
            if(tp == teleported) {
                tpDemands.remove(i);
            }
            i += 1;
        }
    }

    public boolean getSpecificTPDemand(String teleported) {
        Boolean value = false;
        for(String tp : tpDemands) {
            if(tp == teleported) {
                value = true;
            }
        }
        return value;
    }

    public void nick(String newPseudo) {
        pseudo = newPseudo;
        Grade = Grades.Joueur();
        Faction = Grades.Faction();
        actualizeCompleteName();
        player.setDisplayName(CompleteName);
    }

    public void actualizeCompleteName() {
        CompleteName = Faction + " " + Grade + " " + pseudo;
    }


    public Player getPlayer() {
        return player;
    }
}
