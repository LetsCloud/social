/**
 * 
 */
package io.demo.social.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.demo.social.shared.model.AuthProvider;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Unindexed;
import org.springframework.data.annotation.Id;

/**
 * @author robi
 *
 */
@Entity(name = "user")
public class User {
	
	@Id
	private Long id;
	
	@Unindexed
	private String name;

	private String email;

	@Unindexed
	private String imageUrl;

	@Unindexed
	private Boolean emailVerified = false;

	@JsonIgnore
	@Unindexed
	private String password;

	@Unindexed
	private AuthProvider provider;

	@Unindexed
	private String providerId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthProvider getProvider() {
		return provider;
	}

	public void setProvider(AuthProvider provider) {
		this.provider = provider;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
}