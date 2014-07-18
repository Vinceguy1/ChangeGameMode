package me.Vinceguy1.ChangeGameMode.Listeners.Player;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class PlayerJoinEvent
{
	public static void main(Event e, Player player)
	{
		me.Vinceguy1.ChangeGameMode.Functions.Files.ReadGameMode(player, player.getWorld().getName(), me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"));
		if(player.hasPermission("gm.update") && me.Vinceguy1.ChangeGameMode.Main.update)
		{
			me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.New Plugin Version").toString(), (CommandSender) player, player, player, true, false, false, null);
		}
	}
}
