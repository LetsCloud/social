package io.demo.social.client.app.home;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import elemental2.dom.HTMLElement;
import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import io.demo.social.client.event.StatusChangeEvent;
import io.demo.social.shared.model.MyModel;
import java.lang.Override;

//@formatter:off
@Controller(route = Route.HOME_ROUTE, 
	selector = Route.APP_CONTENT_SELECTOR, 
	componentInterface = IHomeComponent.class, 
	component = HomeComponent.class)
//@formatter:on
public class HomeController extends AbstractComponentController<SocialContext, IHomeComponent, HTMLElement>
		implements IHomeComponent.Controller {
	private MyModel model;

	public HomeController() {
	}

	@Override
	public void start() {
		// Here we simulate the creation of a model.
		// In the real world we would do a server call or
		// something else to get the data.
		model = new MyModel("This value is set using the edit method! The value is >>" + "Screen01" + "<<");
		//
		// now, move the data out of the model into the widgets - that's what we do next
		component.edit(model);
		// update the statusbar at the bottom of the screen
		eventBus.fireEvent(new StatusChangeEvent("active screen: >>Screen01<<"));
	}
}
