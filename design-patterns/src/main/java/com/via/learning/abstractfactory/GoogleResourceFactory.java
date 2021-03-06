package com.via.learning.abstractfactory;

import com.via.learning.abstractfactory.Instance.Capacity;

/**
 * @author va.alberto
 * @description Factory implementation for Google cloud platform resources
 */
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}

}
