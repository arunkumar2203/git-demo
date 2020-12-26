package com.javatechie.app.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("data ="+data);
		if(data.equals(Constant.name)) {
			System.out.println("Welcome.......");
		}
	}
	public void addedMethod(){
		System.out.println("Devloper 2");

	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
