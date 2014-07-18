package me.Vinceguy1.ChangeGameMode.Listeners.Commands;

import org.bukkit.command.CommandSender;

public class GmHelpPages 
{
	public static void Command (CommandSender sender, String args)
	{
		if(args.equals("1"))
			me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmHelp.Command(sender);
		else if(args.equals("2"))
			me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmHelpPage2.Command(sender);
		else if(args.equals("3"))
			me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmHelpPage3.Command(sender);
		else
			sender.sendMessage("Error: not found");
	}
}
