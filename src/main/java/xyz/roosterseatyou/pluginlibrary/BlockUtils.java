package xyz.roosterseatyou.pluginlibrary;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class BlockUtils {
    public static Block[] getSurroundingBlocks(Block block) {
        return new Block[]{
                block.getRelative(1, 0, 0),
                block.getRelative(-1, 0, 0),
                block.getRelative(0, 0, 1),
                block.getRelative(0, 0, -1),
                block.getRelative(0, 1, 0),
                block.getRelative(0, -1, 0)
        };
    }

    public static Block[] getSurroundingBlocks(Block block, int radius) {
        Block[] blocks = new Block[(radius * 2 + 1) * (radius * 2 + 1)];
        int index = 0;
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                blocks[index++] = block.getRelative(x, 0, z);
            }
        }
        return blocks;
    }

    public static Block getBlockLookedAt(Player player, int range) {
        return player.getTargetBlock(null, range);
    }
}
