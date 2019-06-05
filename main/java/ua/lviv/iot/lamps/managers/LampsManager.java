package ua.lviv.iot.lamps.managers;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.lamps.models.Lamps;
import ua.lviv.iot.lamps.models.LightSourceType;
import ua.lviv.iot.lamps.models.Rating;

public class LampsManager {
  private static  List<Lamps> lamps;

  

  public LampsManager(List<Lamps> lamps) {
    this.lamps = lamps;
  }

  public List<Lamps> sortByPrice(boolean descending) {
    Comparator<Lamps> comparator = descending ? Comparator.comparing(Lamps::getPrice).reversed()
                : Comparator.comparing(Lamps::getPrice);

    lamps.sort(comparator);
    return lamps;
  }

  public List<Lamps> sortByHeight(boolean descending) {
    Comparator<Lamps> comparator = descending ? Comparator.comparing(Lamps::getHeight).reversed()
                : Comparator.comparing(Lamps::getHeight);
    lamps.sort(comparator);
    return lamps;
  }

    public static List<Lamps> findType(LightSourceType type) {
    List<Lamps> lampsList = lamps;
    List<Lamps> findLampsList = lampsList.stream().filter(lamps -> lamps.getType() == type)
                .collect(Collectors.toList());
    return findLampsList; 
  }

    /*public static List<Lamps> findRating(Rating rating) {
    List<Lamps> lampsList = lamps; 
    List<Lamps> findLampsList = lampsList.stream().filter(lamps -> lamps.getRating() == rating)
                .collect(Collectors.toList());

    return findLampsList;
  }*/
}