/**
 * 
 */
package com.via.learning.abstractfactory;

/**
 * @author va.alberto
 * @description Abstract factory with methods defined for each object type.
 */
public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);

	Storage createStorage(int capMib);

}
