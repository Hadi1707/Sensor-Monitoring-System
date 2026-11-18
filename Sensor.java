package lab5;

abstract class Sensor {

private String location;
private double reading;
private static int sensorCount = 0;

public Sensor(String location, double reading) {
	setLocation(location);
	setReading(reading);
	sensorCount++;
}

public static int getSensorCount() {
	return sensorCount;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public double getReading() {
	return reading;
}

public void setReading(double reading) {
	this.reading = reading;
}

public abstract boolean needsAttention();
	

public String summary(){
          return  "Location: " + getLocation()+ "Reading: " + getReading();
}

	
}
