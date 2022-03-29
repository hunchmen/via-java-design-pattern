/**
 * 
 */
package com.via.learning.singleton;

/**
 * @author va.alberto
 * @description This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {
	
	private EagerRegistry() {
		// TODO Auto-generated constructor stub
	}
	
	private static final EagerRegistry INSTANCE = new EagerRegistry();
	
	public static EagerRegistry getInstance() {
		return INSTANCE;
	}
}
