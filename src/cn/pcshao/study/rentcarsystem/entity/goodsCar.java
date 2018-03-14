package cn.pcshao.study.rentcarsystem.entity;
/**
 * 
 * @author pcshao
 *
 */
public class goodsCar extends Car {
	
	private int goodsCapacity;
	
	public goodsCar(int id,String name,String type,int capacity,int cost) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.goodsCapacity = capacity;
		this.rentCost = cost;
	}

}
