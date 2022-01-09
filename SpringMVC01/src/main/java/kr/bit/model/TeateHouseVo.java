package kr.bit.model;

public class TeateHouseVo {
	private int num; 
	private String title;
	private String area;
	private String tel;
	private String holiday;
	private String urllink;
	 
	public TeateHouseVo() { }

	public TeateHouseVo(int num, String title, String area, String tel,String holiday, String urllink) { 
		this.num = num;
		this.title = title;
		this.area = area;
		this.tel = tel;
		this.holiday = holiday;
		this.urllink = urllink;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUrllink() {
		return urllink;
	}

	public void setUrllink(String urllink) {
		this.urllink = urllink;
	}

	@Override
	public String toString() {
		return "TeateHouseVo [num=" + num + ", title=" + title + ", area=" + area + ", tel=" + tel + ", holiday="
				+ holiday + ", urllink=" + urllink + "]";
	}	
 	
}
