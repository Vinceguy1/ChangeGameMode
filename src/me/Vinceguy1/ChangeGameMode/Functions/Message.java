package me.Vinceguy1.ChangeGameMode.Functions;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Message
{
	public static void Function(String message, CommandSender sender, Player player, Player targetplayer, boolean playersender, boolean target, boolean console, String noplayer)
	{
		message = message.replaceAll("(?i)&([a-f0-9k-or])", "\u00A7$1");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Black").toString(), "§0");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Blue").toString(), "§1");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Green").toString(), "§2");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Aqua").toString(), "§3");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Red").toString(), "§4");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Purple").toString(), "§5");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Gold").toString(), "§6");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Gray").toString(), "§7");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Gray").toString(), "§8");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Blue").toString(), "§9");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Green").toString(), "§a");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Aqua").toString(), "§b");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Red").toString(), "§c");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Light Purple").toString(), "§d");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Yellow").toString(), "§e");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.White").toString(), "§f");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Obfuscated").toString(), "§k");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Bold").toString(), "§l");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Strike Through").toString(), "§m");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Underline").toString(), "§n");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Italic").toString(), "§o");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Reset").toString(), "§r");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Sending Command (Non-Displayname)").toString(), sender.getName());
		if(player != null)
		{
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Sending Command").toString(), player.getDisplayName());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player GameMode (All Lowercase)").toString(), player.getGameMode().toString().toLowerCase());
			String CPlayergamemode = player.getGameMode().toString().toLowerCase();
			CPlayergamemode = CPlayergamemode.substring(0, 1).toUpperCase() + CPlayergamemode.substring(1);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player GameMode (First Letter Capital)").toString(), CPlayergamemode);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player GameMode (All Uppercase)").toString(), player.getGameMode().toString().toUpperCase());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player World Name").toString(), player.getWorld().getName());
		}
		if(targetplayer != null)
		{
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected").toString(), targetplayer.getDisplayName());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected (Non-Displayname)").toString(), targetplayer.getName());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player GameMode (All Lowercase)").toString(), targetplayer.getGameMode().toString().toLowerCase());
			String CPlayergamemode = targetplayer.getGameMode().toString().toLowerCase();
			CPlayergamemode = CPlayergamemode.substring(0, 1).toUpperCase() + CPlayergamemode.substring(1);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player GameMode (First Letter Capital)").toString(), CPlayergamemode);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player GameMode (All Uppercase)").toString(), targetplayer.getGameMode().toString().toUpperCase());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player World Name").toString(), targetplayer.getWorld().getName());
		}
		else if(noplayer != null)
		{
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected").toString(), noplayer);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected (Non-Displayname)").toString(), noplayer);
		}
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Version").toString(), me.Vinceguy1.ChangeGameMode.Main.version);
		if(playersender)
			sender.sendMessage(message);
		if(target)
			targetplayer.sendMessage(message);
		if(console)
			System.out.println(message);
	}
	public static void Function(String message, CommandSender sender, Player player, Player targetplayer, boolean playersender, boolean target, boolean console, String noplayer, String world, String gamemode)
	{
		message = message.replaceAll("(?i)&([a-f0-9k-or])", "\u00A7$1");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Black").toString(), "§0");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Blue").toString(), "§1");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Green").toString(), "§2");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Aqua").toString(), "§3");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Red").toString(), "§4");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Purple").toString(), "§5");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Gold").toString(), "§6");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Gray").toString(), "§7");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Dark Gray").toString(), "§8");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Blue").toString(), "§9");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Green").toString(), "§a");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Aqua").toString(), "§b");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Red").toString(), "§c");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Light Purple").toString(), "§d");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Yellow").toString(), "§e");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.White").toString(), "§f");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Obfuscated").toString(), "§k");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Bold").toString(), "§l");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Strike Through").toString(), "§m");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Underline").toString(), "§n");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Italic").toString(), "§o");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Reset").toString(), "§r");
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Sending Command (Non-Displayname)").toString(), sender.getName());
		if(player != null)
		{
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Sending Command").toString(), player.getDisplayName());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player GameMode (All Lowercase)").toString(), gamemode.toLowerCase());
			String CPlayergamemode = gamemode.toLowerCase();
			CPlayergamemode = CPlayergamemode.substring(0, 1).toUpperCase() + CPlayergamemode.substring(1);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player GameMode (First Letter Capital)").toString(), CPlayergamemode);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player GameMode (All Uppercase)").toString(), gamemode.toUpperCase());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player World Name").toString(), world);
		}
		if(targetplayer != null)
		{
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected").toString(), targetplayer.getDisplayName());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected (Non-Displayname)").toString(), targetplayer.getName());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player GameMode (All Lowercase)").toString(), gamemode.toLowerCase());
			String CPlayergamemode = gamemode.toLowerCase();
			CPlayergamemode = CPlayergamemode.substring(0, 1).toUpperCase() + CPlayergamemode.substring(1);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player GameMode (First Letter Capital)").toString(), CPlayergamemode);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player GameMode (All Uppercase)").toString(), gamemode.toUpperCase());
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Target Player World Name").toString(), world);
		}
		else if(noplayer != null)
		{
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected").toString(), noplayer);
			message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Player Affected (Non-Displayname)").toString(), noplayer);
		}
		message = message.replaceAll(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Variables.Version").toString(), me.Vinceguy1.ChangeGameMode.Main.version);
		if(playersender)
			sender.sendMessage(message);
		if(target)
			targetplayer.sendMessage(message);
		if(console)
			System.out.println(message);
	}
}
