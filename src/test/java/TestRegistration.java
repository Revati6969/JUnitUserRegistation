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
}
