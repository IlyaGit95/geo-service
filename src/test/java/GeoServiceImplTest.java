import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {

    @Test
    public void byIpTest() {
        GeoService geoService = new GeoServiceImpl();

        Location preference = geoService.byIp(GeoServiceImpl.MOSCOW_IP);
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        Assertions.assertEquals(expected, preference);
    }
}
