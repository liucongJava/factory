package test;

import cn.bdqn.Factory;
import cn.bdqn.impl.Animal;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Factory factory = new Factory();
		Animal animal = factory.getAnimal("dog");
		animal.eat();
		animal.sprot();
	
	}

}
