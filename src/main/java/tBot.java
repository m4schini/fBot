import org.jibble.pircbot.PircBot;

public class tBot extends PircBot {
	/*
	Pircbot
	(c) Paul Mutton
	 */
	public tBot() throws Exception {
		this.setName("derfidschi");
		this.connect("irc.chat.twitch.tv", 6667, "oauth:wina1jfkwzqzoraqb0vqy7jes8m93l");
		this.sendRawLine("CAP REQ :twitch.tv/membership");
		
		this.setVerbose(false); //debug
	}
	
	public void onJoin (String channel, String sender, String login, String hostname) {
		Tools.liveUser(sender, true);
	}
	public void onPart (String channel, String sender, String login, String hostname) {
		Tools.liveUser(sender, false);
	}
}