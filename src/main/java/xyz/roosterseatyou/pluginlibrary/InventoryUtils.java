package xyz.roosterseatyou.pluginlibrary;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class InventoryUtils {
    public static boolean isHolding(Player player, ItemStack item) {
        return player.getInventory().getItemInMainHand().isSimilar(item);
    }


}
