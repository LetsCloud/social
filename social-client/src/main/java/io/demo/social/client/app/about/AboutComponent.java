package io.demo.social.client.app.about;

import com.github.nalukit.nalu.client.component.AbstractComponent;
import elemental2.dom.HTMLElement;
import io.demo.social.shared.model.MyModel;
import java.lang.Override;
import org.dominokit.domino.ui.cards.Card;

public class AboutComponent extends AbstractComponent<IAboutComponent.Controller, HTMLElement>
		implements IAboutComponent {
	private Card card;

	public AboutComponent() {
		super();
	}

	@Override
	public void edit(MyModel model) {
		// That's a good place to move your data out of the model into the widgets.
		//
		// Using GWT 2.x you can use the editor framework and in this case
		// it is a good idea to edit and flush the data inside the presenter.
		card.setTitle(model.getActiveScreen());
	}

	@Override
	public void render() {
		card = Card.create("");
		initElement(card.element());
	}
}
