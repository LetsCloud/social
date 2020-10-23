/**
 * 
 */
package io.demo.social.client.event;

import org.gwtproject.event.shared.Event;

/**
 * @author robi
 *
 */
public class MenuLockEvent extends Event<MenuLockEvent.MenuLockEventHandler> {
	public static Event.Type<MenuLockEvent.MenuLockEventHandler> TYPE = new Event.Type<>();

	private boolean locked;

	public MenuLockEvent(boolean locked) {
		super();
		this.locked = locked;
	}

	public boolean getLocked() {
		return this.locked;
	}

	@Override
	public Event.Type<MenuLockEvent.MenuLockEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	public void dispatch(MenuLockEvent.MenuLockEventHandler handler) {
		handler.onMenuLocking(this);
	}

	public interface MenuLockEventHandler {
		void onMenuLocking(MenuLockEvent event);
	}
}
