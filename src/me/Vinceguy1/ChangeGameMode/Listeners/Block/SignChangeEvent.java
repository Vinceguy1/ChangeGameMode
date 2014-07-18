package me.Vinceguy1.ChangeGameMode.Listeners.Block;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class SignChangeEvent
{
	public static boolean main(Event e, Player player, Block block, String Line1, String Line2)
	{
		boolean returnbool = false;
		if(Line1.equalsIgnoreCase("[GameMode]"))
		{
			if(player.hasPermission("gm.sign.create"))
			{
				if(Line2.equalsIgnoreCase("Creative") || Line2.equalsIgnoreCase("Survival") || Line2.equalsIgnoreCase("Adventure") || Line2.equalsIgnoreCase("Toggle") || Line2.equalsIgnoreCase(""))
				{
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Sign Created Successfully").toString(), player, player, player, true, false, false, null);
					returnbool = true;
				}	
				else
				{
					block.breakNaturally();
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Invalid Sign GameMode").toString(), player, player, player, true, false, false, null);
				}
			}
			else
			{
				block.breakNaturally();
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
			}
		}
		return returnbool;
	}
}
