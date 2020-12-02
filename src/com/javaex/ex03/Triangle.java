package com.javaex.ex03;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle(int width, int height) { //기본 생성자 만들기
		this.width = width;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.println("====삼각형====");
		System.out.println("#면색:"+fillColor); //protected로 바꿔주기
		System.out.println("#선색:"+lineColor); //Shape.java의 필드를
		System.out.println("#가로:"+width);
		System.out.println("#세로:"+height);
	}
}





