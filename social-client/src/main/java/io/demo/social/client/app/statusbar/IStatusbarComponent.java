package io.demo.social.client.app.statusbar;

import com.github.nalukit.nalu.client.component.IsComponent;
import elemental2.dom.HTMLElement;
import java.lang.String;

public interface IStatusbarComponent extends IsComponent<IStatusbarComponent.Controller, HTMLElement> {
	
	void edit(String message);

	interface Controller extends IsComponent.Controller {
	}
}
