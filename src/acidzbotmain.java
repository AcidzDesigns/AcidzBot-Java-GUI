import org.jibble.pircbot.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Acidz
 */
public class acidzbotmain {
    
    public static void main(String[] args) throws Exception{
		
		Acidzbot bot = new Acidzbot();
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, "oauth:6yfvfab47f79zzzluxu2gp5y7pddrg");
		bot.joinChannel("CHANNEL");
	}

}
