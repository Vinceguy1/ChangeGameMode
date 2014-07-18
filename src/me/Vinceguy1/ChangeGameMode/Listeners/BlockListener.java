package me.Vinceguy1.ChangeGameMode.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;


public class BlockListener implements Listener
{
	@EventHandler(priority = EventPriority.LOWEST)
	public void onSignChange(SignChangeEvent event)
	{
		if(me.Vinceguy1.ChangeGameMode.Listeners.Block.SignChangeEvent.main(event, event.getPlayer(), event.getBlock(), event.getLine(0), event.getLine(1)))
			event.setLine(0, "[" + ChatColor.GREEN + "GameMode" + ChatColor.BLACK + "]");
	}
}
