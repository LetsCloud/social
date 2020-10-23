/**
 * 
 */
package io.demo.social.client;

/**
 * @author robi
 *
 */
public class Route {

	public static final String APP_SHELL = "app";
	public static final String APP_NAVIGATION_SELECTOR = "navigation";
	public static final String APP_CONTENT_SELECTOR = "content";
	public static final String APP_FOOTER_SELECTOR = "footer";
	
	public static final String NAVIGATION_ROUTE = "/" + APP_SHELL + "/";

	public static final String HOME_ROUTE = "/" + APP_SHELL + "/home";

	public static final String PROFILE_ROUTE = "/" + APP_SHELL + "/profile";

	public static final String ABOUT_ROUTE = "/" + APP_SHELL + "/about";

	public static final String LOGIN_SHELL = "loginShell";
	public static final String LOGIN_CONTENT_SELECTOR = "content";
	public static final String LOGIN_ROUTE = "/" + LOGIN_SHELL + "/login";
}
