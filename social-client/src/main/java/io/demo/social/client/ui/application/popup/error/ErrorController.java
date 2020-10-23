package io.demo.social.client.ui.application.popup.error;

import com.github.nalukit.nalu.client.component.AbstractErrorPopUpComponentController;
import com.github.nalukit.nalu.client.component.annotation.ErrorPopUpController;

import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import java.lang.Override;

//@formatter:off
@ErrorPopUpController(
    componentInterface = IErrorComponent.class,
    component = ErrorComponent.class
)
//@formatter:on
public class ErrorController extends AbstractErrorPopUpComponentController<SocialContext, IErrorComponent>
		implements IErrorComponent.Controller {
	public ErrorController() {
	}

	@Override
	public void onBeforeShow() {
		this.component.clear();
	}

	@Override
	public void show() {
		this.component.edit(this.errorEventType, this.route, this.message, this.dataStore);
		this.component.show();
	}

	@Override
	public void doRouteHome() {
		this.router.route(Route.HOME_ROUTE);
	}
}
