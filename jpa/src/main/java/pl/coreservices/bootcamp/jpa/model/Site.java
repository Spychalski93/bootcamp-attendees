package pl.coreservices.bootcamp.jpa.model;



/**
 * Created by BKuczynski on 2016-12-15.
 */

public class Site extends Content {

	private Site parent;

	public Site getParent() {
		return parent;
	}

	public void setParent(Site parent) {
		this.parent = parent;
	}
}
