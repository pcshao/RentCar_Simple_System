package cn.pcshao.study.rentcarsystem.entity;
/**
 * 
 * @author pcshao
 *
 */
public abstract class Car {
	
	protected int id;
	String name;
	String type;
	int rentCost;
	
	public String toCarMess() {
		return this.id+":"+"车名："+this.name+"\t"+"类型："+this.type+"\t"+this.rentCost+"元/天";
	}
	
	public int getAllCost(int id) {
		if(this.id==id) {
			return rentCost;
		}
		return 0;
	}

}
