package org.joshuacoles.obsidianChips

import org.spongepowered.api.block.BlockTypes
import org.spongepowered.api.plugin.Plugin

@Plugin(name = "Obsidian Chips", id = "obsidian-chips", dependencies = "required-after:groovy-sponge")
class ObsidianChips {
    static inputBlocks = [BlockTypes.LEVER]
}
