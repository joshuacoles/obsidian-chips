package org.joshuacoles.obsidianChips

import org.spongepowered.api.event.block.BlockRedstoneUpdateEvent
import org.spongepowered.api.event.block.BlockUpdateEvent
import org.spongepowered.api.util.event.Event

/**
 * Created by joshuacoles on 16/03/15.
 */
class InputPin extends Pin {
    private boolean currentState = false

    void onRelevantUpdate(Event event) {
        if (event instanceof BlockUpdateEvent) {
            event.block
        }

        pinSet.onInputUpdate(this)
    }
}
