package org.opalisplugin;

import org.bukkit.Chunk;
import org.bukkit.block.Block;
import org.opalisplugin.util.PlayerManager.PlayerManager;

import java.util.ArrayList;

public class Opalis {
    public static ArrayList<Integer> returnAllGlassPostion() {
        ArrayList<Integer> Slots = new ArrayList<>();
        Slots.add(0);
        Slots.add(1);
        Slots.add(7);
        Slots.add(8);
        Slots.add(9);
        Slots.add(16);
        Slots.add(17);
        Slots.add(35);
        Slots.add(36);
        Slots.add(37);
        Slots.add(43);
        Slots.add(44);
        return Slots;
    }

    public static ArrayList<Block> getBlocksOfAChunk(final Chunk chunk) {
        final ArrayList<Block> blocks = new ArrayList<>();
        final int minX = chunk.getX() << 4;
        final int minZ = chunk.getZ() << 4;
        final int maxX = minX | 15;
        final int maxY = chunk.getWorld().getMaxHeight();
        final int maxZ = minZ | 15;

        for (int x = minX; x <= maxX; ++x) {
            for (int y = 0; y <= maxY; ++y) {
                for (int z = minZ; z <= maxZ; ++z) {
                    blocks.add(chunk.getBlock(x, y, z));
                }
            }
        }return blocks;
    }


    public static PlayerManager playerManager = new PlayerManager();
    public static PlayerManager getPlayers() {
        return playerManager;
    }
    static boolean Is_Chat_Muted = false;
    public static boolean getMutedChat() {
        return Is_Chat_Muted;
    }
    public static void setMutingChat(boolean MutedChat) {
        Is_Chat_Muted = MutedChat;
    }
}
