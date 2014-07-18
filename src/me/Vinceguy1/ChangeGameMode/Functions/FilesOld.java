package me.Vinceguy1.ChangeGameMode.Functions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FilesOld
{
	public static void Function(CommandSender sender, Player player, boolean mw, boolean read)
	{
		String gamemode = "SURVIVAL";
		if(mw)
		{
			File folder = new File("plugins/ChangeGameMode/MW/");
			if(!folder.exists())
				folder.mkdir();
			File file = new File("plugins/ChangeGameMode/MW/" + player.getName() + ".txt");
			if(!file.exists())
			{
				if(!read)
				{
					try
					{
						file.createNewFile();
						BufferedWriter GameModeFileWriter = new BufferedWriter(new FileWriter(file));
						GameModeFileWriter.write(player.getWorld().getName().toString() + "," + player.getGameMode());
						GameModeFileWriter.newLine();
						GameModeFileWriter.close();
					}
					catch(IOException ex)
					{
						if (sender instanceof Player)
						{
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, (Player) sender, player, true, false, false, null);
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, (Player) sender, player, false, false, true, null);
						}
						else
						{
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, null, player, true, false, false, null);
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, null, player, false, false, true, null);
						}
					}
				}
				else
				{
					try
					{
						File file2 = new File("plugins/ChangeGameMode/MW/default.txt");
						BufferedReader defaultreader = new BufferedReader(new FileReader(file2));
						LineNumberReader  lnr = new LineNumberReader(new FileReader((file2)));
						lnr.skip(Long.MAX_VALUE);
						int p = lnr.getLineNumber();
						boolean stop = false;
						for(int a = 0; a < p; a++)
						{
							String Line = defaultreader.readLine();
							String[] LineArray = Line.split(",");
							if (LineArray[0].equals(player.getWorld().getName()))
							{
								gamemode = LineArray[1];
								stop = true;
							}
							else
								if(a == p - 1 && stop == false)
								{
									gamemode = "SURVIVAL";
								}
						}
					}
					catch (IOException ex)
					{
						
					}
				}
			}
			else
			{
				try
				{
					BufferedReader GameModeFileReader = new BufferedReader(new FileReader(file));
					LineNumberReader  lnr = new LineNumberReader(new FileReader((file)));
					lnr.skip(Long.MAX_VALUE);
					int p = lnr.getLineNumber();
					StringBuilder s = new StringBuilder();
					boolean stop = false;
					for(int a = 0; a < p; a++)
					{
						String Line = GameModeFileReader.readLine();
						String[] LineArray = Line.split(",");
						if (LineArray[0].equals(player.getWorld().getName().toString()))
						{
							gamemode = LineArray[1];
							if (!read)
							{
								Line = player.getWorld().getName().toString() + "," + player.getGameMode();
								stop = true;
							}
						}
						else
							if (a == p - 1 && !LineArray[0].equals(player.getWorld().getName().toString()) && stop == false)
							{
								try
								{
									File file2 = new File("plugins/ChangeGameMode/MW/default.txt");
									BufferedReader defaultreader = new BufferedReader(new FileReader(file2));
									LineNumberReader  lnr2 = new LineNumberReader(new FileReader((file2)));
									lnr2.skip(Long.MAX_VALUE);
									int pp = lnr.getLineNumber();
									for(int aa = 0; aa < pp; aa++)
									{
										String Line1 = defaultreader.readLine();
										String[] LineArray1 = Line1.split(",");
										if (LineArray1[0].equals(player.getWorld().getName()))
										{
											gamemode = LineArray1[1];
											stop = true;
										}
										else
											if(a == p - 1 && stop == false)
											{
												gamemode = "SURVIVAL";
											}
									}
								}
								catch (IOException ex)
								{
									
								}
							}
					} 
					GameModeFileReader.close();
					BufferedWriter GameModeFileWriter = new BufferedWriter(new FileWriter(file));
					GameModeFileWriter.write(String.valueOf(s));
					GameModeFileWriter.close();
				}
				catch(IOException ex)
				{
					if (sender instanceof Player)
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, (Player) sender, player, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, (Player) sender, player, false, false, true, null);
					}
					else
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, null, player, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, null, player, false, false, true, null);
					}
				}
			}
		}
		else
		{
			File folder = new File("plugins/ChangeGameMode/NMW/");
			if(!folder.exists())
				folder.mkdir();
			File file = new File("plugins/ChangeGameMode/NMW/" + player.getName() + ".txt");
			if(!file.exists())
			{
				if (!read)
				{
					try
					{
						file.createNewFile();
						BufferedWriter GameModeFileWriter = new BufferedWriter(new FileWriter(file));
						GameModeFileWriter.write(player.getGameMode().toString());
						GameModeFileWriter.close();
					}
					catch(IOException ex)
					{
						if (sender instanceof Player)
						{
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, (Player) sender, player, true, false, false, null);
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, (Player) sender, player, false, false, true, null);
						}
						else
						{
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, null, player, true, false, false, null);
							me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, null, player, false, false, true, null);
						}
					}
				}
				else
				{
					try
					{
						File file2 = new File("plugins/ChangeGameMode/NMW/default.txt");
						BufferedReader defaultreader = new BufferedReader(new FileReader(file2));
						String Line = defaultreader.readLine();
						gamemode = Line;
					}
					catch (IOException ex)
					{
						
					}
				}
			}
			else
			{
				try
				{
					if(read)
					{
						BufferedReader GameModeFileReader = new BufferedReader(new FileReader(file));
						gamemode = GameModeFileReader.readLine().toString();
					}
					else
					{
						BufferedWriter GameModeFileWriter = new BufferedWriter(new FileWriter(file));
						GameModeFileWriter.write(player.getGameMode().toString());
						GameModeFileWriter.close();
					}
				}
				catch(IOException ex)
				{
					if (sender instanceof Player)
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, (Player) sender, player, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, (Player) sender, player, false, false, true, null);
					}
					else
					{
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), sender, null, player, true, false, false, null);
						me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), sender, null, player, false, false, true, null);
					}
				}
			}
		}
		if(read)
		{
			if(gamemode != null)
			{
				if(gamemode.equalsIgnoreCase("SURVIVAL"))
					player.setGameMode(GameMode.SURVIVAL);
				else if(gamemode.equalsIgnoreCase("CREATIVE"))
					player.setGameMode(GameMode.CREATIVE);
				else if(gamemode.equalsIgnoreCase("ADVENTURE"))
					player.setGameMode(GameMode.ADVENTURE);
				else
					player.setGameMode(GameMode.SURVIVAL);
			}
		}
	}
	public static void Function(Player player, boolean mw, String world, GameMode gamemode)
	{
		File folder = new File("plugins/ChangeGameMode/MW/");
		if(!folder.exists())
			folder.mkdir();
		File file = new File("plugins/ChangeGameMode/MW/" + player.getName() + ".txt");
		if(!file.exists())
		{
			try
			{
				file.createNewFile();
				BufferedWriter GameModeFileWriter = new BufferedWriter(new FileWriter(file));
				player.sendMessage(world + "," + player.getGameMode());
				GameModeFileWriter.write(world + "," + gamemode);
				GameModeFileWriter.newLine();
				GameModeFileWriter.close();
			}
			catch (IOException ex)
			{
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), player, player, player, true, false, false, null);
					me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), player, player, player, false, false, true, null);
			}
		}
		else
		{
			try
			{
				BufferedReader GameModeFileReader = new BufferedReader(new FileReader(file));
				LineNumberReader  lnr = new LineNumberReader(new FileReader((file)));
				lnr.skip(Long.MAX_VALUE);
				int p = lnr.getLineNumber();
				StringBuilder s = new StringBuilder();
				boolean stop = false;
				for(int a = 0; a < p; a++)
				{
					String Line = GameModeFileReader.readLine();
					String[] LineArray = Line.split(",");
					if (LineArray[0].equals(world))
					{
						Line = world + "," + gamemode;
						stop = true;
					}
					else
						if (a == p - 1 && !LineArray[0].equals(world) && stop == false)
							Line = Line + "\r\n" + world + "," + gamemode;
					s.append(Line + "\r\n");
				} 
				GameModeFileReader.close();
				BufferedWriter GameModeFileWriter = new BufferedWriter(new FileWriter(file));
				GameModeFileWriter.write(String.valueOf(s));
				GameModeFileWriter.close();
			}
			catch(IOException ex)
			{
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), player, player, player, true, false, false, null);
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), player, player, player, false, false, true, null);
			}
		}
	}
	public static String Function(Player player, String world)
	{
		String returnstring = "ADVENTURE";
		File folder = new File("plugins/ChangeGameMode/MW/");
		if(!folder.exists())
			folder.mkdir();
		File file = new File("plugins/ChangeGameMode/MW/" + player.getName() + ".txt");
		if(file.exists())
		{
			try
			{
				BufferedReader GameModeFileReader = new BufferedReader(new FileReader(file));
				LineNumberReader  lnr = new LineNumberReader(new FileReader((file)));
				lnr.skip(Long.MAX_VALUE);
				int p = lnr.getLineNumber();
				for(int a = 0; a < p; a++)
				{
					String Line = GameModeFileReader.readLine();
					String[] LineArray = Line.split(",");
					if (LineArray[0].equals(world))
					{
						returnstring = LineArray[1];
					}
				} 
				GameModeFileReader.close();
			}
			catch(IOException ex)
			{
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Player)").toString(), player, player, player, true, false, false, null);
				me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.Errors.Cannot Access File (Sending To Console)").toString(), player, player, player, false, false, true, null);
			}
		}
		return returnstring;
	}
}
