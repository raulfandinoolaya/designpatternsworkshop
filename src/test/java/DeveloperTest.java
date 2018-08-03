import model.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    @Test
    public void developerShouldIntroduceProperly() {
        Developer developer = new Developer();
        assertEquals(developer.introduceItself(),"Hi!, I'm a developer, nice to meet you");
    }

    @Test
    public void developerShouldWork() {
        Developer developer = new Developer();
        assertEquals(developer.work(),"I'm working a lot");
    }

    @Test
    public void developerShouldRegisterTimeInOracle() {
        Developer developer = new Developer();
        assertEquals(developer.registerTimesInOracle(),"I'm registering 9 hours per day");
    }
}
