package me.plugin.no_flex;

//import jdk.nashorn.api.tree.CatchTreeImpl;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class No_Flex extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("No Flex Plugin Starting....!!!");

        getServer().getPluginManager().registerEvents(this, this );
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {

        Material type = event.getBlock().getType();
        if(type == Material.NETHERITE_BLOCK||type == Material.DIAMOND_BLOCK||type == Material.EMERALD_BLOCK||type == Material.IRON_BLOCK||type == Material.REDSTONE_BLOCK||type == Material.LAPIS_BLOCK||type == Material.COAL_BLOCK||type == Material.GOLD_BLOCK)
        {
            event.getBlockPlaced().setType(Material.AIR);
        }
    }
}
