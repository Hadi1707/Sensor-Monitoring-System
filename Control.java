package sensormonitoring;


public class Control{

	public static void main(String[] args) {
		
		TemperatureSensor ts = new TemperatureSensor("Glasshouse A\n", 34);
		MoistureSensor ms = new MoistureSensor ("Bed 2\n", 42);
		
		Sensor[] s = {
				ts, ms
		};
			for (Sensor sensor : s) {
			System.out.println(sensor.summary());
			System.out.println("needs attention: " + sensor.needsAttention());
			}
			System.out.println("Sensor Count: " + Sensor.getSensorCount());
		}
	
}
