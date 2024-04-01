package org.opalisplugin.util.Yml;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.opalisplugin.OpalisPlugin;

import java.io.File;
import java.io.IOException;

public class YmlConfig {
    private static File file;
    public YmlConfig(String filename) {

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

            FileConfiguration config = new YamlConfiguration().loadConfiguration(file);

        }


    }

    public File getFile(){
        return file;
    }
}
