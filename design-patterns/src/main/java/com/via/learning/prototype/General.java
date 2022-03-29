/**
 * 
 */
package com.via.learning.prototype;

/**
 * @author va.alberto Doesnt support cloning
 */
public class General extends GameUnit {

	private String state = "idle";

	public void boostMorale() {
		this.state = "MoralBoost";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("General ");
		sb.append(state);
		sb.append(" @ ");
		sb.append(getPosition());
		return sb.toString();
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("General are unique");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported");

	}

}
