package org.opalisplugin.util.cutil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Furnace implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            Player Etrax = Bukkit.getPlayerExact("Etraxx_");
            if(player == Etrax){

                player.getItemInHand();
                ItemStack item = player.getItemInHand();

                if(item.getType()== Material.SAND) {
                    player.getItemInHand().setType(Material.GLASS);
                }
                if(item.getType()== Material.COBBLESTONE) {
                    player.getItemInHand().setType(Material.STONE);
                }
                if(item.getType()== Material.DIAMOND_ORE) {
                    player.getItemInHand().setType(Material.DIAMOND);
                }
                if(item.getType()== Material.GOLD_ORE) {
                    player.getItemInHand().setType(Material.GOLD_INGOT);
                }
                if(item.getType()== Material.IRON_ORE) {
                    player.getItemInHand().setType(Material.IRON_INGOT);
                }
                if(item.getType()== Material.COAL_ORE) {
                    player.getItemInHand().setType(Material.COAL);
                }
                if(item.getType()== Material.POTATO) {
                    player.getItemInHand().setType(Material.BAKED_POTATO);
                }
                if(item.getType()== Material.REDSTONE_ORE) {
                    player.getItemInHand().setType(Material.REDSTONE);
                }
                if(item.getType()== Material.EMERALD_ORE) {
                    player.getItemInHand().setType(Material.EMERALD);
                }
                if(item.getType()== Material.NETHER_QUARTZ_ORE) {
                    player.getItemInHand().setType(Material.QUARTZ);
                }
                if(item.getType()== Material.BEEF) {
                    player.getItemInHand().setType(Material.COOKED_BEEF);
                }
                if(item.getType()== Material.CHICKEN) {
                    player.getItemInHand().setType(Material.COOKED_CHICKEN);
                }
                if(item.getType()== Material.SALMON) {
                    player.getItemInHand().setType(Material.COOKED_SALMON);
                }
                if(item.getType()== Material.RABBIT){
                    player.getItemInHand().setType(Material.COOKED_RABBIT);
                }
                if(item.getType()== Material.PORKCHOP){
                    player.getItemInHand().setType(Material.COOKED_PORKCHOP);
                }
                if(item.getType()== Material.MUTTON){
                    player.getItemInHand().setType(Material.COOKED_MUTTON);
                }
                if(item.getType()== Material.CLAY){
                    player.getItemInHand().setType(Material.BRICK);
                }
                if(item.getType()== Material.NETHERRACK){
                    player.getItemInHand().setType(Material.NETHER_BRICK);
                }
                if(item.getType()== Material.GOLDEN_AXE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_HOE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_PICKAXE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_SWORD){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_BOOTS){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_LEGGINGS){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_CHESTPLATE){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_HELMET){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }
                if(item.getType()== Material.GOLDEN_HORSE_ARMOR){
                    player.getItemInHand().setType(Material.GOLD_NUGGET);
                }

                return true;
            }
        }
        return false;
    }
}
