/**
 * 
 */
package com.via.learning.singleton;

/**
 * @author va.alberto
 *
 */
public class Client {

	public static void main(String[] args) {

		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();

		LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();

		System.out.println(lazySingleton1 == lazySingleton2);

		LazyRegistryIODH singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton1 = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton3 = LazyRegistryIODH.getInstance();

	}
}
