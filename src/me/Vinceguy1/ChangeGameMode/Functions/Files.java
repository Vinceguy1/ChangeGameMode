package me.Vinceguy1.ChangeGameMode.Functions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class Files
{
	public static void ReadGameMode (Player player, String world, boolean multiworld)
	{
		if (multiworld == true)
		{
			File file = new File("plugins/ChangeGameMode/MW/" + player.getName() + ".txt");
			if (file.exists())
			{
				try
				{
					BufferedReader defaultreader = new BufferedReader(new FileReader(file));
					LineNumberReader lnr = new LineNumberReader(new FileReader((file)));
					lnr.skip(Long.MAX_VALUE);
					int lines = lnr.getLineNumber();
					boolean stop = false;
					for(int x = 0; x <= lines; x++)
					{
						String Line = defaultreader.readLine();
						String[] LineArray = Line.split(",");
						if (LineArray[0].equals(world))
						{
							stop = true;
							player.setGameMode(GameMode.valueOf(LineArray[1]));
						}
					}
					defaultreader.close();
					if (stop == false)
					{
						File file2 = new File("plugins/ChangeGameMode/MW/default.txt");
						BufferedReader defaultreader2 = new BufferedReader(new FileReader(file2));
						LineNumberReader lnr2 = new LineNumberReader(new FileReader((file2)));
						lnr2.skip(Long.MAX_VALUE);
						int lines2 = lnr2.getLineNumber();
						boolean stop2 = false;
						for(int x = 0; x <= lines2; x++)
						{
							String Line2 = defaultreader2.readLine();
							String[] LineArray2 = Line2.split(",");
							if (LineArray2[0].equals(world))
							{
								player.setGameMode(GameMode.valueOf(LineArray2[1]));
								stop2 = true;
							}
						}
						if (stop2 == false)
						{
							player.setGameMode(GameMode.SURVIVAL);
						}
						defaultreader2.close();
					}
				}
				catch (IOException ex)
				{

				}
			}
			else /** file doesn't exist **/
			{
				try
				{
					File file2 = new File("plugins/ChangeGameMode/MW/default.txt");
					BufferedReader defaultreader2 = new BufferedReader(new FileReader(file2));
					LineNumberReader lnr2 = new LineNumberReader(new FileReader((file2)));
					lnr2.skip(Long.MAX_VALUE);
					int lines2 = lnr2.getLineNumber();
					boolean stop2 = false;
					for(int x = 0; x <= lines2; x++)
					{
						String Line2 = defaultreader2.readLine();
						String[] LineArray2 = Line2.split(",");
						if (LineArray2[0].equals(world))
						{
							player.setGameMode(GameMode.valueOf(LineArray2[1]));
							stop2 = true;
						}
					}
					if (stop2 == false)
					{
						player.setGameMode(GameMode.SURVIVAL);
					}
					defaultreader2.close();
				}
				catch (IOException ex)
				{

				}
			}
		}
		else /** multiworld == false **/
		{
			try
			{
				File file = new File("plugins/ChangeGameMode/NMW/" + player.getName() + ".txt");
				if (file.exists())
				{
					BufferedReader defaultreader = new BufferedReader(new FileReader(file));
					String gamemode = defaultreader.readLine();
					player.setGameMode(GameMode.valueOf(gamemode));
				}
				else /** file doesn't exist **/
				{
					File file2 = new File("plugins/ChangeGameMode/NMW/default.txt");
					BufferedReader defaultreader = new BufferedReader(new FileReader(file2));
					String gamemode = defaultreader.readLine();
					player.setGameMode(GameMode.valueOf(gamemode));
				}
			}
			catch (IOException ex)
			{
				
			}
		}
	}
	public static void WriteGameMode (Player player, String world, boolean multiworld)
	{
		if (multiworld == true)
		{
			File file = new File("plugins/ChangeGameMode/MW/" + player.getName() + ".txt");
			if (file.exists())
			{
				try
				{
					BufferedReader defaultreader = new BufferedReader(new FileReader(file));
					LineNumberReader lnr = new LineNumberReader(new FileReader((file)));
					lnr.skip(Long.MAX_VALUE);
					int lines = lnr.getLineNumber();
					StringBuilder s = new StringBuilder();
					boolean stop = false;
					for(int x = 0; x <= lines; x++)
					{
						String Line = defaultreader.readLine();
						String[] LineArray = Line.split(",");
						if (LineArray[0].equals(world))
						{
							Line = world + "," + player.getGameMode().toString();
							if (x != lines)
								Line += "\r\n";
							stop = true;
						}
						else if (x == lines && stop == false)
							Line += "\r\n" + world + "," + player.getGameMode().toString();
						else
							Line +="\r\n";
						s.append(Line);
					} 
					defaultreader.close();
					BufferedWriter defaultwriter = new BufferedWriter(new FileWriter(file));
					defaultwriter.write(String.valueOf(s));
					defaultwriter.close();
				}
				catch (IOException ex)
				{

				}
			}
			else /** File does not exist **/
			{
				try
				{
					BufferedWriter defaultwriter = new BufferedWriter(new FileWriter(file));
					defaultwriter.write(world + "," + player.getGameMode().toString());
					defaultwriter.close();
				}
				catch (IOException ex)
				{
					
				}
			}
		}
		else /** multiworld == false **/
		{
			try
			{
				File file = new File("plugins/ChangeGameMode/NMW/" + player.getName() + ".txt");
				BufferedWriter writedefault = new BufferedWriter(new FileWriter(file));
				writedefault.write(player.getGameMode().toString());
				writedefault.close();
			}
			catch (IOException ex)
			{
				
			}
		}
	}
	public static void WriteDefault (String gamemode, String world, boolean multiworld)
	{
		if (multiworld == true)
		{
			File file = new File("plugins/ChangeGameMode/MW/default.txt");
			if (file.exists())
			{
				try
				{
					BufferedReader defaultreader = new BufferedReader(new FileReader(file));
					LineNumberReader lnr = new LineNumberReader(new FileReader((file)));
					lnr.skip(Long.MAX_VALUE);
					int lines = lnr.getLineNumber();
					StringBuilder s = new StringBuilder();
					boolean stop = false;
					for(int x = 0; x <= lines; x++)
					{
						String Line = defaultreader.readLine();
						String[] LineArray = Line.split(",");
						if (LineArray[0].equals(world))
						{
							Line = world + "," + gamemode.toUpperCase();
							if (x != lines)
								Line += "\r\n";
							stop = true;
						}
						else if (x == lines && stop == false)
							Line += "\r\n" + world + "," + gamemode.toUpperCase();
						else
							Line +="\r\n";
						s.append(Line);
					} 
					defaultreader.close();
					BufferedWriter defaultwriter = new BufferedWriter(new FileWriter(file));
					defaultwriter.write(String.valueOf(s));
					defaultwriter.close();
				}
				catch (IOException ex)
				{

				}
			}
			else /** File does not exist **/
			{
				try
				{
					BufferedWriter defaultwriter = new BufferedWriter(new FileWriter(file));
					defaultwriter.write(world + "," + gamemode.toUpperCase());
					defaultwriter.close();
				}
				catch (IOException ex)
				{
					
				}
			}
		}
		else /** multiworld == false **/
		{
			try
			{
				File file = new File("plugins/ChangeGameMode/NMW/default.txt");
				BufferedWriter writedefault = new BufferedWriter(new FileWriter(file));
				writedefault.write(gamemode.toUpperCase());
				writedefault.close();
			}
			catch (IOException ex)
			{
				
			}
		}
	}
}
