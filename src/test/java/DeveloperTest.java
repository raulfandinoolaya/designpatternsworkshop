import model.Developer;
import org.junit.Test;
import model.Intern;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    @Test
    public void developerShouldIntroduceProperly() {
        Developer developer = new Developer();
        assertEquals(developer.introduceItself(),"Hi! I'm new in the company, nice to meet you");
    }

    @Test
    public void developerShouldWork() {
        Developer developer = new Developer();
        assertEquals(developer.work(),"I'm working a lot");
    }

    @Test
    public void developerShouldRegisterTimeInOracle() {
        Developer developer = new Developer();
        assertEquals(developer.performRegisterTimesinOracle(),"I'm registering 9 hours per day");

    }

    @Test
    public void internShouldNoRegisterTimeInOracle() {
        Intern intern = new Intern();
        assertEquals(intern.performRegisterTimesinOracle(), "I'm not registering anything in Oracle");
    }
}
