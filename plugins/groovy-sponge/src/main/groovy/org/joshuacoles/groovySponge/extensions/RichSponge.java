package org.joshuacoles.groovySponge.extensions;

import com.flowpowered.math.vector.Vector3d;
import ninja.leaping.configurate.ConfigurationNode;
import org.spongepowered.api.Game;
import org.spongepowered.api.GameRegistry;
import org.spongepowered.api.block.BlockLoc;
import org.spongepowered.api.block.BlockProperty;
import org.spongepowered.api.block.BlockSnapshot;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.event.GameEvent;
import org.spongepowered.api.event.block.BlockEvent;
import org.spongepowered.api.event.block.BlockRedstoneUpdateEvent;
import org.spongepowered.api.text.message.Message;
import org.spongepowered.api.text.message.Messages;
import org.spongepowered.api.world.Location;

import java.util.ArrayList;

public class RichSponge {
    //EVENT

    public static BlockState getState(BlockEvent self) {
        return self.getBlock().getState();
    }

    public static BlockSnapshot getSnapshot(BlockEvent self) {
        return self.getBlock().getSnapshot();
    }

    public static GameRegistry getRegistry(GameEvent self) {
        return self.getGame().getRegistry();
    }

    public static boolean getChangedState(BlockRedstoneUpdateEvent self) {
        return self.getNewSignalStrength() == 0 || self.getOldSignalStrength() == 0;
    }

    //MESSAGE

    public static String stripFormatting(Message message) {
        return Messages.stripCodes(message.toLegacy());
    }

    //CONFIG

    @SuppressWarnings("unchecked")
    public static <T extends ConfigurationNode> T getAt(T self, Object index) {
        return (T) self.getNode(index);
    }

    public static <T> T call(ConfigurationNode self, Class<T> clazz) {
        return clazz.cast(self.getValue());
    }

    //MISC

    public static Object getAt(BlockState self, String index) {
        return self.getPropertyValue(index).get();
    }

    //LOCATION
    public static ArrayList<Location> surrounding(Location self) {
        ArrayList<Location> ret = new ArrayList<Location>();

        ret.add(self.add(1, 0, 0));
        ret.add(self.add(0, 1, 0));
        ret.add(self.add(0, 0, 1));

        ret.add(self.add(-1, 0, 0));
        ret.add(self.add(0, -1, 0));
        ret.add(self.add(0, 0, -1));

        return ret;
    }

}
