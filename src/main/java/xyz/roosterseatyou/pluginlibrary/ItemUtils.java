package xyz.roosterseatyou.pluginlibrary;

import org.bukkit.event.block.BlockDamageAbortEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

import java.util.Collection;

public class ItemUtils {

    /**
     * @param items Collection of ItemStacks
     * @return a random item from the collection
     */
    public static ItemStack randomItem(Collection<ItemStack> items) {
        if (items.isEmpty()) return null;
        return items.toArray(new ItemStack[0])[(int) (Math.random() * items.size())];
    }

    /**
     * @param item ItemStack to apply damage to
     * @param damage amount of damage to apply
     */
    public static void applyDamage(ItemStack item, int damage) {
        Damageable meta = (Damageable) item.getItemMeta();
        meta.setDamage(meta.getDamage() + damage);
        item.setItemMeta(meta);
    }
}
