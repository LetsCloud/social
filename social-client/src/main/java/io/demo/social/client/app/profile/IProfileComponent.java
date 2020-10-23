package io.demo.social.client.app.profile;

import com.github.nalukit.nalu.client.component.IsComponent;
import elemental2.dom.HTMLElement;
import io.demo.social.shared.model.MyModel;

public interface IProfileComponent extends IsComponent<IProfileComponent.Controller, HTMLElement> {
	void edit(MyModel model);

	boolean isDirty();

	boolean isValid();

	void flush(MyModel model);

	interface Controller extends IsComponent.Controller {
	}
}
