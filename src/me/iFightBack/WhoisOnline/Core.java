package me.iFightBack.WhoisOnline;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	/*
	Hi bukkit dev staff.
	I know you are working very hard to review plugins for us!
	I love you all very much <3
	-ifightback\\Xlegit
	*/
	public void onEnable() {
	getServer().getLogger().info("[Who is staff] has been enabled!");
		this.getConfig();
		this.getConfig().options().copyDefaults(true);
	    this.saveDefaultConfig();

	}
	public void onDisable() {
		getServer().getLogger().info("[Who is staff] has been disabled!");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		String ServerName = ChatColor.GOLD+"";
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("staff")) {
		player.sendMessage(ChatColor.GOLD+"==="+this.getConfig().getString("ServerName")+"===");
		for (Player p : Bukkit.getOnlinePlayers()) {
		//developer
		if(p.hasPermission("whoisstaff.developer")){
			player.sendMessage(ChatColor.GREEN +p.getName()+"   Developer");
		//admin	
		if(p.hasPermission("whoisstaff.admin")){
			player.sendMessage(ChatColor.RED +p.getName()+"   Admin");
		//moderator
		if(p.hasPermission("whoisstaff.moderator")) {
			player.sendMessage(ChatColor.DARK_GREEN +p.getName()+"   Moderator");
		//owner
		if(p.hasPermission("whoisstaff.owner")) {
			player.sendMessage(ChatColor.BLUE +p.getName()+"   Owner");
		}
		}
		}
		}
		}
		}
	return true;
	}
}