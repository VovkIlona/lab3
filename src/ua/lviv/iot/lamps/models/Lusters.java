package ua.lviv.iot.lamps.models;

public class Lusters extends Lamps {
	private LustersType lustersType;
	private boolean abatjour;
    private boolean pendants;
    
    public Lusters(double price, double height,  Currency currency,
            LightSourceType typeOfLightSource, boolean isAvailable, Rating rating, LustersType lustersType,
            boolean abatjour, boolean pendants) {
 super(price, height,  currency,  typeOfLightSource, isAvailable, rating);


}
public Lusters(){

}
public LustersType getLustersType() {
	return lustersType;
}
public void setLustersType(LustersType lustersType) {
	this.lustersType = lustersType;
}
public boolean isAbatjour() {
	return abatjour;
}
public void setAbatjour(boolean abatjour) {
	this.abatjour = abatjour;
}
public boolean isPendants() {
	return pendants;
}
public void setPendants(boolean pendants) {
	this.pendants = pendants;
}

}
