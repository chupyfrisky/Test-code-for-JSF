package net.sf.vastlxa;

import com.googlecode.gmail4j.GmailConnection;
import com.googlecode.gmail4j.GmailMessage;
import com.googlecode.gmail4j.http.HttpGmailConnection;

public class GMailLoginService
{
	public static login(String user, char[] password) throws Exception
	{
		GmailConnection connection = new HttpGmailConnection(user, password);
		client.setConnection(connection);
		for (GmailMessage message : client.getUnreadMessages())
		{
			System.out.println(message);
		}
	}
}
