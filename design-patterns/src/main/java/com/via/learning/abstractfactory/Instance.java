/**
 * 
 */
package com.via.learning.abstractfactory;

/**
 * @author va.alberto Represents an abstract product
 *
 */
public interface Instance {

	enum Capacity {
		micro, small, large
	}

	void start();

	void attachStorage(Storage storage);

	void stop();

}
