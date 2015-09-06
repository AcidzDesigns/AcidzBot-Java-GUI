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
public class Acidzbot extends PircBot  {
    
    public Acidzbot() {
        this.setName("USERNAME");
    }
    
    
    @Override
    public void onMessage(String channel, String sender, String login, String hostname, String message) {
        
        if(message.equalsIgnoreCase("PING"))
            sendMessage(channel, "PONG");
    
    
    
    }    
    
}
