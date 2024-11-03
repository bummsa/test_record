package dev.tatsi.test_replay_callback;


import me.jumper251.replay.api.ReplayAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StopGameCmd implements CommandExecutor {

    public StopGameCmd() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        ReplayAPI.getInstance().stopReplay("DummyGameID", true);

        return true;
    }

}
