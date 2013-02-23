package me.iFightBack.WhoisOnline;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	public void onEnable() {
		getConfig();
	}
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		String ServerName = ChatColor.BLUE+"Smoothcraft";
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("staff")) {
		player.sendMessage(ChatColor.GOLD+"==="+this.getConfig().getString(ServerName)+"===");
		for (Player p : Bukkit.getOnlinePlayers()) {
		if(p.hasPermission("whoisstaff.developer")){
		player.sendMessage(ChatColor.GREEN +p.getName()+"   Developer");
			
				}
			}
		}
	return false;
	}
}