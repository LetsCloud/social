package io.demo.social.client.login;

import com.github.nalukit.nalu.client.component.IsComponent;
import elemental2.dom.HTMLElement;
import java.lang.String;

public interface ILoginComponent extends IsComponent<ILoginComponent.Controller, HTMLElement> {
	interface Controller extends IsComponent.Controller {
		void doLogin(String userId, String password);
	}
}
