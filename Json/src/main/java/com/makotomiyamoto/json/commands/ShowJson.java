package com.makotomiyamoto.json.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ShowJson implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (command.getName().equals("ShowJson")) {

            TextComponent message = new TextComponent("Click me!");

            message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/MakotoMiyamoto/Json"));

            message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Visit my Github!")
                    .create()));

            commandSender.spigot().sendMessage(message);

            return true;

        }

        return true;

    }

}
