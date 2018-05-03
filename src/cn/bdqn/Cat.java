package cn.bdqn;

import cn.bdqn.impl.Animal;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("猫在吃东西!");
	}

	@Override
	public void sprot() {
		System.out.println("猫在运动!");
	}

}
