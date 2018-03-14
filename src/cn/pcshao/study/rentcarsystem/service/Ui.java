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
		//��ӭ����
		System.out.println("******��ӭ���⳵******");
		//ʵ�����������ݿ�
		Car[] cars = {
				new passengerCar(1,"����", "���˳�",5,1200),new passengerCar(2,"�µ�", "���˳�",5,1100),
				new goodsCar(3,"��ά��", "�ػ���",5,1500),new goodsCar(4,"����", "�ػ���",10,1480)
		};
		//��ȡ���룬���
		System.out.println("����1ȷ�Ͽ�ʼ�⳵������0�˳�byebye");
		Scanner scan = new Scanner(System.in);
		if("0".equals(scan.next())) {
			System.exit(0);
		}
		//��ʾ�����õĳ�
		System.out.println("�����õĳ��У�");
		for (Car car : cars){
			System.out.println(car.toCarMess());
		}
		//�����⳵����
		System.out.println("������Ҫ�⳵������");
		scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.next());
		//��Ҫ��ÿһ�����ֱ�������
		int[] carCount = new int[count];
		for(int i=0;i<count;i++) {
			System.out.println("�������⳵��ţ�");
			scan = new Scanner(System.in);
			carCount[i] = Integer.parseInt(scan.next());
		}
		//�����ܼ�Ǯ
		int allCost=0;
		for(int cari : carCount) {
			for(Car car : cars) {
				allCost += car.getAllCost(cari);
			}
		}
		System.out.println("��ϣ��ܼ�Ǯ�ǣ�"+allCost);
	}

}
