package io.demo.social.client;

import com.github.nalukit.nalu.client.application.AbstractApplicationLoader;
import com.github.nalukit.nalu.client.application.IsApplicationLoader;
import java.lang.Override;

public class SocialLoader extends AbstractApplicationLoader<SocialContext> {
	@Override
	public void load(IsApplicationLoader.FinishLoadCommand finishLoadCommand) {
		// enter your code here ...
		finishLoadCommand.finishLoading();
	}
}
