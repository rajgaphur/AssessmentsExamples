package com.mindtree.assignment2.question2;

public class CompareStudents {

	public static boolean compareStudents(Student batch1[], Student batch2[])
	{
		int flag = 0;
		try {
			for(int i=0;i<batch1.length;i++){
				if(batch1[i].getStudentScore()==batch2[i].getStudentScore()){
					flag=1;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		if(flag==1)
			return true;
		return false;
	}
	
}
