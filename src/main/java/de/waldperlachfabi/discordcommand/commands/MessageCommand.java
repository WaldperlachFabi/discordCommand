package de.waldperlachfabi.discordcommand.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MessageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Component text = Component.text("§lDiscord Link:").color(NamedTextColor.BLUE).append(Component.newline());
            Component clickme = Component.text("§lKLICKE HIER").color(NamedTextColor.YELLOW).clickEvent(net.kyori.adventure.text.event.ClickEvent.openUrl("https://discord.gg/dSawZuUKMg")).hoverEvent(net.kyori.adventure.text.event.HoverEvent.showText(Component.text("Besuche unseren Discord Server!")));

            player.sendMessage(text.append(clickme));
        }
        return false;
    }
}
