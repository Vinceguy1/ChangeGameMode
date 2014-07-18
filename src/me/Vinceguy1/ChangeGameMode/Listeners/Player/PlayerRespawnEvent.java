package me.Vinceguy1.ChangeGameMode.Listeners.Player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class PlayerRespawnEvent
{
	public static void main(Event e, Player player)
	{
		me.Vinceguy1.ChangeGameMode.Functions.Files.ReadGameMode(player, player.getWorld().getName(), me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"));
	}
}
