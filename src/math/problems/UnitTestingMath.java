package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
    	Factorial factorial=new Factorial();
    	int experimental=factorial.factorial(5);
    	

    	 try {
             Assert.assertEquals(experimental, expected, "Wrong calculation");
         }catch(Exception ex){
             ex.getMessage();
         }
    	 Fibonacci fib=new Fibonacci();
    	int experiment=fib.fibonacciEx(5);
    	int expect=5;

     	 try {
              Assert.assertEquals(experiment, expect, "Wrong calculation");
          }catch(Exception ex){
              ex.getMessage();
          }
     	 int [] array1 = {30,12,5,9,2,20,33,1};
         int [] array2 = {18,25,41,47,17,36,14,19};

         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
     	 int result=FindLowestDifference.lowestDiff(array1, array2);
     	 int actual=1;
     	 try {
             Assert.assertEquals(result, actual, "Wrong calculation");
         }catch(Exception ex){
             ex.getMessage();
         }
     	 int result1=FindMissingNumber.missingNum(array);
     	 int actual1=9;
     	 try {
             Assert.assertEquals(result1, actual1, "Wrong calculation");
         }catch(Exception ex){
             ex.getMessage();
         }
     	int[] array14= new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
     	
     	int result2=LowestNumber.findMin(array14);
     	int actual2=5;
     	try {
            Assert.assertEquals(result2, actual2, "Wrong calculation");
        }catch(Exception ex){
            ex.getMessage();
        }
    }
}
