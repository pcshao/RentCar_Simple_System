package cn.pcshao.study.rentcarsystem.service;

import java.util.Scanner;

import cn.pcshao.study.rentcarsystem.entity.Car;
import cn.pcshao.study.rentcarsystem.entity.goodsCar;
import cn.pcshao.study.rentcarsystem.entity.passengerCar;
/**
 * 
 * @author pcshao
 *
 */
public class Ui {
	
	
	public static void main(String arg[]) {
		//欢迎界面
		System.out.println("******欢迎来租车******");
		//实例化车量数据库
		Car[] cars = {
				new passengerCar(1,"宝马", "载人车",5,1200),new passengerCar(2,"奥迪", "载人车",5,1100),
				new goodsCar(3,"依维柯", "载货车",5,1500),new goodsCar(4,"江铃", "载货车",10,1480)
		};
		//获取输入，入口
		System.out.println("输入1确认开始租车，输入0退出byebye");
		Scanner scan = new Scanner(System.in);
		if("0".equals(scan.next())) {
			System.exit(0);
		}
		//显示可租用的车
		System.out.println("可租用的车有：");
		for (Car car : cars){
			System.out.println(car.toCarMess());
		}
		//输入租车数量
		System.out.println("请输入要租车的数量");
		scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.next());
		//给要的每一辆车分别输入编号
		int[] carCount = new int[count];
		for(int i=0;i<count;i++) {
			System.out.println("请输入租车编号：");
			scan = new Scanner(System.in);
			carCount[i] = Integer.parseInt(scan.next());
		}
		//计算总价钱
		int allCost=0;
		for(int cari : carCount) {
			for(Car car : cars) {
				allCost += car.getAllCost(cari);
			}
		}
		System.out.println("完毕，总价钱是："+allCost);
	}

}
