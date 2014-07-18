package me.Vinceguy1.ChangeGameMode;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	
	public final me.Vinceguy1.ChangeGameMode.Listeners.PlayerListener PlayerListener = new me.Vinceguy1.ChangeGameMode.Listeners.PlayerListener();
	public final me.Vinceguy1.ChangeGameMode.Listeners.BlockListener BlockListener = new me.Vinceguy1.ChangeGameMode.Listeners.BlockListener();
	public static String version = "1.2";
	public static boolean update = false;
	
	public void RegisterEvents()
	{
		Bukkit.getServer().getPluginManager().registerEvents(PlayerListener, this);
		Bukkit.getServer().getPluginManager().registerEvents(BlockListener, this);
	}
	
	public void RegisterConfig()
	{
		ConfigClass.config = getConfig();
		ConfigClass.Config();
		saveConfig();
	}
	
	public void CheckUpdate(String ver)
	{
		URLConnection conn;
		try
		{
            conn = new URL("http://www.Vinceguy1.com/Plugins/GetVersion.php?name=ChangeGameMode").openConnection();

            conn.setConnectTimeout(5000);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String response = reader.readLine();
            float verfloat = Float.valueOf(version);
            float resfloat = Float.valueOf(response);
            if(verfloat != resfloat)
            {
            	for (Player pl : Bukkit.getOnlinePlayers())
            	{
            		if (pl.hasPermission("gm.update"))
            		{
            			me.Vinceguy1.ChangeGameMode.Functions.Message.Function(me.Vinceguy1.ChangeGameMode.ConfigClass.config.get("Messages.General.New Plugin Version").toString(), (CommandSender) pl, pl, pl, true, false, false, null);
            			update = true;
            		}
            	}
            }
		}
		catch (IOException ex)
		{
		}
            
	}
	
	public void makeFolders()
	{
		File nonmultiworldfolder = new File("plugins/ChangeGameMode/NMW/");
		if(!nonmultiworldfolder.exists())
			nonmultiworldfolder.mkdir();
		File multiworldfolder = new File("plugins/ChangeGameMode/NMW/");
		if(!multiworldfolder.exists())
			multiworldfolder.mkdir();
	}
	
	public void onEnable()
	{
		System.out.println("ChangeGameMode v1.2 {By Vinceguy1} is now enabled!");
		RegisterEvents();
		RegisterConfig();
		CheckUpdate(version);
	}
	
	public void onDisable()
	{
		System.out.println("ChangeGameMode v1.2 {By Vinceguy1} is now disabled!");
	}
		
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		me.Vinceguy1.ChangeGameMode.Listeners.CommandListener.onCommand(sender, cmd, label, args);
		return true;
	}
}
