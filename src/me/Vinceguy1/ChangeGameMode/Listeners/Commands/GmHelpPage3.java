package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class GmHelpPage3

{
	public static void Command (CommandSender sender)
	{
		String disabled = "§c";
		sender.sendMessage(ChatColor.RED + "---ChangeGameMode(Page 3/3)---");
		if(sender.hasPermission("gm.check.all") || sender.isOp())
			disabled = "§a";
		else
			disabled = "§c";
		sender.sendMessage(disabled + "/gm check all " + ChatColor.GRAY + "-" + ChatColor.WHITE + " Checks/Displays everyones gamemode.");
		sender.sendMessage(ChatColor.RED + "---ChangeGameMode(Page 3/3)---");
	}
}
