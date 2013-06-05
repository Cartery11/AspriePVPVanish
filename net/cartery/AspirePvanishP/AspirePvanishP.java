package net.cartery.AspirePvanishP;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class AspirePvanishP extends JavaPlugin{
	
	@Override
	public void onEnable() {
		getCommand("hide").setExecutor(new hideExecutor(this));
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked.");
	}
	

	public boolean onCommand(CommandSender sender,  Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("hide")){
				Player s = (Player)sender;
				Player target = sender.getServer().getPlayer(args[1]);
				
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("help AspirePvanishP")){
			if(!(sender instanceof Player)) {
				sender.sendMessage("--- APVP ---");
				sender.sendMessage("/hide - Hides you");
				sender.sendMessage("/credits - Credits");


			}
			if(cmd.getName().equalsIgnoreCase("credits")){
				if(!(sender instanceof Player)) {
					sender.sendMessage("Credits:");
					sender.sendMessage("Coded by: Cartery11");
					sender.sendMessage("For the AspirePvP server!");


				}
			return false;
			}
		return false;
		}
		return false;
	}
}