package cn.bdqn;

import cn.bdqn.impl.Animal;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("���ڳԶ���!");
	}

	@Override
	public void sprot() {
		System.out.println("�����˶�!");
	}

}
