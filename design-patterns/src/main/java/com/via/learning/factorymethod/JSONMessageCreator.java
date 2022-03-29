/**
 * 
 */
package com.via.learning.factorymethod;

/**
 * @author va.alberto
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}
