package members;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

    @Test
    public void babyTest() {
	Person baby = new Person("Baby", 2);
	baby.eat();
	assertEquals("kids under 3 can't eat by themselves", baby.hungry(),
		false);
    }

}
