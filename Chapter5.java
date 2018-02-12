/*
 * Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year. 
 * In one year, the tuition will be $10,500. 
 * Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year
 */
package csc201;

import java.text.DecimalFormat;

public class Chapter5 {
	private static DecimalFormat df2 = new DecimalFormat(".##");

	public static void main(String[] args) {
		double tuition = 10000, increase = 1.05;
		int year=0;
		
		while(year < 10) {
			tuition *= increase; 
			year++ ;
			
		}
			System.out.println("In " +year +"'s tutition will cost " + df2.format(tuition) );
	
			double total = tuition;
			for(int i = 9; i<= 11; i++) {
				tuition *= increase ;
				total+= tuition;
			}
		System.out.println("After 10 years 4 years worth of tuition will cost: " + df2.format(total) );
	}
	
}




