package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmCAll 
{
	public static void Command(CommandSender sender)
	{
		if(sender.hasPermission("gm.creative.all"))
		{
			for(Player player : Bukkit.getServer().getOnlinePlayers())
			{
				if (player.getGameMode() != GameMode.CREATIVE)
				{
					player.setGameMode(GameMode.CREATIVE);
					if(sender instanceof Player)
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Changed Target GameMode").toString(), sender, (Player) sender, player, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Player Changed Your GameMode").toString(), sender, (Player) sender, player, false, true, false, null);
					}
					else
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Changed Target GameMode").toString(), sender, null, player, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Player Changed Your GameMode").toString(), sender, null, player, false, true, false, null);
					}
				}
				else
				{
					if(sender instanceof Player)
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Target Already in GameMode").toString(), sender, (Player) sender, player, true, false, false, null);
					else
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Target Already in GameMode").toString(), sender, null, player, true, false, false, null);
				}
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
