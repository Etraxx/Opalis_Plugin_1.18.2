package org.opalisplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.opalisplugin.commands.*;
import org.opalisplugin.events.*;

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
        getCommand("feed").setExecutor(new feed()); // A ajouter cutil
        getCommand("furnace").setExecutor(new Furnace()); // cutil
        getCommand("seeinv").setExecutor(new Seeinv()); // cutil
        getCommand("ec").setExecutor(new Ender()); // cutil
        getCommand("fly").setExecutor(new Fly()); // cutil
        getCommand("heal").setExecutor(new heal());
        getCommand("craft").setExecutor(new craft());
        getCommand("credits").setExecutor(new credits());
        getCommand("alert").setExecutor(new alert());
        getCommand("a").setExecutor(new org.opalisplugin.util.cutil.alert());
        getServer().getPluginManager().registerEvents(new ClickOnItemGui(), this);
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
