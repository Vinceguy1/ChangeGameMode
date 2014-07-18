package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmCheck 
{
	public static void Command(CommandSender sender)
	{
		if(!(sender instanceof Player))
		{
			me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.In-game Player").toString(), sender, null, null, true, false, false, null);
		}
		else
		{
			if(sender.hasPermission("gm.check"))
			{
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Checking Your GameMode").toString(), sender, (Player) sender, (Player) sender, true, false, false, null);
			}
			else
			{
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), sender, (Player) sender, (Player) sender, true, false, false, null);
			}
		}
	}
}
