package com.newman.javabeginerone.helloworld;

/**
 * Copyright © 2015. 
 * Created by Newman on 07/14/15.
 */
public class HelloWorld {

	/**
	 * algorithmOfSuccess method
	 * 
	 * @param args
	 */
	public void algorithmOfSuccess(int noSuccess, String dead) {
    while (noSuccess != 0) {
    	tryAgain();
    	if (dead.isEmpty()) {
        break;
    	}
    }
	}

	/**
	 * tryAgain method: print "Algorithm of Success"
	 */
	private void tryAgain() {
    System.out.println("Algorithm of Success");
    
	}

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
    System.out.println("Hello World!");
    
    // print
    System.out.print("A");
    System.out.print("B");
    System.out.print("C");
    
    System.out.print("A" + "\n");
    System.out.print("B" + "\n");
    System.out.print("C" + "\n");
        
    // println
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");

	}

}

/**
 * Key
 * 
 * @author Newman
 *
 */
class Key {
	/**
	 * lock method
	 */
	public void lock() {

	}

	/**
	 * unlock method
	 */
	public void unlock() {

	}
}

/**
 * PrintStream
 * 
 * @author Newman
 *
 */
class PrintStream {
	/**
	 * println method
	 */
	public void println() {

	}
}

/**
 * Person
 * 
 * @author Newman
 *
 */
class Person {
	static Key key;

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
    Person.key.lock();
	}
}

/**
 * SystemCustom
 * 
 * @author Newman
 *
 */
class SystemCustom {
	static PrintStream printStream;

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
    SystemCustom.printStream.println();
	}
}