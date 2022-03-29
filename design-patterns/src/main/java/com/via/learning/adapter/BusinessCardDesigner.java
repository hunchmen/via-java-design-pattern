package com.via.learning.adapter;

/**
 * @author va.alberto
 * @description Client code which requires Customer interface
 */
public class BusinessCardDesigner {

	public String designerCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}

}
