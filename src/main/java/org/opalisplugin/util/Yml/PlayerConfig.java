package org.opalisplugin.util.Yml;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.opalisplugin.OpalisPlugin;
import org.opalisplugin.util.Grades;

import java.io.File;
import java.io.IOException;

public class PlayerConfig {
    private static File file;
    private static FileConfiguration config;
    public PlayerConfig(String filename) {

        if(!OpalisPlugin.getInstance().getDataFolder().exists()) {
            OpalisPlugin.getInstance().getDataFolder().mkdir();
        }

        file = new File(OpalisPlugin.getInstance().getDataFolder(), filename + ".yml");

        if(!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        if(!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            config = new YamlConfiguration().loadConfiguration(file);



            config.addDefault("money", 500);
            config.addDefault("grade", Grades.Joueur());
            config.addDefault("killstreak", 0);
            config.addDefault("prime", 500);
            saveConfig();

        }


    }

    public FileConfiguration getConfig(){
        return config;
    }

    public void saveConfig() {
        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
