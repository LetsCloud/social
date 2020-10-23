package io.demo.social.client.app;

import com.github.nalukit.nalu.client.component.AbstractShell;
import com.github.nalukit.nalu.client.component.annotation.Shell;
import elemental2.dom.CSSProperties;
import io.demo.social.client.Route;
import io.demo.social.client.SocialContext;
import io.demo.social.client.event.MenuLockEvent;

import java.lang.Override;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.style.ColorScheme;

@Shell(Route.APP_SHELL)
public class ApplicationShell extends AbstractShell<SocialContext> {
	private Layout layout;

	public ApplicationShell() {
		super();
	}

	@Override
	public void attachShell() {
		layout = Layout.create("Demo Social App").show(ColorScheme.CYAN);
		layout.showFooter().fixFooter().getFooter().element().style.minHeight = CSSProperties.MinHeightUnionType
				.of("42px");
		layout.getFooter().setId(Route.APP_FOOTER_SELECTOR);
		layout.getLeftPanel().setId(Route.APP_NAVIGATION_SELECTOR);
		layout.getContentPanel().setId(Route.APP_CONTENT_SELECTOR);

		this.eventBus.addHandler(MenuLockEvent.TYPE, e -> {
			if (e.getLocked()) {
				layout.fixLeftPanelPosition();
			} else {
				layout.unfixLeftPanelPosition();
				layout.hideLeftPanel();
			}
		});
	}

	@Override
	public void detachShell() {
		this.layout.remove();
	}
}
