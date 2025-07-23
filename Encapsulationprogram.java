package JavaProgram;
 class SensitiveClass
 {

	private String emailid="shubh19@gmail.com";
	
	public String getEmailid()
	{
		return emailid;
	}
	
	public void setEmailid(String emailid) 
	{
		this.emailid=emailid;
	}
	
	private int OTP=1234;
	
	public int getOtp()
	{
		return OTP;
	}
	
	public void setOtp(int OTP)
	{
		this.OTP=OTP;
	}
	
	private char gender='M';

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
 }

public class Encapsulationprogram 
{

	public static void main(String[]args) 
	{
		SensitiveClass s1=new SensitiveClass();
	    s1.setEmailid("shubhanjali@gmail.com");
		System.out.println(s1.getEmailid());
		s1.setOtp(5678);
		System.out.println(s1.getOtp());
		s1.setGender('F');
		System.out.println(s1.getGender());
	}

}
