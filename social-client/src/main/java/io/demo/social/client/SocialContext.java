package io.demo.social.client;

import com.github.nalukit.nalu.client.context.IsContext;

public class SocialContext implements IsContext {

	private boolean loggedIn;

	public SocialContext() {
		// enter your constructor code here ...
	}

	public boolean isLoggedIn() {
		return this.loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
}
