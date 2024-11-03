package dev.tatsi.test_replay_callback.listener;

import me.jumper251.replay.api.ReplayAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * @author BoomerHD / Bummsa / Thatsaphorn Atchariyaphap
 * @since 03.11.2024
 */
public class PlayerJoinEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event) {
        Player joinedPlayer = event.getPlayer();
        ReplayAPI.getInstance().playReplay("DummyGameID", joinedPlayer);
    }


}
