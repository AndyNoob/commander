package me.quadraboy.commander.structure;

import me.quadraboy.commander.structure.handlers.ArgumentHandler;
import net.kyori.adventure.text.Component;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Flow {
    private final CommandSender sender;
    private final ArgumentHandler argumentHandler;
    private Component invalidArgumentMessage = Component.empty(), notAllowedMessage = Component.empty();

    public Flow(@NotNull final CommandSender sender, @NotNull final String[] arguments) {
        this.sender = sender;
        this.argumentHandler = new ArgumentHandler(arguments, sender, invalidArgumentMessage);
    }

    public ArgumentHandler argument() {
        return this.argumentHandler;
    }

    public Player player() {
        return (Player) sender;
    }

    public Component invalidArgumentMessage() {
        return this.invalidArgumentMessage;
    }

    public void invalidArgumentMessage(@NotNull final Component invalidArgumentMessage) {
        this.invalidArgumentMessage = invalidArgumentMessage;
    }

    public Component notAllowedMessage() {
       return this.notAllowedMessage;
    }

    public void notAllowedMessage(@NotNull final Component notAllowedMessage) {
        this.notAllowedMessage = notAllowedMessage;
    }
}