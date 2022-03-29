/**
 * 
 */
package com.via.learning.abstractfactory;

/**
 * @author va.alberto
 *
 */
public class GoogleCloudStorage implements Storage {

	public GoogleCloudStorage(int capacityInMib) {
		// Use GCP API
		System.out.println(
				"Allocated " + capacityInMib + " on Google Cloud storage");
	}

	@Override
	public String getId() {
		return "GCS";
	}

	@Override
	public String toString() {
		return "GCS Storage";
	}

}
