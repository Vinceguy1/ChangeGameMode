package me.Vinceguy1.ChangeGameMode.Listeners.Player;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.block.Action;


public class PlayerInteractEvent
{
	public static boolean main(Event event, Player player, Action action, Block block)
	{
		boolean cancelled = false;
		if(action.equals(Action.LEFT_CLICK_BLOCK))
		{
			if(block.getType().equals(Material.SIGN_POST) || block.getType().equals(Material.WALL_SIGN))
			{
				Sign sign = (Sign)block.getState();
				if(sign.getLine(0).equalsIgnoreCase("[" + ChatColor.GREEN + "GameMode" + ChatColor.BLACK + "]"))
				{
					if(!(player.hasPermission("gm.sign.break")))
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
						cancelled = true;
					}
				}
			}
		}
		
		if(action.equals(Action.RIGHT_CLICK_BLOCK))
		{
			if(block.getType().equals(Material.SIGN_POST) || block.getType().equals(Material.WALL_SIGN))
			{
				Sign sign = (Sign)block.getState();
				if(sign.getLine(0).equalsIgnoreCase("[" + ChatColor.GREEN + "GameMode" + ChatColor.BLACK + "]"))
				{
					if(sign.getLine(2).equals(""))
					{
						if(sign.getLine(1).equalsIgnoreCase("Creative"))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.creative"))
							{
								if(player.getGameMode() != GameMode.CREATIVE)
								{
									player.setGameMode(GameMode.CREATIVE);
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), player, player, player, true, false, false, null);
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
								}
								else
								{
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Already in GameMode").toString(), player, player, player, true, false, false, null);
								}
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
						else if(sign.getLine(1).equalsIgnoreCase("Survival"))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.survival"))
							{
								if(player.getGameMode() != GameMode.SURVIVAL)
								{
									player.setGameMode(GameMode.SURVIVAL);
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), player, player, player, true, false, false, null);
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
								}
								else
								{
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Already in GameMode").toString(), player, player, player, true, false, false, null);
								}
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
						else if(sign.getLine(1).equalsIgnoreCase("Adventure"))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.adventure"))
							{
								if(player.getGameMode() != GameMode.ADVENTURE)
								{
									player.setGameMode(GameMode.ADVENTURE);
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), player, player, player, true, false, false, null);
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
								}
								else
								{
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Already in GameMode").toString(), player, player, player, true, false, false, null);
								}
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
						else if(sign.getLine(1).equalsIgnoreCase("Toggle") || sign.getLine(1).equalsIgnoreCase(""))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.toggle"))
							{
								if(player.getGameMode() == GameMode.SURVIVAL)
								{
									player.setGameMode(GameMode.CREATIVE);
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), player, player, player, true, false, false, null);
								}
								else if(player.getGameMode() == GameMode.CREATIVE)
								{
									if(me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Adventure Mode Enabled"))
									{
										player.setGameMode(GameMode.ADVENTURE);
										me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
										me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), player, player, player, true, false, false, null);
									}
									else
									{
										player.setGameMode(GameMode.SURVIVAL);
										me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
										me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), player, player, player, true, false, false, null);
									}
									
								}
								else if(player.getGameMode() == GameMode.ADVENTURE)
								{
									player.setGameMode(GameMode.SURVIVAL);
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), false);
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed").toString(), player, player, player, true, false, false, null);
								}
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
					}
					else
					{
						if(sign.getLine(1).equalsIgnoreCase("Creative"))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.creative"))
							{
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed in world").toString(), player, player, player, true, false, false, null, sign.getLine(2), "CREATIVE");
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), sign.getLine(2), GameMode.CREATIVE);
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
						else if(sign.getLine(1).equalsIgnoreCase("Survival"))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.survival"))
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed in world").toString(), player, player, player, true, false, false, null, sign.getLine(2), "SURVIVAL");
								me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), sign.getLine(2), GameMode.SURVIVAL);
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
						else if(sign.getLine(1).equalsIgnoreCase("Adventure"))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.adventure"))
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed in world").toString(), player, player, player, true, false, false, null, sign.getLine(2), "ADVENTURE");
								me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), sign.getLine(2), GameMode.ADVENTURE);
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
						else if(sign.getLine(1).equalsIgnoreCase("Toggle") || sign.getLine(1).equalsIgnoreCase(""))
						{
							if(player.hasPermission("gm.sign.use") || player.hasPermission("gm.sign.use.toggle"))
							{
								if(me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, sign.getLine(2)).equals("SURVIVAL"))
								{
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed in world").toString(), player, player, player, true, false, false, null, sign.getLine(2), "CREATIVE");
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), sign.getLine(2), GameMode.CREATIVE);
								}
								else if(me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, sign.getLine(2)).equals("CREATIVE"))
								{
									if(me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Adventure Mode Enabled"))
									{
										me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed in world").toString(), player, player, player, true, false, false, null, sign.getLine(2), "ADVENTURE");
										me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), sign.getLine(2), GameMode.ADVENTURE);
									}
									else
									{
										me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed in world").toString(), player, player, player, true, false, false, null, sign.getLine(2), "SURVIVAL");
										me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), sign.getLine(2), GameMode.SURVIVAL);
									}
									
								}
								else if(me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, sign.getLine(2)).equals("ADVENTURE"))
								{
									me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.Your GameMode has been changed in world").toString(), player, player, player, true, false, false, null, sign.getLine(2), "SURVIVAL");
									me.Vinceguy1.ChangeGameMode.Functions.FilesOld.Function(player, me.Vinceguy1.ChangeGameMode.ConfigClass.config.getBoolean("Settings.Multi World GameModes"), sign.getLine(2), GameMode.SURVIVAL);
								}
							}
							else
							{
								me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.No Permission").toString(), player, player, player, true, false, false, null);
							}
						}
					}
				}
			}
		}
		return cancelled;
	}
}
