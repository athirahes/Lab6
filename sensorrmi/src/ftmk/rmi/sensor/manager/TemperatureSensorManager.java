package ftmk.rmi.sensor.manager;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

import ftmk.rmi.sensor.TemperatureSensor;

/**
 * This class manage the value of temperature from the sensor.
 * 
 * @author emalianakasmuri
 *
 */
public class TemperatureSensorManager extends UnicastRemoteObject implements TemperatureSensor {

	public TemperatureSensorManager() throws RemoteException {
		super();
	}

	@Override
	public int getTemperature() throws RemoteException {

		return 35;
	}

	// method to load data from table 1
	private HashMap<String, Integer> loadDataTemperature() {

		// Create HasnMap
		HashMap<String, Integer> temperaturePerDay = new HashMap<>();

		// Hashmap #1 - Add elements to a HashMap - use put(key, value)
		// key = String day, value = int temperature
		temperaturePerDay.put("Monday", 32);
		temperaturePerDay.put("Tuesday", 31);
		temperaturePerDay.put("Wednesday", 33);
		temperaturePerDay.put("Thursday", 35);
		temperaturePerDay.put("Friday", 36);
		temperaturePerDay.put("Saturday", 33);
		temperaturePerDay.put("Sunday", 33);

		return temperaturePerDay;
	}

	@Override
	public int getTemperatureByDay() throws RemoteException {

		// Create HasnMap
		HashMap<String, Integer> temperature = loadDataTemperature();

		// HashMap #2 - Access HashMap elements - use get(key)
		// key = String day, value = int temperature
		int temperatureValue = temperature.get("Friday");
		return temperatureValue;
	}

}
