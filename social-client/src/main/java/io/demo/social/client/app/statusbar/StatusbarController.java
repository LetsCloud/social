package io.demo.social.client.app.statusbar;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import elemental2.dom.HTMLElement;
import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import io.demo.social.client.event.StatusChangeEvent;
import java.lang.Override;
import org.gwtproject.event.shared.HandlerRegistration;

// @formatter:off
@Controller(route = Route.NAVIGATION_ROUTE, 
	selector = Route.APP_FOOTER_SELECTOR, 
	componentInterface = IStatusbarComponent.class, 
	component = StatusbarComponent.class)
// @formatter:on
public class StatusbarController extends AbstractComponentController<SocialContext, IStatusbarComponent, HTMLElement>
		implements IStatusbarComponent.Controller {
	private HandlerRegistration registration;

	public StatusbarController() {
	}

	@Override
	public void start() {
		this.registration = this.eventBus.addHandler(StatusChangeEvent.TYPE, e -> component.edit(e.getStatus()));
	}

	@Override
	public void stop() {
		this.registration.removeHandler();
	}
}
