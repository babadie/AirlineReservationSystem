package BusinessLogic;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;


public class Flight implements ObservableList {	
private String airline;	
private int flightNumber;
private int flightCapacity;
private int seatsAvailable;
private int seatsOccupied;
private String originCity;
private String destinationCity;
private Time departureTime;
private Time arrivalTime;
private Date departureDate;
private Date arrivalDate;
private boolean isFull;
private Timestamp time;
 
public Flight(){
	
}

public Flight(String airline, int flightNumber, String originCity, String destinationCity) {
	super();
	this.airline = airline;
	this.flightNumber = flightNumber;
	this.originCity = originCity;
	this.destinationCity = destinationCity;
}

public Flight( int flightNumber,String airline, String originCity, String destinationCity, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime,int seatsAvailable, Timestamp time) {
	super();
	this.airline = airline;
	this.flightNumber = flightNumber;
	this.originCity = originCity;
	this.destinationCity = destinationCity;
	this.departureDate = departureDate;
	this.departureTime = departureTime;
	this.arrivalDate = arrivalDate;
	this.arrivalTime = arrivalTime;
	this.seatsAvailable = seatsAvailable;
	this.time = time;
}
public Flight( int flightNumber,String airline, String originCity, String destinationCity, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime,int seatsAvailable) {
	super();
	this.airline = airline;
	this.flightNumber = flightNumber;
	this.originCity = originCity;
	this.destinationCity = destinationCity;
	this.departureDate = departureDate;
	this.departureTime = departureTime;
	this.arrivalDate = arrivalDate;
	this.arrivalTime = arrivalTime;
	this.seatsAvailable = seatsAvailable;
}


public Flight( int flightNumber,String airline, String originCity, String destinationCity, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime) {
	super();
	this.airline = airline;
	this.flightNumber = flightNumber;
	this.originCity = originCity;
	this.destinationCity = destinationCity;
	this.departureDate = departureDate;
	this.departureTime = departureTime;
	this.arrivalDate = arrivalDate;
	this.arrivalTime = arrivalTime;

}

public String getAirline() {
	return airline;
}

public void setAirline(String airline) {
	this.airline = airline;
}

public int getFlightNumber() {
	return flightNumber;
}

public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}

public int getFlightCapacity() {
	return flightCapacity;
}

public void setFlightCapacity(int flightCapacity) {
	this.flightCapacity = flightCapacity;
}

public int getSeatsAvailable() {
	return seatsAvailable;
}

public void setSeatsAvailable(int seatsAvailable) {
	this.seatsAvailable = seatsAvailable;
}

public int getSeatsOccupied() {
	return seatsOccupied;
}

public void setSeatsOccupied(int seatsOccupied) {
	this.seatsOccupied = seatsOccupied;
}

public String getOriginCity() {
	return originCity;
}

public void setOriginCity(String originCity) {
	this.originCity = originCity;
}

public String getDestinationCity() {
	return destinationCity;
}

public void setDestinationCity(String destinationCity) {
	this.destinationCity = destinationCity;
}

public Time getDepartureTime() {
	return departureTime;
}

public void setDepartureTime(Time departureTime) {
	this.departureTime = departureTime;
}

public Time getArrivalTime() {
	return arrivalTime;
}

public void setArrivalTime(Time arrivalTime) {
	this.arrivalTime = arrivalTime;
}

public Date getDepartureDate() {
	return departureDate;
}

public void setDepartureDate(Date departureDate) {
	this.departureDate = departureDate;
}

public Date getArrivalDate() {
	return arrivalDate;
}

public void setArrivalDate(Date arrivalDate) {
	this.arrivalDate = arrivalDate;
}

public boolean isFull() {
	return isFull;
}

public void setFull(boolean isFull) {
	this.isFull = isFull;
}

@Override
public String toString() {
	return "Flight [airline=" + airline + ", flightNumber=" + flightNumber + ", flightCapacity=" + flightCapacity
			+ ", seatsAvailable=" + seatsAvailable + ", seatsOccupied=" + seatsOccupied + ", originCity=" + originCity
			+ ", destinationCity=" + destinationCity + ", departureTime=" + departureTime + ", arrivalTime="
			+ arrivalTime + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate + ", isFull=" + isFull
			+ "]";
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean contains(Object o) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterator iterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] toArray(Object[] a) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean add(Object e) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean remove(Object o) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean addAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean addAll(int index, Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean removeAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean retainAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public Object get(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object set(int index, Object element) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void add(int index, Object element) {
	// TODO Auto-generated method stub
	
}

@Override
public Object remove(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int indexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int lastIndexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public ListIterator listIterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ListIterator listIterator(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List subList(int fromIndex, int toIndex) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void addListener(InvalidationListener listener) {
	// TODO Auto-generated method stub
	
}

@Override
public void removeListener(InvalidationListener listener) {
	// TODO Auto-generated method stub
	
}

@Override
public void addListener(ListChangeListener listener) {
	// TODO Auto-generated method stub
	
}

@Override
public void removeListener(ListChangeListener listener) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean addAll(Object... elements) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean setAll(Object... elements) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean setAll(Collection col) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean removeAll(Object... elements) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean retainAll(Object... elements) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void remove(int from, int to) {
	// TODO Auto-generated method stub
	
}
}
