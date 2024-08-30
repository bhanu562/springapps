
public class AddressDTo {
	private int id;
	private int studentId;
	private String cityName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public AddressDTo(int id, int studentId, String cityName) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "AddressDTo [id=" + id + ", studentId=" + studentId + ", cityName=" + cityName + "]";
	}
	
	

}
