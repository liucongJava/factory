package cn.bdqn;

import cn.bdqn.impl.Animal;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("狗在吃东西!");
	}

	@Override
	public void sprot() {
		System.out.println("狗在运动!");
	}

}
