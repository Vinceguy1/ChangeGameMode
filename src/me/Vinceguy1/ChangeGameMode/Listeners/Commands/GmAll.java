package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmAll
{
	public static void Command(CommandSender sender)
	{
		if(sender.hasPermission("gm.toggle.all"))
		{
			for(Player player : Bukkit.getServer().getOnlinePlayers())
			{
				if (player.getGameMode() == GameMode.SURVIVAL)
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
				else if (player.getGameMode() == GameMode.CREATIVE)
				{
					if(me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Adventure Mode Enabled"))
						player.setGameMode(GameMode.ADVENTURE);
					else
						player.setGameMode(GameMode.SURVIVAL);
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
					me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(sender, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
				}
				else if (player.getGameMode() == GameMode.ADVENTURE)
				{
					player.setGameMode(GameMode.SURVIVAL);
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
					me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(sender, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
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