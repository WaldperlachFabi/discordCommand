package de.waldperlachfabi.discordcommand;

import de.waldperlachfabi.discordcommand.commands.MessageCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordCommandCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("discord").setExecutor(new MessageCommand());
        Bukkit.getConsoleSender().sendMessage("Das Plugin wurde §aAktiviert§r!");
        Bukkit.getConsoleSender().sendMessage("___.             __      __        .__       .___                   .__                .__    ___________     ___.   .__ ");
        Bukkit.getConsoleSender().sendMessage("\\_ |__ ___.__.  /  \\    /  \\_____  |  |    __| _/_____   ___________|  | _____    ____ |  |__ \\_   _____/____ \\_ |__ |__|");
        Bukkit.getConsoleSender().sendMessage(" | __ <   |  |  \\   \\/\\/   /\\__  \\ |  |   / __ |\\____ \\_/ __ \\_  __ \\  | \\__  \\ _/ ___\\|  |  \\ |    __) \\__  \\ | __ \\|  |");
        Bukkit.getConsoleSender().sendMessage(" | \\_\\ \\___  |   \\        /  / __ \\|  |__/ /_/ ||  |_> >  ___/|  | \\/  |__/ __ \\\\  \\___|   Y  \\|     \\   / __ \\| \\_\\ \\  |");
        Bukkit.getConsoleSender().sendMessage(" |___  / ____|    \\__/\\  /  (____  /____/\\____ ||   __/ \\___  >__|  |____(____  /\\___  >___|  /\\___  /  (____  /___  /__|");
        Bukkit.getConsoleSender().sendMessage("     \\/\\/              \\/        \\/           \\/|__|        \\/                \\/     \\/     \\/     \\/        \\/    \\/    ");

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Das Plugin wurde §cDeaktiviert§r!");
        Bukkit.getConsoleSender().sendMessage("___.             __      __        .__       .___                   .__                .__    ___________     ___.   .__ ");
        Bukkit.getConsoleSender().sendMessage("\\_ |__ ___.__.  /  \\    /  \\_____  |  |    __| _/_____   ___________|  | _____    ____ |  |__ \\_   _____/____ \\_ |__ |__|");
        Bukkit.getConsoleSender().sendMessage(" | __ <   |  |  \\   \\/\\/   /\\__  \\ |  |   / __ |\\____ \\_/ __ \\_  __ \\  | \\__  \\ _/ ___\\|  |  \\ |    __) \\__  \\ | __ \\|  |");
        Bukkit.getConsoleSender().sendMessage(" | \\_\\ \\___  |   \\        /  / __ \\|  |__/ /_/ ||  |_> >  ___/|  | \\/  |__/ __ \\\\  \\___|   Y  \\|     \\   / __ \\| \\_\\ \\  |");
        Bukkit.getConsoleSender().sendMessage(" |___  / ____|    \\__/\\  /  (____  /____/\\____ ||   __/ \\___  >__|  |____(____  /\\___  >___|  /\\___  /  (____  /___  /__|");
        Bukkit.getConsoleSender().sendMessage("     \\/\\/              \\/        \\/           \\/|__|        \\/                \\/     \\/     \\/     \\/        \\/    \\/    ");

    }
}
