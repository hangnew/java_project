package 자바심화;

public class DTO {

	private String id;
	private String pw;
	private String name;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "아이디: " + id + ", 비밀번호: " + pw + ", 이름: " + name + ", 전화번호: " + tel;
	}
	
	

}
