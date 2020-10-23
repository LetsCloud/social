package io.demo.social.client.app.home;

import com.github.nalukit.nalu.client.component.IsComponent;
import elemental2.dom.HTMLElement;
import io.demo.social.shared.model.MyModel;

public interface IHomeComponent extends IsComponent<IHomeComponent.Controller, HTMLElement> {

	void edit(MyModel model);

	interface Controller extends IsComponent.Controller {
	}
}
