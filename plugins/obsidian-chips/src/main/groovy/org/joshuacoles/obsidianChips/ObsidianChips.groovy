package org.joshuacoles.obsidianChips

import org.joshuacoles.obsidianChips.chip.Chip
import org.joshuacoles.obsidianChips.chip.PinSet
import org.spongepowered.api.block.BlockLoc
import org.spongepowered.api.block.BlockType
import org.spongepowered.api.block.data.Sign
import org.spongepowered.api.event.entity.living.player.PlayerInteractBlockEvent
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.util.event.Subscribe

import static org.spongepowered.api.block.BlockTypes.*

@Plugin(name = "Obsidian Chips", id = "obsidian-chips", dependencies = "required-after:groovy-sponge")
class ObsidianChips {
    @SuppressWarnings(["GrMethodMayBeStatic", "GroovyUnusedDeclaration", "GroovyAssignabilityCheck", "GrUnresolvedAccess"])
    @Subscribe
    void onBlockInteract(PlayerInteractBlockEvent event) {
        if (!event.block.type == WALL_SIGN) return
        final text = event.block.getData(Sign)().lines*.stripFormatting()
        if (!text[0].matches(~/chip\[\w+\]/)) return
        final type = Class.forName(("org.joshuacoles.obsidianChips." + (text =~ ~/chip\[\w+\]/)[0][1]))
        final info = text[1..-1]
        final structure = structureBlocks(event)

        new Chip(sign: event.block,
                id: new Random().nextInt(),
                structure: structure,
                logic: type.newInstance(info),
                pinSet: new PinSet())
    }

    private static ArrayList<BlockLoc> structureBlocks(BlockLoc loc, BlockType type) {
        final types = chipBlockTypes(type)
        final structure = []
        loc.surrounding().findAll {
            types.contains(it.type)
        }.each {
            structure << it
            structure.addAll(structureBlocks(it, type))
        }

        return structure
    }

    private static ArrayList<BlockType> chipBlockTypes(BlockType type) {
        [COAL_BLOCK,         //null pin
         REDSTONE_BLOCK,    //active pin

         LAPIS_BLOCK,       //interface pin

         IRON_BLOCK,        //digital input
         EMERALD_BLOCK,     //analog input

         GOLD_BLOCK,        //digital output
         DIAMOND_BLOCK,     //analog output
         type]              //structure block
    }
}
