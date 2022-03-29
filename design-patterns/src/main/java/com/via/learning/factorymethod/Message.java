/**
 * 
 */
package com.via.learning.factorymethod;

/**
 * @author va.alberto
 *
 */
public abstract class Message {

	public abstract String getContent();

	public void addDefaultHeaders() {
		// Adds some default headers
	}

	public void encrypt() {
		// code to encrypt the content
	}
}
