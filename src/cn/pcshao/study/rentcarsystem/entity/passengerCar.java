package cn.pcshao.study.rentcarsystem.entity;
/**
 * 
 * @author pcshao
 *
 */
public class passengerCar extends Car {
	
	private int passengerCapacity; 
	
	public passengerCar(int id,String name,String type,int capacity,int cost) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.passengerCapacity = capacity;
		this.rentCost = cost;
	}

}
