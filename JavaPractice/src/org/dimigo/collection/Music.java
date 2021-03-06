/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *   │_ Music
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 * 
 * @author		: 이상빈
 * @version		: 1.0
 */
public class Music {
	private String title;
	private String singer;
	/**
	 * @param title
	 * @param singer
	 */
	
	public Music() {}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
	
}
