package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmVersion
{
	public static void Command(CommandSender sender)
	{
		if(sender instanceof Player)
			me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.ChangeGameMode Version Message").toString(), sender, (Player) sender, null, true, false, false, null);
		else
			me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.ChangeGameMode Version Message").toString(), sender, null, null, true, false, false, null);
	}
}
