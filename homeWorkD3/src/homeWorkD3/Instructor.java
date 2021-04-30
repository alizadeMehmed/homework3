package homeWorkD3;

public class Instructor extends User {
	private String verilenDers;
	private int instructorNumber;
	private int experienceYear;
	private String professionArea;

	public Instructor() {

	}

	public String getVerilenDers() {
		return verilenDers;
	}

	public void setVerilenDers(String verilenDers) {
		this.verilenDers = verilenDers;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	public String getProfessionArea() {
		return professionArea;
	}

	public void setProfessionArea(String professionArea) {
		this.professionArea = professionArea;
	}
}
