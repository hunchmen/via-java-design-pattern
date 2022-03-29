package com.via.learning.abstractfactory;

import com.via.learning.abstractfactory.Instance.Capacity;

/**
 * @author va.alberto
 *
 */
public class Client {

	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) {
		Client aws = new Client(new AwsResourceFactory());
		Instance ins1 = aws.createServer(Capacity.micro, 20480);
		ins1.start();
		ins1.stop();

		System.out.println("============================================");
		Client gcp = new Client(new GoogleResourceFactory());
		ins1 = gcp.createServer(Capacity.micro, 20480);
		ins1.start();
		ins1.stop();

	}

}
