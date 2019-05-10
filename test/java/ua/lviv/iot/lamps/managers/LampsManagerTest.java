package ua.lviv.iot.lamps.managers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lamps.models.Currency;
import ua.lviv.iot.lamps.models.Lamps;
import ua.lviv.iot.lamps.models.LightSourceType;
import ua.lviv.iot.lamps.models.Rating;
import ua.lviv.iot.lamps.models.Lusters;
import ua.lviv.iot.lamps.models.StreetLamps;
import ua.lviv.iot.lamps.models.StreetType;
import ua.lviv.iot.lamps.models.TableLamps;
import ua.lviv.iot.lamps.models.TableLampsType;

class LampsManagerTest {

    private List<Lamps> lamps = new ArrayList<Lamps>();
    
    
    
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
    
    }
    
     
    @Test
    void testSortByPriceAsc() {
        new LampsManager(lamps).sortByPrice(false); { 
        assertEquals(100, lamps.get(0).getPrice()) ;
        assertEquals(140, lamps.get(1).getPrice()) ;
        assertEquals(550, lamps.get(2).getPrice()) ;
        assertEquals(999, lamps.get(3).getPrice()) ;
        assertEquals(1350, lamps.get(4).getPrice());
        }     
    }
    
    @Test
    void testSortByPriceDes() {
       new LampsManager(lamps).sortByPrice(true);{
       assertEquals(1350, lamps.get(0).getPrice()) ;
       assertEquals(999, lamps.get(1).getPrice()) ;
       assertEquals(550, lamps.get(2).getPrice()) ;
       assertEquals(140, lamps.get(3).getPrice()) ;
       assertEquals(100, lamps.get(4).getPrice()) ;
       }
    }
    
    @Test
    void testSortByHeightAsc() {
        new LampsManager(lamps).sortByHeight(false);{
        assertEquals(55, lamps.get(0).getHeight());
        assertEquals(90, lamps.get(1).getHeight());
        assertEquals(110, lamps.get(2).getHeight());
        assertEquals(150, lamps.get(3).getHeight());
        assertEquals(190, lamps.get(4).getHeight());
        }
    }
    
    @Test
    void testSortByHeightDes() {
        new LampsManager(lamps).sortByHeight(true);{ 
        assertEquals(190, lamps.get(0).getHeight());
        assertEquals(150, lamps.get(1).getHeight());
        assertEquals(110, lamps.get(2).getHeight());
        assertEquals(90, lamps.get(3).getHeight());
        assertEquals(55, lamps.get(4).getHeight());
            }
    }
    
    @Test 
    public void testFindType() {
        assertEquals(0, LampsManager
                .findType(LightSourceType.LED).size());
        
    }
    
}   

