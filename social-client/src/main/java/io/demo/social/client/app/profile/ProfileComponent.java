package io.demo.social.client.app.profile;

import com.github.nalukit.nalu.client.component.AbstractComponent;
import elemental2.dom.HTMLElement;
import io.demo.social.shared.model.MyModel;
import java.lang.Override;
import org.dominokit.domino.ui.cards.Card;

public class ProfileComponent extends AbstractComponent<IProfileComponent.Controller, HTMLElement>
		implements IProfileComponent {
	private Card card;

	public ProfileComponent() {
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

	@Override
	public boolean isDirty() {
		return true;
	}

	@Override
	public boolean isValid() {
		// check if you widgets are valid (if the widgets you are using support
		// validation)
		// This is a good place to check type-safety and required field
		//
		// In this example the data (cause there is none) will always be valid!
		return true;
	}

	@Override
	public void flush(MyModel model) {
		// move your data from the widgets to the model here ...
		//
		// It is a good idea to check the type before moving it into an object
	}
}
