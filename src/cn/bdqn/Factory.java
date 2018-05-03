package cn.bdqn;

import cn.bdqn.impl.Animal;

public class Factory {

	public static String CAT = "cat";
	public static String DOG = "dog";
	
	public Animal getAnimal(String desc) {
		
		if(CAT.equals(desc)) {
			return new Cat();
		}else if(DOG.equals(desc)) {
			return new Dog();
		}else {
			return null;
		}
	}
}
