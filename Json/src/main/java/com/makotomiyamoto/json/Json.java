package com.makotomiyamoto.json;

import com.makotomiyamoto.json.commands.ShowJson;
import org.bukkit.plugin.java.JavaPlugin;

public class Json extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("ShowJson").setExecutor(new ShowJson());

    }

}
