/**
 * 
 */
package com.via.learning.objectpool;

import javafx.geometry.Point2D;

/**
 * @author va.alberto
 *
 */
public interface Image extends Poolable {

//	void reset();

	void draw();

	Point2D getLocation();

	void setLocation(Point2D location);

}
