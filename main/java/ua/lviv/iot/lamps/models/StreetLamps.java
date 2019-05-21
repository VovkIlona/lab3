package ua.lviv.iot.lamps.models;

public class StreetLamps extends Lamps {
  private StreetType streetType;
  private boolean solarBattery;

  public StreetLamps(double price, double height, Currency currency, LightSourceType
          typeOfLightSource,
            boolean isAvailable, Rating rating, StreetType streetType, boolean solarBattery) {
    super(price, height, currency, typeOfLightSource, isAvailable, rating);

  }

  

  public StreetType getStreetType() {
    return streetType;
  }

  public void setStreetType(StreetType streetType) {
    this.streetType = streetType;
  }

  public boolean isSolarBattery() {
    return solarBattery;
  }

  public void setSolarBattery(boolean solarBattery) {
    this.solarBattery = solarBattery;
  }
  
  
  public String getHeaders() {
      return super.getHeaders() + "," + "StreetType" + ","
              + "SolarBattery";
  }

  
  public String toCSV() {
      return super.toCSV() + "," + this.getStreetType() + ","
              + this.isSolarBattery();
  }
  

}