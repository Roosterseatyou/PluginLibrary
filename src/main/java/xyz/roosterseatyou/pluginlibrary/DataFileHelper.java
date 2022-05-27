package xyz.roosterseatyou.pluginlibrary;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataFileHelper {
    public String fileName;
    public String filePath;
    private static File file;
    private static YamlConfiguration data;
    private Plugin plugin;

    public DataFileHelper(String fileName, String filePath, Plugin plugin) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.plugin = plugin;
        file = new File(filePath + fileName);
        data = YamlConfiguration.loadConfiguration(file);
    }

    public boolean dataContainsPlayer(Player player) {
        return data.contains(player.getUniqueId().toString());
    }

    public void setData(Player player, String key, Object value) {
        data.set(player.getUniqueId().toString() + "." + key, value);
    }

    public Object getData(Player player, String key) {
        return data.get(player.getUniqueId().toString() + "." + key);
    }

    public void saveData() {
        try {
            data.save(file);
        } catch (IOException e) {
            plugin.getLogger().severe("Could not save data to data file " + fileName + "! Check the error below:");
            e.printStackTrace();
        }
    }

    public void saveInventory(Player player, Inventory inventory) {
        setData(player, "inventory", inventory);
    }

    public Inventory loadInventory(Player player) {
        return (Inventory) getData(player, "inventory");
    }
}
