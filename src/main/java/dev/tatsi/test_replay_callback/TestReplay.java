package dev.tatsi.test_replay_callback;

import dev.tatsi.test_replay_callback.listener.PlayerJoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestReplay extends JavaPlugin {

    private static TestReplay instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        // for replay mode
        Bukkit.getPluginManager().registerEvents(new PlayerJoinEvent(), this);

        // for sg mode
//        Bukkit.getPluginCommand("startgame").setExecutor(new StartGameCommand());
//        Bukkit.getPluginCommand("stopgame").setExecutor(new StopGameCmd());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
