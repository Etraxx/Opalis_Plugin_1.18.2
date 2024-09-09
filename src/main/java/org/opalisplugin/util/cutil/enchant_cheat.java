package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class enchant_cheat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            Player Etrax = Bukkit.getPlayerExact("Etraxx_");
            player.getItemInHand();
            ItemStack item = player.getItemInHand();
            if(item.getType() == Material.DIAMOND_SWORD){
                item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 255);
                item.addUnsafeEnchantment(Enchantment.DURABILITY, 255);
                item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 255);
                item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 255);
                item.addUnsafeEnchantment(Enchantment.MENDING, 255);
                item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 255);
                item.addUnsafeEnchantment(Enchantment.MENDING, null);
            }
        }
        return false;
    }
}
