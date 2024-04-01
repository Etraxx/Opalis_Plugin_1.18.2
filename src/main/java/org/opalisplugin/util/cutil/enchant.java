package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class enchant implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            Player Etrax = Bukkit.getPlayerExact("Etraxx_");
            if(player == Etrax){
                ItemStack item = player.getItemInHand();

                if(item.getType() == Material.DIAMOND_SWORD){
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                    item.addEnchantment(Enchantment.DURABILITY, 3);
                    item.addEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
                    item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                    item.addEnchantment(Enchantment.KNOCKBACK, 2);
                    item.addEnchantment(Enchantment.MENDING, 1);

                }
            }
        }
        return false;
    }
}
