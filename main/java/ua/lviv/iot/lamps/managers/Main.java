package ua.lviv.iot.lamps.managers;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.lamps.models.Currency;
import ua.lviv.iot.lamps.models.Lamps;
import ua.lviv.iot.lamps.models.LightSourceType;
import ua.lviv.iot.lamps.models.Rating;

public class Main {
  public static void main(String[] args) {

    List<Lamps> lamps = new ArrayList<Lamps>();


    lamps.add(new Lamps(100, 150, Currency.EUR, LightSourceType.ENERGYSAVING, 
        true, Rating.AVERAGE));
    lamps.add(new Lamps(550, 90, Currency.UAH, LightSourceType.INCANDESCENCE, 
        true, Rating.EXCELLENT));
    lamps.add(new Lamps(1350, 110, Currency.UAH, LightSourceType.ENERGYSAVING,
        true, Rating.EXCELLENT));
    lamps.add(new Lamps(999, 55, Currency.UAH, LightSourceType.ENERGYSAVING, true, Rating.GOOD));
    lamps.add(new Lamps(140, 190, Currency.USD, LightSourceType.LED, true, Rating.AVERAGE));


    List<Lamps> sortedLamps = (new LampsManager(lamps)).sortByPrice(false);
    System.out.println(sortedLamps);

    List<Lamps> sortedLamps1 = (new LampsManager(lamps)).sortByHeight(true);
    System.out.println(sortedLamps1);


  }

}