package week1.day2.ClassroomArrays;

import java.util.Arrays;

public class MissingElementInArray {
public static void main(String[] args) {
  int [] a = {1,2,3,4,7,6,8};
  
  //1+2+3+4+7+6+8=31
  //1+2+3+4+5+6+7+8=36
  //36-31=5
  
  int sum1=0;
  
  for (int i = 0;i<a.length;i++)
  {
	  sum1=sum1+a[i];
	  
  }
  System.out.println("sum of elements in the array:"+sum1);
  
  int sum2=0;
  
  for (int i=0; i<=8;i++)
  {
	  sum2= sum2+i;
	
  }
  System.out.println("sum of ranges of elemnets in the array:"+sum2);
  System.out.println("Missing numer is:"+(sum2-sum1));
 
  
System.out.println("Array after sorting:"+ Arrays.toString(a));
		  
int n=a.length;
		  
for (int i = 0; i<n-1;i++)
{
	for (int j = 0; j<n-1;j++) {
		
		if(a[j]>a[j+1])
{
	int temp=a[j];
	a[j]=a[j+1];
	a[j+1]= temp;
	System.out.println("Array after sorting:"+ Arrays.toString(a));
}
	}
}
}



}

