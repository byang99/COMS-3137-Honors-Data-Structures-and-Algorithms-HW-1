package hw.pkg1;
import java.util.*;
/*
Brian Yang
UNI: by2289

Rectangle Class that implements Comparable.
*/
public class Rectangle implements Comparable<Rectangle>
{
    private int length;
    private int width;
    
    //default constructor
    public Rectangle()
    {
        this.length = 1;
        this.width = 1;
    }
    
    //constructor with parameters
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    
    //override the toString method
    public String toString()
    {
        return "Length: " + length + "  Width: " + width;
    }

    public int compareTo(Rectangle right)
    {
        //compare Rectangles by area
        Rectangle rhs = right;
        
        //compute areas for right and left rectangles area = length * width
        int rhsArea = rhs.getLength() * rhs.getWidth();
        int thisArea = this.getLength() * this.getWidth();

        if(thisArea < rhsArea)
        {
            return -1;
        }
        if(thisArea > rhsArea)
        {
            return 1;
        }
        return 0;
    }
}


