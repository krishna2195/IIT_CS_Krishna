/*
 * Run this program to find area of circle.
 * 
 *@author 
 */

//package com.programs;

import java.util.Scanner;

public class CircleAreaMain {

	public static void main(String[] args) {

		System.out.println("Enter the radius  of a circle:");

		Circle refCircle = new Circle();
		refCircle.setRadius(15);

		Scanner in = new Scanner(System.in);
		float radius = 0;

		try {
			radius = in.nextFloat();
			Circle circle = new Circle();
			Circle anotherRef = circle;
			circle.setRadius((float)radius);
			Calculations calculations = new CalcuationsImpl();
			calculations.calculateArea(circle);
			System.out.println("Area of a circle with radius " + radius + " is :"
					+ Math.round(calculations.calculateArea(circle)));

			int isRefCircleBigger = refCircle.compareTo(circle);
			if (isRefCircleBigger > 0) {
				System.out
						.println("Ref circle with radius 15 is bigger than user created circle with radius :" + radius);
			}
			if (isRefCircleBigger < 0) {
				System.out.println(
						"Ref circle with radius 15 is smaller than user created circle with radius :" + radius);
			}

			if (isRefCircleBigger == 0) {
				System.out.println(
						"Ref circle with radius 15 is same size as the user created circle with radius :" + radius);
			}

			System.out.println("To String of user created circle" + circle.toString());
			System.out.println("To String of ref circle" + refCircle.toString());

			System.out.println(
					"Equals operations result between refCircle and user created circle :" + refCircle.equals(circle));
			System.out.println("Equals operations result between anotherRef and user created circle :"
					+ anotherRef.equals(circle));

		} catch (Exception e) {
			System.out.println("Invalid value for radius enter a number without units");
		}

	}

}
