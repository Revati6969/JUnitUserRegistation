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
    public void givenfirstName_whenInvalid_thenFalse() {
        boolean firstname=obj.checkName("capital");
        Assert.assertFalse(firstname);
    }


    @Test
    public void givenlastName_whenValid_thenTrue() {
        boolean lastname=obj.checkName("Capital");
        Assert.assertTrue(lastname);
    }
    @Test
    public void givenlastName_whenInvalid_thenFalse() {
        boolean lastname=obj.checkName("capital");
        Assert.assertFalse(lastname);
    }

    @Test
    public void givenEmail_whenValid_thenTrue() {
        boolean Email=obj.checkEmail("abc-100@yahoo.com");
        Assert.assertTrue(Email);
    }
    @Test
    public void givenEmail_whenInvalid_thenFalse() {
        boolean Email=obj.checkEmail("abc-100.@yahoo.com");
        Assert.assertFalse(Email);
    }

    @Test
    public void givenMobileNumber_whenValid_thenTrue() {
        boolean MobileNumber=obj.checkMobileNumber("91 1234567890");
        Assert.assertTrue(MobileNumber);
    }
    @Test
    public void givenMobileNumber_whenInvalid_thenFalse() {
        boolean MobileNumber=obj.checkMobileNumber("91 123456789");
        Assert.assertFalse(MobileNumber);
    }
    @Test
    public void givenPassword_whenValid_thenTrue() {
        boolean Password=obj.checkPassword("TYUhdsT75");
        Assert.assertTrue(Password);
    }
    @Test
    public void givenPassword_whenInvalid_thenFalse() {
        boolean Password=obj.checkPassword("fgdfdfd");
        Assert.assertFalse(Password);
    }
    @Test
    public void givenPassword1_whenValid_thenTrue() {
        boolean Password1=obj.checkPassword1("ffa456fhjsYT");
        Assert.assertTrue(Password1);
    }
    @Test
    public void givenPassword1_whenInvalid_thenFalse() {
        boolean Password1=obj.checkPassword1("djhsfdfg");
        Assert.assertFalse(Password1);
    }

    @Test
    public void givenPassword2_whenValid_thenTrue() {
        boolean Password2=obj.checkPassword2("TTdhfggfhg564");
        Assert.assertTrue(Password2);
    }
    @Test
    public void givenPassword2_whenInvalid_thenFalse() {
        boolean Password2=obj.checkPassword2("djtDFyhsdfg");
        Assert.assertFalse(Password2);
    }
}
