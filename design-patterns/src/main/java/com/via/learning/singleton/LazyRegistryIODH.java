/**
 * 
 */
package com.via.learning.singleton;

/**
 * @author va.alberto
 * @description Single pattern using lazy initialization holder class. This
 *              ensures that, we have a lazy initialization without about
 *              synchronization.
 */
public class LazyRegistryIODH {
	
	private LazyRegistryIODH() {
		System.out.println("LazyRegistryIODH");
	}
	
	private static class RegistryHolder  {
		static LazyRegistryIODH INSTANACE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANACE;
	}
	
}
