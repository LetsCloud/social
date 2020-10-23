package io.demo.social.client.app.navigation;

import com.github.nalukit.nalu.client.component.AbstractComponent;
import elemental2.dom.HTMLElement;
import io.demo.social.client.Route;

import java.lang.Override;

import org.dominokit.domino.ui.icons.Icon;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.style.Calc;
import org.dominokit.domino.ui.style.Styles;
import org.dominokit.domino.ui.tree.Tree;
import org.dominokit.domino.ui.tree.TreeItem;

import static org.dominokit.domino.ui.style.Unit.px;
import static org.dominokit.domino.ui.style.Unit.vh;

public class NavigationComponent extends AbstractComponent<INavigationComponent.Controller, HTMLElement>
		implements INavigationComponent {

	private Icon lockIcon = Icons.ALL.lock_open().style().setMarginBottom("0px").setMarginTop("0px")
			.setCursor("pointer").add(Styles.pull_right).get();
	private boolean locked = false;
	private TreeItem<String> homeItem;

	private TreeItem<String> profileItem;

	private TreeItem<String> aboutItem;

	public NavigationComponent() {
		super();
	}

	@Override
	public void render() {
		Tree<String> menu = Tree.create("Social Menu");

		menu.getHeader().appendChild(lockIcon.element());

		lockIcon.addClickListener(evt -> {
			if (locked) {
				this.getController().onLockMenu(false);
				lockIcon.element().textContent = Icons.ALL.lock().getName();
				locked = false;
			} else {
				this.getController().onLockMenu(true);
				lockIcon.element().textContent = Icons.ALL.lock_open().getName();
				locked = true;
			}
		});

		menu.enableSearch().autoExpandFound().style().setHeight(Calc.sub(vh.of(100), px.of(186))).get();

		this.homeItem = TreeItem.create("Home", Icons.ALL.home())
				.addClickListener(e -> getController().doNavigateTo(Route.HOME_ROUTE));
		this.profileItem = TreeItem.create("Profile", Icons.ALL.account_box())
				.addClickListener(e -> getController().doNavigateTo(Route.PROFILE_ROUTE));
		this.aboutItem = TreeItem.create("About", Icons.ALL.info())
				.addClickListener(e -> getController().doNavigateTo(Route.ABOUT_ROUTE));

		menu.appendChild(homeItem);
		menu.appendChild(profileItem);
		menu.appendChild(aboutItem);

		initElement(menu.element());
	}
}
