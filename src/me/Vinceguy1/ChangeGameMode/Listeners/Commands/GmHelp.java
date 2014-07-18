package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class GmHelp
{
	public static void Command (CommandSender sender)
	{
		String disabled = "§c";
		sender.sendMessage(ChatColor.RED + "---ChangeGameMode(Page 1/3)---");
		sender.sendMessage(ChatColor.GREEN + "/gm help " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Shows the ChangeGameMode plugin's help page.");
		sender.sendMessage(ChatColor.GREEN + "/gm version " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Displays the ChangeGameMode version.");
		if(sender.getName() == "CONSOLE")
		{
			sender.sendMessage(ChatColor.GREEN + "/gm <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Toggles <target>'s gamemode.");
			sender.sendMessage(ChatColor.GREEN + "/gm s <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes <target>'s gamemode to survival.");
			sender.sendMessage(ChatColor.GREEN + "/gm c <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes <target>'s gamemode to creative.");
			sender.sendMessage(ChatColor.GREEN + "/gm a <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes <target>'s gamemode to adventure.");
			sender.sendMessage(ChatColor.GREEN + "/gm check <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Checks/Displays <target>'s gamemode.");
			sender.sendMessage(ChatColor.GREEN + "/gm all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Toggles everyone's gamemode.");
			sender.sendMessage(ChatColor.GREEN + "/gm s all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes everyones gamemode to survival.");
			sender.sendMessage(ChatColor.GREEN + "/gm c all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes everyones gamemode to creative.");
			sender.sendMessage(ChatColor.GREEN + "/gm a all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes everyones gamemode to adventure.");
		}
		else
		{
			if(sender.hasPermission("gm.toggle") || sender.isOp() || sender.hasPermission("essentials.gm"))
				disabled = "§a";
			else
				disabled = "§c";
				sender.sendMessage(disabled + "/gm " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Toggles your gamemode.");
				
			if(sender.hasPermission("gm.toggle.others") || sender.isOp())
				disabled = "§a";
			else
				disabled = "§c";
			sender.sendMessage(disabled + "/gm <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Toggles <target>'s gamemode");
	
			if(sender.hasPermission("gm.survival") || sender.isOp())
				disabled = "§a";
			else
				disabled = "§c";
			sender.sendMessage(disabled + "/gm s " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes your gamemode to survival.");
			
			if(sender.hasPermission("gm.survival.others") || sender.isOp())
				disabled = "§a";
			else
				disabled = "§c";
			sender.sendMessage(disabled + "/gm s <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes <target>'s gamemode to survival.");
			
			if(sender.hasPermission("gm.creative") || sender.isOp())
				disabled = "§a";
			else
				disabled = "§c";
			sender.sendMessage(disabled + "/gm c " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes your gamemode to creative.");
			
			if(sender.hasPermission("gm.creative.others") || sender.isOp())
				disabled = "§a";
			else
				disabled = "§c";
			sender.sendMessage(disabled + "/gm c <target> " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Changes <target>'s gamemode to creative.");
			
		sender.sendMessage(ChatColor.RED + "---ChangeGameMode(Page 1/3)---");
		}
	}
}
