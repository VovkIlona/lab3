
package ua.lviv.iot.lamps.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Lamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
  private double price;
  private double height;
  @Enumerated(EnumType.STRING)
  private Currency currency;
  @Enumerated(EnumType.STRING)
  private LightSourceType typeOfLightSource;
  private boolean isAvailable;
  @Enumerated(EnumType.STRING)
  private Rating rating;

  public Lamps(double price, double height, Currency currency, LightSourceType typeOfLightSource, 
          boolean isAvailable,Rating rating) {
    super();
    this.price = price;
    this.height = height;
    this.currency = currency;
    this.typeOfLightSource = typeOfLightSource;
    this.setAvailable(isAvailable);
    this.rating = rating;
  }

 public Lamps () {}

  public Lamps(Integer id, double price, double height, Currency currency, LightSourceType typeOfLightSource,
        boolean isAvailable, Rating rating) {
    super();
    this.id = id;
    this.price = price;
    this.height = height;
    this.currency = currency;
    this.typeOfLightSource = typeOfLightSource;
    this.isAvailable = isAvailable;
    this.rating = rating;
}



public Integer getId() {
    return id;
}



public void setId(Integer id) {
    this.id = id;
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

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }
  public boolean isAvailable() {
      return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
      this.isAvailable = isAvailable;
  }
  
  /* public String toString() {
    return "Lamps [price = " + price + ",height = " + height + ", " + "currency = " 
      + currency
                + ",typeOfLightSource = " + typeOfLightSource + ", " + "isAvailable = "
      + 
      isAvailable + ", rating = "
                + rating + "]";

  }*/

  public LightSourceType getType() {
    // TODO Auto-generated method stub
    return null;
  }
  
  public String getHeaders() {
      return "Price" + "," + "Height" + "," + "Currency"
              + "," + "TypeOfLightSource" + ","+ "Available" + ","  + "Rating";
  }
  
  public String toCSV() {
      return this.getPrice() + "," + this.getHeight() + ","
              + this.getCurrency() + "," + this.getTypeOfLightSource() + "," + this.isAvailable() + ","
              + this.getRating();
  }
}