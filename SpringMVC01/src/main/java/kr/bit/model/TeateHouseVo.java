package kr.bit.model;

public class TeateHouseVo {
	private int num;
	private String id;
	private String area;
	private String urllink;
	 
	public TeateHouseVo() { }
	 
	public TeateHouseVo(int num, String id, String area, String urllink) { 
		this.num = num;
		this.id = id;
		this.area = area;
		this.urllink = urllink;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUrllink() {
		return urllink;
	}

	public void setUrllink(String urllink) {
		this.urllink = urllink;
	}

	@Override
	public String toString() {
		return "TeateHouseVo [num=" + num + ", id=" + id + ", area=" + area + ", urllink=" + urllink + "]";
	}	

}
