
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Week12 {

	    @DataProvider(name = "emailProvider")
	    public Object[][] emailData() {
	        return new Object[][] {
	            {"test@example.com"},
	            {"user123@mail.com"},
	            {"invalid_email@domain"}
	        };
	    }

	    @Test(dataProvider = "emailProvider")
	    public void testEmailValidation(String email) {
	        System.out.println("Testing with email: " + email);
	    }

}


	

