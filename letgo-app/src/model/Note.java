package model;

public class Note {
	private String title;
	private int pageNo;
    //
	public Note(String title) {
		super();
		this.title = title;
	}
	
	public Note(String title, int pageNo) {
		super();
		this.title = title;
		this.pageNo = pageNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
}
