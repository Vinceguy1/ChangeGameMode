package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmAOthers
{
	public static void Command(CommandSender sender, String[] args)
	{
		if(sender.hasPermission("gm.adventure.others"))
		{
			Player target = Bukkit.getPlayer(args[1]);
			if(target != null)
			{
				if (target.getGameMode() != GameMode.ADVENTURE)
				{
					target.setGameMode(GameMode.ADVENTURE);
					if(sender instanceof Player)
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Changed Target GameMode").toString(), sender, (Player) sender, target, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Player Changed Your GameMode").toString(), sender, (Player) sender, target, false, true, false, null);
					}
					else
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Changed Target GameMode").toString(), sender, null, target, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Player Changed Your GameMode").toString(), sender, null, target, false, true, false, null);
					}
				}
				else
				{
					if(sender instanceof Player)
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Target Already in GameMode").toString(), sender, (Player) sender, target, true, false, false, null);
					else
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Target Already in GameMode").toString(), sender, null, target, true, false, false, null);
				}
			}
			else
			{
				if(sender instanceof Player)
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Error 404: Player Not Found").toString(), sender, (Player) sender, null, true, false, false, args[0]);
				else
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Error 404: Player Not Found").toString(), sender, null, null, true, false, false, args[0]);
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