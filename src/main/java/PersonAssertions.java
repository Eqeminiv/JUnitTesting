import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonAssertions {
    Person p1, p2, p3;

    @Before
    public void define()
    {
        p1 = new Person("Jan","Kowalski",60);
        p2 = new Person("Jan","Krawczyk",15);
    }

    @Test
    public void isTheFirstNameSame()
    {
        Assert.assertEquals("Names are not the same", p1.getFirstName(),p2.getFirstName());
    }

    @Test
    public void areThePersonsDefined()
    {
        Assert.assertNotNull("Person p1 should be defined", p1);
        Assert.assertNotNull("Person p2 should be defined", p2);
        Assert.assertNull("Person p3 shouldn't be defined", p3);
    }

    @Test
    public void isTheLastNameSame()
    {
        Assert.assertNotEquals("Last names shouldn't be the same", p1.getLastName(), p2.getLastName());
    }

    @Test
    public void areThePersonsAdults()
    {
        Assert.assertTrue("Person p1 should be an adult",p1.getAge()>=18);
        Assert.assertFalse("Person p2 shouldn't be an adult", p2.getAge()>=18);
    }
}
