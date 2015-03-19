package org.joshuacoles.obsidianChips

import org.spongepowered.api.block.BlockLoc

/**
 * Represents a chip in world with logic and structure
 */
class Chip {
    long id
    BlockLoc sign
    BlockLoc[] structure
    PinSet pinSet
    ChipLogic logic
}
