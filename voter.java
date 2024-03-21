package VotePro;

public class voter 
{
	private String fname,mname,lname,mono,gender,voterid;
	private int adharno;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getVoterid() {
		return voterid;
	}
	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}
	public int getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	@Override
	public String toString() {
		return "voter [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", mono=" + mono + ", gender="
				+ gender + ", voterid=" + voterid + ", adharno=" + adharno + "]";
	}
	

}
