package io.demo.social.client.app.about;

import com.github.nalukit.nalu.client.component.IsComponent;
import elemental2.dom.HTMLElement;
import io.demo.social.shared.model.MyModel;

public interface IAboutComponent extends IsComponent<IAboutComponent.Controller, HTMLElement> {

	void edit(MyModel model);

	interface Controller extends IsComponent.Controller {
	}
}
