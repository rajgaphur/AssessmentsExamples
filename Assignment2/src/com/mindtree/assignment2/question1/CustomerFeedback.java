package com.mindtree.assignment2.question1;


public class CustomerFeedback {
	
	
	public static double calculateFeedback(Customer customers[]){
		double sum=0;
		for (Customer customer : customers) {
			sum+=customer.getFeedbackRating();
		}
		 
		sum = sum/customers.length;
		System.out.println(sum);
		return sum;
	}

}
