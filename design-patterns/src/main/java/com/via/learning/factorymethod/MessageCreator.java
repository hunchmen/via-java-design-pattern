package com.via.learning.factorymethod;


/**
 * @author va.alberto
 * This is abstract creator
 * The abstract method createMessage() has to be implemented by
 * its subclass
 */
public abstract class MessageCreator {
	
	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}
	
	//Factory method
	public abstract Message createMessage();
}
