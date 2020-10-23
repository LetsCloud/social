package io.demo.social.client;

import com.github.nalukit.nalu.client.application.IsApplication;
import com.github.nalukit.nalu.client.application.annotation.Application;
import com.github.nalukit.nalu.client.application.annotation.Filters;
import io.demo.social.client.filter.LoginFilter;

@Application(context = SocialContext.class, 
	startRoute = Route.HOME_ROUTE, 
	loader = SocialLoader.class, 
	useHash = true, 
	useColonForParametersInUrl = true)
@Filters(filterClasses = LoginFilter.class)
public interface SocialApplication extends IsApplication {

}
