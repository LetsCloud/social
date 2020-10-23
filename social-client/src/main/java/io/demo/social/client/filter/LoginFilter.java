package io.demo.social.client.filter;

import com.github.nalukit.nalu.client.filter.AbstractFilter;

import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import java.lang.Override;
import java.lang.String;

public class LoginFilter extends AbstractFilter<SocialContext> {
	@Override
	public boolean filter(String route, String... parms) {
		if (!Route.LOGIN_ROUTE.equals(route)) {
			if (!this.context.isLoggedIn()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String redirectTo() {
		return Route.LOGIN_ROUTE;
	}

	@Override
	public String[] parameters() {
		return new String[] {};
	}
}
