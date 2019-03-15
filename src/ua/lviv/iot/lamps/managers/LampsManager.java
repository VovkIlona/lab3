package ua.lviv.iot.lamps.managers;


import ua.lviv.iot.lamps.models.Lamps;
import ua.lviv.iot.lamps.models.LightSourceType;
import ua.lviv.iot.lamps.models.Rating;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LampsManager {
	private List<Lamps> lamps;
	public LampsManager() {
		
	}
	public LampsManager(List<Lamps> lamps ) {
		this.lamps = lamps;
	}
	 public List<Lamps> sortByPrice(boolean descending) {
	        Comparator<Lamps> comparator = (Lamps obj1, Lamps obj2) ->
	                Double.compare((obj1.getPrice()), (obj2.getPrice()));
	        List<Lamps> lampsList = lamps;
	        lampsList.sort(comparator);
	        if (descending) {
	            Collections.reverse(lampsList);
	        }
	        return lampsList;
	    }

	    public List<Lamps> sortByHeight(boolean descending) {
	        Comparator<Lamps> comparator = (Lamps obj1, Lamps obj2) ->
	                Double.compare((obj1.getHeight()), (obj2.getHeight()));
	        List<Lamps> lampsList = lamps;
	        lampsList.sort(comparator);
	        if (descending) {
	            Collections.reverse(lampsList);
	        }
	        return lampsList;
	    }
 
	    public List<Lamps> findType(LightSourceType type) {
	        List<Lamps> lampsList = lamps;
	        List<Lamps> findLampsList = lampsList.stream()
	                .filter(lamps -> lamps.getType() == type)
	                .collect(Collectors.toList());
	        return findLampsList;
	    }

	    public List<Lamps> findRating(Rating rating) {
	        List<Lamps> lampsList = lamps;
	        List<Lamps> findLampsList = lampsList.stream()
	                .filter(lamps -> lamps.getRating() == rating
	                        .collect(Collectors.toList());

	        return findLampsList;
	    }

	    public List<Lamps> getLamps() {
	        return lamps;

	    }

	    public void setLamps(List<Lamps> lamps) {
	        this.lamps = lamps;
	    }
}

