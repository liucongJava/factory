package cn.bdqn;

import cn.bdqn.impl.Animal;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("è�ڳԶ���!");
	}

	@Override
	public void sprot() {
		System.out.println("è���˶�!");
	}

}
