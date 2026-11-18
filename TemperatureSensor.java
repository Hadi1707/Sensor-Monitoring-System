package lab5;

public class TemperatureSensor extends Sensor {

	public TemperatureSensor(String location, double reading) {
		super(location, reading);
	}
	
	@Override
	public boolean needsAttention() {
		return getReading() < 5 || getReading() > 30;
	}
	
	@Override
	public String summary(){
        return  "Location: " + getLocation()+ "Reading: \n" + getReading() + "degree C";
}
	
	
}
