package net.cartery.AspirePvanishP;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hideExecutor implements CommandExecutor {
	
	private AspirePvanishP apvp;
	
	
	public hideExecutor(AspirePvanishP apvp) {
		this.apvp = apvp;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("AspirePvanishP.hide")) {
				
					Player s = (Player)sender;
					Player target = sender.getServer().getPlayer(args[1]);
					target.hidePlayer(s);
					return true;
				
			} else {
			
				sender.sendMessage("Not enough permissions");
				
			}
			
		} else {
			sender.sendMessage("You must be a player.");
			return false;
		}
		return false;
	}
		
}
