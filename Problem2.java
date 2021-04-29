package hw.pkg1;
import java.util.*;
/*
Brian Yang
UNI: by2289

Problem2.java - Binary Search
*/
public class Problem2
{
    //private helper method
    private static <AnyType extends Comparable<AnyType>> int binarySearch
    (AnyType [] array, int first, int last, AnyType value)
    {
        int middle;
        
        //if first > last, then element is not in the list, so return -1
        if(first > last)
        {
            return -1;
        }
        //set middle to the middle element
        //we  use first + (last-first) / 2 to ensure that the middle element
        //will never overflow
        middle = first + (last - first) / 2;
        //if(array[middle] < value)
        //if element at middle index is less than the value, the element
        //is in the upper half of the list, so search the list starting at 
        //index middle+1 and going to index last
        if(array[middle].compareTo(value) < 0)	
        {
            return binarySearch(array, middle + 1, last, value);
        }
        //if element at middle index is greater than the value, the element
        //is in the lower half of the list, so search the list starting at 
        //index first, and going to index middle-1
        else if(array[middle].compareTo(value) > 0)
        {
            return binarySearch(array, first, middle - 1, value);
        }
        //if element at middle index is not greater nor less than the value,
        //then it is equal, so return the index middle
        else //if(array[middle] == value)
        {
            return middle;
        }
    }

    public static <AnyType extends Comparable<AnyType>> int binarySearch
    (AnyType[] a, AnyType x)
    {
        //call private binary search method, starting from index 0 to index
        //length - 1
        return binarySearch(a, 0, a.length - 1, x);		
    }
    
    public static void main(String [] args)
    {
        Rectangle rectArray [] = new Rectangle[6];
        
        rectArray[0] = new Rectangle(1,1);
        rectArray[1] = new Rectangle(2,4);
        rectArray[2] = new Rectangle(3,3);
        rectArray[3] = new Rectangle(4,1);
        rectArray[4] = new Rectangle(5,1);
        rectArray[5] = new Rectangle(6,1);
        
        Arrays.sort(rectArray);
        Rectangle findMe = new Rectangle(2,4);
        for(int i = 0; i < 6; i++)
        {
            System.out.println("Rectangle " + (i+1) + ": " + rectArray[i]);
        }
        System.out.println("Index: "  + binarySearch(rectArray, findMe));
        System.out.println("Dimensions: " + rectArray[binarySearch(rectArray,findMe)]);        
    }
}


