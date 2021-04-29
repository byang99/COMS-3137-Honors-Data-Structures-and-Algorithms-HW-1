package hw.pkg1;
import java.util.*;
/*
Brian Yang
UNI: by2289

Problem1.java - findMax using Comparators - compareByArea and compareByPerimeter
                on Rectangle objects
*/
public class Problem1
{
    public static <AnyType> AnyType findMax(AnyType[] arr, Comparator<? super AnyType> cmp)
    {
        //max element is set to the first element
        int maxIndex = 0;
        //traverse the array
        for(int i = 0; i < arr.length; i++)
        {
            //if element at index i is greater than element at index maxIndex, then
            //maxIndex is i - max element is now the element at index i
            if(cmp.compare(arr[i], arr[maxIndex]) > 0)
            {
                maxIndex = i;
            }
        }
        //return the max element
        return arr[maxIndex];
    }
    public static void main(String[] args)
    {
        Rectangle arr[] = new Rectangle[5];
        arr[0] = new Rectangle(1,1);
        arr[1] = new Rectangle(2,1);
        arr[2] = new Rectangle(3,1);
        arr[3] = new Rectangle(1,10);
        arr[4] = new Rectangle(5,5);

        System.out.println("Max rectangle by area: " + findMax(arr, new CompareByArea()));
        System.out.println("Max rectangle by perimeter: " + findMax(arr, new CompareByPerimeter()));
    }
}


