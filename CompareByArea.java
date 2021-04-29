package hw.pkg1;
import java.util.*;
/*
Brian Yang
UNI: by2289

Compares rectangles by area
*/
public class CompareByArea implements Comparator<Rectangle>
{
    public int compare(Rectangle left, Rectangle right)
    {
        Rectangle lhs = left;
        Rectangle rhs = right;
        
        //compute areas for right and left rectangles area = length * width
        int rhsArea = rhs.getLength() * rhs.getWidth();
        int lhsArea = lhs.getLength() * lhs.getWidth();

        if(lhsArea < rhsArea)
        {
            return -1;
        }
        else if(lhsArea > rhsArea)
        {
            return 1;
        }
        
        //if the two rectangles have the same area, return 0
        return 0;
    }
}


