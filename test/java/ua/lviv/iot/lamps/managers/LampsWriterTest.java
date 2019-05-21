package ua.lviv.iot.lamps.managers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lamps.models.Currency;
import ua.lviv.iot.lamps.models.Lamps;
import ua.lviv.iot.lamps.models.LightSourceType;
import ua.lviv.iot.lamps.models.Rating;

class LampsWriterTest {
	private List<Lamps> lamps = new ArrayList<Lamps>();
	private LampsWriter lw= new LampsWriter();
	@BeforeEach
    void setUp() throws Exception {
        
    lamps.add(new Lamps(100, 150, Currency.EUR, LightSourceType.ENERGYSAVING,
                true, Rating.AVERAGE));
    lamps.add(new Lamps(550, 90, Currency.UAH, LightSourceType.INCANDESCENCE, 
                true, Rating.EXCELLENT));
    lamps.add(new Lamps(1350, 110, Currency.UAH, LightSourceType.ENERGYSAVING,
                 true, Rating.EXCELLENT));
    lamps.add(new Lamps(999, 55, Currency.UAH, LightSourceType.ENERGYSAVING, 
                true, Rating.GOOD));
    lamps.add(new Lamps(140, 190, Currency.USD, LightSourceType.LED, true, Rating.AVERAGE));
    lamps.add(new Lamps(999, 110,  Currency.UAH, LightSourceType.ENERGYSAVING,
                 true, Rating.EXCELLENT));
    }

	@Test
	  void testWrite() throws IOException {
	    
	    File file = new File("lamps.txt");
	    lw.writeToFile(lamps);
	    assertTrue(file.length() > 0);
	    
	  }

}
