package com.via.learning.simplefactory;

/**
 * @author va.alberto
 * @description this class acts as simple factory for creatin of different posts
 *              in web site.
 */
public class PostFactory {

	public static Post createPost(String type) {

		switch (type) {
		case "blog":
			return new BlogPost();
		case "news":
			return new NewsPost();
		case "product":
			return new ProductPost();
		default:
			throw new IllegalArgumentException("Post type is unknown");
		}

	}

}
