package com.iu.start.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("myCar")//new car해라~
public class Car {
	private Engine engine;
	private Wheel leftwheel;
	private Wheel rightWheel;

//1
//private Engine engine = new Engine();//자동차는 엔진에 대해서 의존적임//1번째 방법

//2	
//Car car = new Car();
//car.engine = new Engine();
//엔진의 접근지정자가 private이기 때문에 사용하지 못함

//3
//	@Autowired
	public Car( Wheel leftWheel, Wheel rightWheel) {
		this.leftwheel = leftWheel;
		this.rightWheel = rightWheel;
	}
	
//4
//	public Car(Engine engine) {
//		this.engine = engine;
//	}
//  Engine engine = new Engine();
//	Car car = new Car(engine);
	
//5
//	{ //인스턴스 블럭
//		this.engine = new Engine();
//	}
	
//6
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}	
//	Car car = new Car();
//	Engine engine = new Engine();
//	car.setEngine(engine);//5번째 방법
	
	
	
	
}
