package io.demo.social.client.login;

import com.github.nalukit.nalu.client.component.AbstractComponent;

import elemental2.dom.HTMLElement;
import java.lang.Override;
import org.dominokit.domino.ui.button.Button;
import org.dominokit.domino.ui.button.ButtonSize;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.forms.FieldsGrouping;
import org.dominokit.domino.ui.forms.TextBox;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.icons.Icons;

public class LoginComponent extends AbstractComponent<ILoginComponent.Controller, HTMLElement>
		implements ILoginComponent {

	private TextBox userId;

	private TextBox password;

	private FieldsGrouping fieldsGrouping;

	public LoginComponent() {
		super();
	}

	@Override
	public void render() {
		fieldsGrouping = FieldsGrouping.create();
		this.userId = TextBox.create("User ID").groupBy(fieldsGrouping).addLeftAddOn(Icons.ALL.label());
		this.password = TextBox.create("Password").groupBy(fieldsGrouping).addLeftAddOn(Icons.ALL.location_on());
		
		// @formatter:off
		initElement(Row.create()
			.appendChild(Column.span4()
				.offset4()
				.appendChild(Card.create("Welcome - Please Login")
					.appendChild(Row.create()
						.addColumn(Column.span12()
							.appendChild(this.userId)))
					.appendChild(Row.create()
						.addColumn(Column.span12()
							.appendChild(this.password)))
					.appendChild(Row.create()
						.setGap("10px")
						.addColumn(Column.span12()
							.appendChild(Button.createPrimary("Login")
								.setSize(ButtonSize.LARGE)
								.style()
									.setMinWidth("120px")
									.get()
								.addClickListener(e -> getController()
									.doLogin(this.userId.getValue(), this.password.getValue()))))
								.style().setTextAlign("right"))))
			.element());
		// @formatter:on
	}
}
