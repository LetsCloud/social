package io.demo.social.client;

import com.github.nalukit.nalu.plugin.elemental2.client.NaluPluginElemental2;
import com.google.gwt.core.client.EntryPoint;

public class Social implements EntryPoint {
	public void onModuleLoad() {
		SocialApplication application = new SocialApplicationImpl();
		application.run(new NaluPluginElemental2());
	}
}
