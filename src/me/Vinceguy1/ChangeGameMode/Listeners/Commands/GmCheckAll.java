package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmCheckAll 
{
	public static void Command(CommandSender sender)
	{
		if(sender.hasPermission("gm.check.all"))
		{
			for(Player player : Bukkit.getServer().getOnlinePlayers())
			{
				if(sender instanceof Player)
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Checking Target's GameMode").toString(), sender, (Player) sender, player, true, false, false, null);
				else
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Checking Target's GameMode").toString(), sender, null, player, true, false, false, null);
			}
		}
		else
		{
			if(sender instanceof Player)
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), sender, (Player) sender, null, true, false, false, null);
			else
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), sender, null, null, true, false, false, null);
		}
	}
}
