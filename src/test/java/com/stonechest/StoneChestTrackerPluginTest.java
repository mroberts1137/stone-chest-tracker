package com.stonechest;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class StoneChestTrackerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(StoneChestTrackerPlugin.class);
		RuneLite.main(args);
	}
}