import org.junit.Assert;
import org.junit.Test;

public class TestRegistration {
    Registation obj=new Registation();

    @Test
    public void givenfirstName_whenValid_thenTrue() {
        boolean firstname=obj.checkName("Capital");
        Assert.assertTrue(firstname);
    }
    @Test
    public void givenfirstName_wheninValid_thenFalse() {
        boolean firstname=obj.checkName("capital");
        Assert.assertFalse(firstname);
    }


    @Test
    public void givenlastName_whenValid_thenTrue() {
        boolean lastname=obj.checkName("Capital");
        Assert.assertTrue(lastname);
    }
    @Test
    public void givenlastName_wheninValid_thenFalse() {
        boolean lastname=obj.checkName("capital");
        Assert.assertFalse(lastname);
    }

    @Test
    public void givenEmail_whenValid_thenTrue() {
        boolean Email=obj.checkEmail("abc-100@yahoo.com");
        Assert.assertTrue(Email);
    }
    @Test
    public void givenEmail_wheninValid_thenFalse() {
        boolean Email=obj.checkEmail("abc-100.@yahoo.com");
        Assert.assertFalse(Email);
    }

    @Test
    public void givenMobileNumber_whenValid_thenTrue() {
        boolean MobileNumber=obj.checkMobileNumber("91 1234567890");
        Assert.assertTrue(MobileNumber);
    }
    @Test
    public void givenMobileNumber_wheninValid_thenFalse() {
        boolean MobileNumber=obj.checkMobileNumber("91 234567890");
        Assert.assertFalse(MobileNumber);
    }
}
