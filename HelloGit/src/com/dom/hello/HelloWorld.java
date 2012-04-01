package com.dom.hello;

public class HelloWorld {

	public static void main(String[] args) {
		new HelloWorld().sayHello("dude");
	}

	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}
