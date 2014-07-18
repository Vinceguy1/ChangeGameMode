package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmC
{
	public static void Command(CommandSender sender)
	{
		if(!(sender instanceof Player))
		{
			me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.In-game Player").toString(), sender, null, null, true, false, false, null);
		}
		else
		{
			Player player = (Player) sender;
			if(player.hasPermission("gm.creative"))
			{
				if (player.getGameMode() != GameMode.CREATIVE)
				{
					player.setGameMode(GameMode.CREATIVE);
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), sender, player, player, true, false, false, null);
					me.Vinceguy1.ChangeGameMode.Functions.Files.WriteGameMode(player, player.getWorld().getName(), me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"));
				}
				else
				{
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Already in GameMode").toString(), sender, player, player, true, false, false, null);
				}
			}
			else
			{
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), sender, player, player, true, false, false, null);
			}
		}
	}
}

