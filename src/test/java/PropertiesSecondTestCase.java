import org.junit.Test;

public class PropertiesSecondTestCase {

    @Test
    public void propertyTest(){
        System.out.println(PropertiesSecondTestCase.class + " VALUE: " + System.getProperty("local.tests.property"));
    }
}
