package sensormonitoring;

public class MoistureSensor extends Sensor {

	public MoistureSensor(String location, double reading) {
		super(location, reading);
	}
	
	@Override
	public boolean needsAttention() {
		return getReading() < 35;
	}
	
	
}
