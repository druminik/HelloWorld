package com.dom.hello;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld hello = new HelloWorld();
		hello.sayHello("dude");
	}

}
