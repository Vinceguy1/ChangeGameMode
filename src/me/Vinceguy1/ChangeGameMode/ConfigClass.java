package me.Vinceguy1.ChangeGameMode;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigClass
{
	public static void Config()
	{
		config.options().header("##ChangeGameMode");
		
		if (!config.isSet("Messages"))
			config.createSection("Messages");
		
		if (!config.isSet("Messages.General"))
			config.createSection("Messages.General");
		if (!config.isSet("Messages.General.Your GameMode has been changed"))
			config.set("Messages.General.Your GameMode has been changed", "&eYou are now in <TARGETPLAYERGAMEMODE> mode.");
		if (!config.isSet("Messages.General.ChangeGameMode Version Message"))
			config.set("Messages.General.ChangeGameMode Version Message", "<YELLOW>You are currently running <GOLD>ChangeGameMode v<VERSION><YELLOW>.");
		if(!config.isSet("Messages.General.Changed Target GameMode"))
			config.set("Messages.General.Changed Target GameMode", "<YELLOW>You have just changed <GOLD><TARGETPLAYER>'s <YELLOW>GameMode to <GOLD><TARGETPLAYERGAMEMODE><YELLOW>.");
		if(!config.isSet("Messages.General.Player Changed Your GameMode"))
			config.set("Messages.General.Player Changed Your GameMode", "<GOLD><PLAYER> <YELLOW>changed your GameMode to <GOLD><TARGETPLAYERGAMEMODE><YELLOW>.");
		if(!config.isSet("Messages.General.Checking Your GameMode"))
			config.set("Messages.General.Checking Your GameMode", "<YELLOW>You are in <GOLD><PLAYERGAMEMODE><YELLOW>.");
		if(!config.isSet("Messages.General.Checking Target's GameMode"))
			config.set("Messages.General.Checking Target's GameMode", "<GOLD><TARGETPLAYER><YELLOW> is in <GOLD><TARGETPLAYERGAMEMODE><YELLOW>.");
		if(!config.isSet("Messages.General.Sign Created Successfully"))
			config.set("Messages.General.Sign Created Successfully", "<YELLOW>You have successfully created a <DARKGRAY>[<GREEN>GameMode<DARKGRAY>]<YELLOW> sign.");
		if(!config.isSet("Messages.General.Your GameMode has been changed in world"))
			config.set("Messages.General.Your GameMode has been changed in world", "<YELLOW>Your GameMode has been changed to <GOLD><TARGETPLAYERGAMEMODE> <YELLOW>in <GOLD><TARGETPLAYERWORLDNAME>");
		if(!config.isSet("Messages.General.New Plugin Version"))
			config.set("Messages.General.New Plugin Version", "<GOLD>ChangeGameMode has been updated, please download the latest version. http://dev.bukkit.org/bukkit-plugins/changegamemode-v0-4/");
		
			
		if(!config.isSet("Messages.Errors"))
			config.createSection("Messages.Errors");
		if (!config.isSet("Messages.Errors.No Permission"))
			config.set("Messages.Errors.No Permission", "&cError: You don't have permission do that.");
		if (!config.isSet("Messages.Errors.In-game Player"))
			config.set("Messages.Errors.In-game Player", "&cError: You muse be in-game to use that command.");
		if(!config.isSet("Messages.Errors.Cannot Access File (Sending To Player)"))
			config.set("Messages.Errors.Cannot Access File (Sending To Player)", "&cError: Cannot Access File.");
		if(!config.isSet("Messages.Errors.Cannot Access File (Sending To Console)"))
			config.set("Messages.Errors.Cannot Access File (Sending To Console)", "&cError: Cannot Access File.");
		if(!config.isSet("Messages.Errors.Already in GameMode"))
			config.set("Messages.Errors.Already in GameMode", "&cError: You are already in that GameMode.");
		if(!config.isSet("Messages.Errors.Target Already in GameMode"))
			config.set("Messages.Errors.Target Already in GameMode", "&cError: <TARGETPLAYER> is already in <TARGETPLAYERGAMEMODE>.");
		if(!config.isSet("Messages.Errors.Error 404: Player Not Found"))
			config.set("Messages.Errors.Error 404: Player Not Found", "&cError: <TARGETPLAYER> was not found.");
		if(!config.isSet("Messages.Errors.Invalid Sign GameMode"))
			config.set("Messages.Errors.Invalid Sign GameMode", "&cError: Invalid GameMode.");

		if(!config.isSet("Variables"))
			config.createSection("Variables");
		if(!config.isSet("Variables.Black"))
			config.set("Variables.Black", "<BLACK>");
		if(!config.isSet("Variables.Dark Blue"))
			config.set("Variables.Dark Blue", "<DARKBLUE>");
		if(!config.isSet("Variables.Dark Green"))
			config.set("Variables.Dark Green", "<DARKGREEN>");
		if(!config.isSet("Variables.Dark Aqua"))
			config.set("Variables.Dark Aqua", "<DARKAQUA>");
		if(!config.isSet("Variables.Dark Red"))
			config.set("Variables.Dark Red", "<DARKRED>");
		if(!config.isSet("Variables.Dark Purple"))
			config.set("Variables.Dark Purple", "<DARKPURPLE>");
		if(!config.isSet("Variables.Gold"))
			config.set("Variables.Gold", "<GOLD>");
		if(!config.isSet("Variables.Gray"))
			config.set("Variables.Gray", "<GRAY>");
		if(!config.isSet("Variables.Dark Gray"))
			config.set("Variables.Dark Gray", "<DARKGRAY>");
		if(!config.isSet("Variables.Blue"))
			config.set("Variables.Blue", "<BLUE>");
		if(!config.isSet("Variables.Green"))
			config.set("Variables.Green", "<GREEN>");
		if(!config.isSet("Variables.Aqua"))
			config.set("Variables.Aqua", "<AQUA>");
		if(!config.isSet("Variables.Red"))
			config.set("Variables.Red", "<RED>");
		if(!config.isSet("Variables.Light Purple"))
			config.set("Variables.Light Purple", "<LIGHTPURPLE>");
		if(!config.isSet("Variables.Yellow"))
			config.set("Variables.Yellow", "<YELLOW>");
		if(!config.isSet("Variables.White"))
			config.set("Variables.White", "<WHITE>");
		if(!config.isSet("Variables.Obfuscated"))
			config.set("Variables.Obfuscated", "<OBFUSCATED>");
		if(!config.isSet("Variables.Bold"))
			config.set("Variables.Bold", "<BOLD>");
		if(!config.isSet("Variables.Strike Through"))
			config.set("Variables.Strike Through", "<STRIKETHROUGH>");
		if(!config.isSet("Variables.Underline"))
			config.set("Variables.Underline", "<UNDERLINE>");
		if(!config.isSet("Variables.Italic"))
			config.set("Variables.Italic", "<ITALIC>");
		if(!config.isSet("Variables.Reset"))
			config.set("Variables.Reset", "<RESET>");
		if(!config.isSet("Variables.Player Sending Command (Non-Displayname)"))
			config.set("Variables.Player Sending Command (Non-Displayname)", "<PLAYER>");
		if(!config.isSet("Variables.Player Affected (Non-Displayname)"))
			config.set("Variables.Player Affected (Non-Displayname)", "<TARGETPLAYER>");
		if(!config.isSet("Variables.Player Sending Command "))
			config.set("Variables.Player Sending Command", "<DPLAYER>");
		if(!config.isSet("Variables.Player Affected"))
			config.set("Variables.Player Affected", "<DTARGETPLAYER>");
		if(!config.isSet("Variables.Player GameMode (All Lowercase)"))
			config.set("Variables.Player GameMode (All Lowercase)", "<PLAYERGAMEMODE>");
		if(!config.isSet("Variables.Target Player GameMode (All Lowercase)"))
			config.set("Variables.Target Player GameMode (All Lowercase)", "<TARGETPLAYERGAMEMODE>");
		if(!config.isSet("Variables.Player GameMode (First Letter Capital)"))
			config.set("Variables.Player GameMode (First Letter Capital)", "<CPLAYERGAMEMODE>");
		if(!config.isSet("Variables.Target Player GameMode (First Letter Capital)"))
			config.set("Variables.Target Player GameMode (First Letter Capital)", "<CTARGETPLAYERGAMEMODE>");
		if(!config.isSet("Variables.Player GameMode (All Uppercase)"))
			config.set("Variables.Player GameMode (All Uppercase)", "<UPLAYERGAMEMODE>");
		if(!config.isSet("Variables.Target Player GameMode (All Uppercase)"))
			config.set("Variables.Target Player GameMode (All Uppercase)", "<UTARGETPLAYERGAMEMODE>");
		if(!config.isSet("Variables.Version"))
			config.set("Variables.Version", "<VERSION>");
		if(!config.isSet("Variables.Player World Name"))
			config.set("Variables.Player World Name", "<PLAYERWORLDNAME>");
		if(!config.isSet("Variables.Target Player World Name"))
			config.set("Variables.Target Player World Name", "<TARGETPLAYERWORLDNAME>");
		
		
		
		if(!config.isSet("Settings"))
			config.createSection("Settings");
		if(!config.isSet("Settings.Adventure Mode Enabled"))
			config.set("Settings.Adventure Mode Enabled", false);
		if(!config.isSet("Settings.Multi World GameModes"))
			config.set("Settings.Multi World GameModes", true);
		
		
	}

	public static FileConfiguration config;
}
