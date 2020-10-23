package io.demo.social.client.app.profile;

import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLElement;
import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import io.demo.social.client.event.StatusChangeEvent;
import io.demo.social.shared.model.MyModel;
import java.lang.Override;
import java.lang.String;

//@formatter:off
@Controller(
    route = Route.PROFILE_ROUTE,
    selector = Route.APP_CONTENT_SELECTOR,
    componentInterface = IProfileComponent.class,
    component = ProfileComponent.class
)
//@formatter:on
public class ProfileController extends AbstractComponentController<SocialContext, IProfileComponent, HTMLElement>
		implements IProfileComponent.Controller {
	private MyModel model;

	public ProfileController() {
	}

	@Override
	public void start() {
		// Here we simulate the creation of a model.
		// In the real world we would do a server call or
		// something else to get the data.
		model = new MyModel("This value is set using the edit method! The value is >>" + "Screen03" + "<<");
		//
		// now, move the data out of the model into the widgets - that's what we do next
		component.edit(model);
		// update the statusbar at the bottom of the screen
		eventBus.fireEvent(new StatusChangeEvent("active screen: >>Screen03<<"));
	}

	/**
	 * The mayStop method will be called by the framework in case a navigation event
	 * occured.
	 *
	 * It is up to this method to decide if the navigation event will be executed or
	 * not.
	 *
	 * this is a good place to validate the entered data and move it into the model.
	 */
	@Override
	public String mayStop() {
		// check if there are changes
		if (component.isDirty()) {
			// are you sure? :-)
			if (DomGlobal.window.confirm("Do you really want to cancel?")) {
				// ok, but before, we check the entered data (type safety and required fields)
				if (component.isValid()) {
					// move the data into the model
					component.flush(model);
					// navigate!
					return null;
				} else {
					return "Please correct the error!";
				}
			}
		} else {
			return null;
		}
		return null;
	}
}
