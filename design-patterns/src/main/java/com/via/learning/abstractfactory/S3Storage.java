/**
 * 
 */
package com.via.learning.abstractfactory;

/**
 * @author va.alberto
 * @description Represents a concrete product in a family "Amazon Web Services"
 */
public class S3Storage implements Storage {

	public S3Storage(int capacityInMib) {
		// Use GCP API
		System.out.println(
				"Allocated " + capacityInMib + " on S3 storage");
	}

	@Override
	public String getId() {
		return "S31";
	}

	@Override
	public String toString() {
		return "S3 Storage";
	}

}
