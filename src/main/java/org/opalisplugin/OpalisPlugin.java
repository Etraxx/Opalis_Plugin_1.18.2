package org.opalisplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.opalisplugin.commands.*;
import org.opalisplugin.commands.Ender;
import org.opalisplugin.commands.Fly;
import org.opalisplugin.commands.Furnace;
import org.opalisplugin.commands.Seeinv;
import org.opalisplugin.commands.alert;
import org.opalisplugin.commands.craft;
import org.opalisplugin.commands.feed;
import org.opalisplugin.commands.heal;
import org.opalisplugin.commands.spawn;
import org.opalisplugin.events.*;
import org.opalisplugin.util.cutil.*;

import java.util.List;

public final class OpalisPlugin extends JavaPlugin {

    private static OpalisPlugin instance;

    @Override
    public void onEnable() {

        instance = this;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("[  <===================>  ===> OPALIS <===  <===================>  ]");
        System.out.println("                       OPALIS PLUGIN INITIALISÉ                     ");
        System.out.println("[ <=======================> Dev: Etraxx_ <=======================> ]");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        getCommand("spawn").setExecutor(new spawn());
        getCommand("feed").setExecutor(new feed());
        getCommand("furnace").setExecutor(new Furnace());
        getCommand("seeinv").setExecutor(new Seeinv());
        getCommand("ec").setExecutor(new Ender());
        getCommand("fly").setExecutor(new Fly());
        getCommand("heal").setExecutor(new heal());
        getCommand("craft").setExecutor(new craft());
        getCommand("credits").setExecutor(new credits());
        getCommand("alert").setExecutor(new alert());
        getCommand("a").setExecutor(new org.opalisplugin.util.cutil.alert());
        getCommand("c").setExecutor(new org.opalisplugin.util.cutil.craft());
        getCommand("g").setExecutor(new god());
        getCommand("ug").setExecutor(new ungod());
        getCommand("e").setExecutor(new enchant()); // à finir
        getCommand("ech").setExecutor(new enchant_cheat()); // à finir
        getCommand("en").setExecutor(new org.opalisplugin.util.cutil.Ender());
        getCommand("fd").setExecutor(new org.opalisplugin.util.cutil.feed());
        getCommand("fl").setExecutor(new org.opalisplugin.util.cutil.Fly());
        getCommand("ufl").setExecutor(new unfly());
        getCommand("fu").setExecutor(new org.opalisplugin.util.cutil.Furnace()); // à finir
        getCommand("gmc").setExecutor(new gamemodeC());
        getCommand("gmsp").setExecutor(new gamemodeSP());
        getCommand("gms").setExecutor(new gamemodeS());
        getCommand("gma").setExecutor(new gamemodeA());
        // getServer().getPluginManager().registerEvents(new ClickOnItemGui(), this);
        getServer().getPluginManager().registerEvents(new onDead(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new onQuit(), this);
        getServer().getPluginManager().registerEvents(new onRG(), this);
        getServer().getPluginManager().registerEvents(new PlayerSendMessage(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return super.onTabComplete(sender, command, alias, args);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return super.onCommand(sender, command, label, args);

    }


    public static OpalisPlugin getInstance() {
        return instance;
    }
}
