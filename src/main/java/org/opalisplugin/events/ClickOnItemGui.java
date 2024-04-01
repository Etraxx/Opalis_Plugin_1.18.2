package org.opalisplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ClickOnItemGui implements Listener {
    @EventHandler
    public void onCLickOnIteminGUI(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();
        ItemStack item = event.getCurrentItem();


        String ReportingGUI = "§4Report un joueur";

        String reportingValue = "";

        if (item.getItemMeta().getDisplayName() == "§4Logiciel de triche") {
            reportingValue = "Logiciel de triche";
            event.getWhoClicked().closeInventory();
        }
        if (item.getItemMeta().getDisplayName() == "§3Xray") {
            reportingValue = "XRAY";
            event.getWhoClicked().closeInventory();
        }
        if (item.getItemMeta().getDisplayName() == "§dInsultes / Spam") {
            reportingValue = "Spam / Insulte";
            event.getWhoClicked().closeInventory();
        }
        if (item.getItemMeta().getDisplayName() == "§2TP Kill") {
            reportingValue = "Tp Kill";
            event.getWhoClicked().closeInventory();
        }

        if (item.getItemMeta().getDisplayName() == "§4Fermer") {
            event.getWhoClicked().closeInventory();
        }

        if (reportingValue != "") {
            for (OfflinePlayer operator : Bukkit.getOperators()) {
                operator.getPlayer().sendMessage("§6§lADMIN REPORT >>> " + ((Player) event.getWhoClicked())
                        .getDisplayName() + " vient de report " + event.getInventory().getItem(13)
                        .getItemMeta().getDisplayName().split(" ")[3] + " pour " + reportingValue);

            }


        }

    }
}
