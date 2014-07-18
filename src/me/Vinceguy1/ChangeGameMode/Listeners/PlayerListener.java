package me.Vinceguy1.ChangeGameMode.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerListener implements Listener
{
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerInteract(PlayerInteractEvent event)
	{
		event.setCancelled(me.Vinceguy1.ChangeGameMode.Listeners.Player.PlayerInteractEvent.main(event, event.getPlayer(), event.getAction(), event.getClickedBlock()));
	}
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerRespawn(PlayerRespawnEvent event)
	{
		me.Vinceguy1.ChangeGameMode.Listeners.Player.PlayerRespawnEvent.main(event, event.getPlayer());
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerLogin(PlayerJoinEvent event)
	{
		me.Vinceguy1.ChangeGameMode.Listeners.Player.PlayerJoinEvent.main(event, event.getPlayer());
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerLogin(PlayerLoginEvent event)
	{
		me.Vinceguy1.ChangeGameMode.Listeners.Player.PlayerLoginEvent.main(event, event.getPlayer());
	}
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerChangedWorld(PlayerChangedWorldEvent event)
	{
		me.Vinceguy1.ChangeGameMode.Listeners.Player.PlayerChangedWorldEvent.main(event, event.getPlayer());
	}
}
