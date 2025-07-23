package learning.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annoations {
	
	 @Test
	    @Parameters("name")
	    public void m1(@Optional("DefaultName") String name) {
	        System.out.println("m1: " + name);
	    }

	    @Test
	    @Parameters({"name", "age"})
	    public void m2(@Optional("DefaultName") String name, @Optional("25") int age) {
	        System.out.println("m2: " + name + " - " + age);
	        
	    }

	    @Test
	    @Parameters({"name", "age", "salary"})
	    public void m3(@Optional("DefaultName") String name,
	                   @Optional("25") int age,
	                   @Optional("30000") int salary) {
	        System.out.println("m3: " + name + " - " + age + " - " + salary);
	    }
}
