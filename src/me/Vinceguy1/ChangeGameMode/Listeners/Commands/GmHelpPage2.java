package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class GmHelpPage2 
{
	public static void Command (CommandSender sender)
	{
		String disabled = "§c";
		sender.sendMessage(ChatColor.RED + "---ChangeGameMode(Page 2/3)---");
		if(sender.hasPermission("gm.adventure") || sender.isOp())
		disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm a " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes your gamemode to adventure.");
		
		if(sender.hasPermission("gm.adventure.others") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm a <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes <target>'s gamemode to adventure.");
		
		if(sender.hasPermission("gm.check") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm check " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Checks/Displays your gamemode.");
		
		if(sender.hasPermission("gm.check.others") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm check <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Checks/Displays <target>'s gamemode.");
		
		if(sender.hasPermission("gm.toggle.all") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Toggles everyone's gamemode.");
		
		if(sender.hasPermission("gm.survival.all") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm s all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes everyones gamemode to survival.");
		
		if(sender.hasPermission("gm.creative.all") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm c all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes everyones gamemode to creative.");
		
		if(sender.hasPermission("gm.adventure.all") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm a all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes everyones gamemode to adventure.");
		
		sender.sendMessage(ChatColor.RED + "---ChangeGameMode(Page 2/3)---");
	}
}
