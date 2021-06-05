package com.programs.array;
//All arrays will have clone() method inherited from java.lang.Object class. Using this method, you can copy an array.
public class ArraysClone {

	public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
        //creating a copy of array 'a' using clone() method
        int[] b = a.clone();  
        //Printing elements of array 'b'
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
        //Now changing values of one array will not reflect in other array
        a[2] = 56;       //Changing value of 3rd element in array 'a'
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
        b[4] = 100;     //Changing value of 5th element in array 'b'
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
    }
	
}
