package de.maxcron.xylit.broadcaster.Listener;

import de.maxcron.xylit.broadcaster.Tools.UpdateChecker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * ===============================
 * Spigot - Public - Broadcast
 * Created by Xylit
 * 2017
 * ==============================
 */
public class PlayerJoin implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        UpdateChecker.checkUpdate(e.getPlayer());
    }
}
