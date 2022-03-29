/**
 * 
 */
package com.via.learning.prototype;

/**
 * @author va.alberto
 * Thisn class support cloning
 */
public class Swordsman extends GameUnit {

	private String state = "idle";

	public void attack() {
		this.state = "attacking";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Swordsman ");
		sb.append(state);
		sb.append(" @ ");
		sb.append(getPosition());
		return sb.toString();
	}

	@Override
	protected void reset() {
		state = "idle";
		
	}

}
