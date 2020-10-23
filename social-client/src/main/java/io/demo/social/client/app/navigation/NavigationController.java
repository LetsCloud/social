package io.demo.social.client.app.navigation;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import elemental2.dom.HTMLElement;
import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import io.demo.social.client.event.MenuLockEvent;

import java.lang.Override;
import java.lang.String;

//@formatter:off
@Controller(route = Route.NAVIGATION_ROUTE, 
	selector = Route.APP_NAVIGATION_SELECTOR, 
	componentInterface = INavigationComponent.class, 
	component = NavigationComponent.class)
//@formatter:on
public class NavigationController extends AbstractComponentController<SocialContext, INavigationComponent, HTMLElement>
		implements INavigationComponent.Controller {

	public NavigationController() {
	}

	@Override
	public void doNavigateTo(String target) {
		router.route(target);
	}

	@Override
	public void onLockMenu(boolean locked) {
    	this.eventBus.fireEvent(new MenuLockEvent(locked));
	}
}
