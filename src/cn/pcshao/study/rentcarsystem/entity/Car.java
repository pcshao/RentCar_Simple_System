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
		return this.id+":"+"������"+this.name+"\t"+"���ͣ�"+this.type+"\t"+this.rentCost+"Ԫ/��";
	}
	
	public int getAllCost(int id) {
		if(this.id==id) {
			return rentCost;
		}
		return 0;
	}

}
