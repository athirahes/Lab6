package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This interface represents temperature sensor
 * 
 * @author emalianakasmuri
 *
 */
public interface TemperatureSensor extends Remote {

	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;
	
	/**
	 * This method gets current temperature
	 * 
	 * @return temperature for a specified day
	 * @throws RemoteException
	 */
	public int getTemperatureByDay(String day) throws RemoteException;
	
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * @throws RemoteException
	 */
	public float getTemperatureAverage() throws RemoteException;

}
