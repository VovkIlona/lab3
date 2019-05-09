package ua.lviv.iot.lamps.models;

public class Lamps {
	private double price;
	private double height;
    private Currency currency;
    private LightSourceType typeOfLightSource;
    private boolean isAvailable;
    private Rating rating;

    public Lamps(double price, double height, Currency currency, LightSourceType typeOfLightSource, boolean isAvailable,
			Rating rating) {
		super();
		this.price = price;
		this.height = height;
		this.currency = currency;
		this.typeOfLightSource = typeOfLightSource;
		this.isAvailable = isAvailable;
		this.rating = rating;
	}
    public Lamps() {
    	
    }
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public LightSourceType getTypeOfLightSource() {
		return typeOfLightSource;
	}
	public void setTypeOfLightSource(LightSourceType typeOfLightSource) {
		this.typeOfLightSource = typeOfLightSource;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
    public String toString() {
    	 return "Lamps [price = " + price + ",height = " + height + ", " +
                 "currency = " + currency + ",typeOfLightSource = "  + typeOfLightSource + ", " +
                 "isAvailable = " + isAvailable + ", rating = " + rating +"]";

    }
	public LightSourceType getType() {
		// TODO Auto-generated method stub
		return null;
	}
}

