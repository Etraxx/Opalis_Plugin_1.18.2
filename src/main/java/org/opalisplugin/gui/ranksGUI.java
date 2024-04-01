package org.opalisplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ranksGUI {
    public static Inventory rankGui(Player player) {
        Inventory inv = Bukkit.createInventory(null, 45);

        return inv;

    }
}
