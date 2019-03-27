package ua.lviv.iot.lamps.models;



public class TableLamps extends Lamps {
  private TableLampsType tableLampsType;

  public TableLamps(double price, double height, Currency currency,
      LightSourceType typeOfLightSource, boolean isAvailable, Rating rating,
      TableLampsType tableLampsType) {
    super(price, height,  currency,  typeOfLightSource, isAvailable, rating);


  }
  
  public TableLamps() {

  }

  public TableLampsType getTableLampsType() {
    return tableLampsType;
  }

  public void setTableLampsType(TableLampsType tableLampsType) {
    this.tableLampsType = tableLampsType;
  }

}

