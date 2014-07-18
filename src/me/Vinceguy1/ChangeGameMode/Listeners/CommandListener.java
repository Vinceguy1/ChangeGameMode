package me.Vinceguy1.ChangeGameMode.Listeners;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener
{
	public static boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("gm"))
		{
			if(args.length == 0)
			{
				me.Vinceguy1.ChangeGameMode.Listeners.Commands.Gm.Command(sender);
			}
			else if(args.length == 1)
			{
				if(args[0].equalsIgnoreCase("help"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmHelp.Command(sender);
				else if(args[0].equalsIgnoreCase("version"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmVersion.Command(sender);
				else if(args[0].equalsIgnoreCase("s"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmS.Command(sender);
				else if(args[0].equalsIgnoreCase("c"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmC.Command(sender);
				else if(args[0].equalsIgnoreCase("a"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmA.Command(sender);
				else if(args[0].equalsIgnoreCase("all"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmAll.Command(sender);
				else if(args[0].equalsIgnoreCase("check"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmCheck.Command(sender);
				else
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmOthers.Command(sender, args);
			}
			else if(args.length == 2)
			{
				if(args[0].equalsIgnoreCase("s"))
				{
					if(args[1].equalsIgnoreCase("all"))
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmSAll.Command(sender);
					else
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmSOthers.Command(sender, args);
				}
				else if(args[0].equalsIgnoreCase("c"))
				{
					if(args[1].equalsIgnoreCase("all"))
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmCAll.Command(sender);
					else
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmCOthers.Command(sender, args);
				}
				else if(args[0].equalsIgnoreCase("a"))
				{
					if(args[1].equalsIgnoreCase("all"))
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmAAll.Command(sender);
					else
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmAOthers.Command(sender, args);
				}
				else if(args[0].equalsIgnoreCase("check"))
				{
					if(args[1].equalsIgnoreCase("all"))
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmCheckAll.Command(sender);
					else
						me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmCheckOthers.Command(sender, args);
				}
				else if(args[0].equalsIgnoreCase("help"))
					me.Vinceguy1.ChangeGameMode.Listeners.Commands.GmHelpPages.Command(sender, args[1]);
				else if(args[0].equalsIgnoreCase("default"))
				{
					Player player = (Player) sender;
					me.Vinceguy1.ChangeGameMode.Functions.Files.WriteDefault(args[1], player.getWorld().getName(), me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"));
				}
			}
			else if(args.length == 3)
			{
				if(args[0].equalsIgnoreCase("settings"))
				{
					if(args[1].equalsIgnoreCase("adventuremode"))
					{
						me.Vinceguy1.ChangeGameMode.ConfigClass.config.set("Settings.Adventure Mode Enabled", Boolean.valueOf(args[2]));
					}
					else if(args[1].equalsIgnoreCase("multiworld"))
					{
						me.Vinceguy1.ChangeGameMode.ConfigClass.config.set("Settings.Multi World GameModes", Boolean.valueOf(args[2]));
					}
				}
				else if(args[0].equalsIgnoreCase("default"))
				{
					me.Vinceguy1.ChangeGameMode.Functions.Files.WriteDefault(args[1], args[2], me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"));
				}
			}
		}
		return true;
	}
}
