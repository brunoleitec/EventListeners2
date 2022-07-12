package com.github.brunoleitec.eventlisteners2;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event){
        Player player = event.getPlayer();
        Entity entity = event.getEntity();
        if (entity.getType() == EntityType.SHEEP){
            player.sendMessage("Isso é uma ovelha. Voce não pode fazer isso.");
            event.setCancelled(true);
        }else{
            player.sendMessage("Isso não é uma ovelha.");
        }

    }

}