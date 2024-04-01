package org.opalisplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.opalisplugin.util.ItemBuilder;

import java.util.ArrayList;

public class CreditsGUI {
    public static Inventory creadits() {
        Inventory inventory = Bukkit.createInventory(null, 45, "Credits");

        ItemStack owner = new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("null").setName("null").toItemStack();

        ArrayList<ItemStack> dev = new ArrayList<ItemStack>();
        dev.add(new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("Etraxx_").setName("Etraxx_").toItemStack());
        dev.add(new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("KikalDonuts").setName("KikalDonuts").toItemStack());

        ArrayList<ItemStack> build = new ArrayList<ItemStack>();
        build.add(new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("null").setName("null").toItemStack());

        ArrayList<ItemStack> admin = new ArrayList<ItemStack>();
        admin.add(new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("null").setName("null").toItemStack());

        ArrayList<ItemStack> modo = new ArrayList<ItemStack>();
        modo.add(new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("null").setName("null").toItemStack());

        inventory.setItem(8, new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("SCHOOL_SHOOT3R").setName(ChatColor.DARK_PURPLE + "OWNER").toItemStack());
        inventory.setItem(17, new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("4l0l").setName(ChatColor.GREEN + "DEV").toItemStack());
        inventory.setItem(26, new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("bigboihere").setName(ChatColor.GRAY + "BUILDER").toItemStack());
        inventory.setItem(35, new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("BakedFingers").setName(ChatColor.RED + "ADMIN").toItemStack());
        inventory.setItem(44, new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 3).setSkullOwner("OneSexySlimeBoi").setName(ChatColor.DARK_RED + "MOD").toItemStack());

        return inventory;
    }
}
