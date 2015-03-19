package org.joshuacoles.obsidianChips

import org.spongepowered.api.util.event.Event

/**
 * Created by joshuacoles on 19/03/2015.
 */
interface ChipEvent extends Event {
    Chip getChip()
}