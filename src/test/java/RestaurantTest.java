import org.junit.Test;

import static org.junit.Assert.assertTrue;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;

/**
 * @author Hugh Glykod
 */
public class RestaurantTest {
    // Je ne vois pas comment changer ce test.

    private Restaurant myRestaurant = new Restaurant("Duke's Carvel");

    @Test
    public void testDefaultOpeningHours() {

// Je ne sais pas ce qu'il faut mettre à la place de MONDAY.
        boolean isOpen = myRestaurant.isOpen(DayOfWeek.MONDAY, "2016-07-31T15:21:00Z");
        assertTrue(isOpen);

        boolean isOpen.Sunday = myRestaurant.isOpen(DayOfWeek.SUNDAY, "2016-07-31T15:21:00Z")
    }

    Clock clock = Clock.fixed(Instant.parse("2016-07-01T10:00:002"), ZoneId.systemDefault());


}
