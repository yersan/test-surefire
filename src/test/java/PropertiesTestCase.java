import org.junit.Test;

public class PropertiesTestCase {

    @Test
    public void propertyTest(){
        System.out.println(PropertiesTestCase.class + " VALUE " + System.getProperty("local.tests.property"));
    }
}
