package io.demo.social.client.login;

import com.github.nalukit.nalu.client.component.AbstractShell;
import com.github.nalukit.nalu.client.component.annotation.Shell;
import elemental2.dom.CSSProperties;
import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import java.lang.Override;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.style.ColorScheme;

@Shell(Route.LOGIN_SHELL)
public class LoginShell extends AbstractShell<SocialContext> {
	private Layout layout;

	public LoginShell() {
		super();
	}

	@Override
	public void attachShell() {
		layout = Layout.create("Demo Social App").show(ColorScheme.CYAN);
		layout.showFooter().fixFooter().getFooter().element().style.minHeight = CSSProperties.MinHeightUnionType
				.of("42px");
		layout.getFooter().setId("footer");
		layout.disableLeftPanel();
		layout.getContentPanel().setId(Route.LOGIN_CONTENT_SELECTOR);
	}

	@Override
	public void detachShell() {
		this.layout.remove();
	}
}
