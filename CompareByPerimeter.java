package hw.pkg1;
import java.util.*;

/*
Brian Yang
UNI: by2289

Compares rectangles by perimeter
*/
public class CompareByPerimeter implements Comparator<Rectangle>
{
    public int compare(Rectangle left, Rectangle right)
    {
        Rectangle lhs = left;
        Rectangle rhs = right;
        
        //compute perimeters for right and left rectangles
        //perimeter = 2 * (length + width)
        int rhsPerimeter = 2 * (rhs.getLength() + rhs.getWidth());
        int lhsPerimeter = 2 * (lhs.getLength() + lhs.getWidth());

        if(lhsPerimeter < rhsPerimeter)
        {
            return -1;
        }
        else if(lhsPerimeter > rhsPerimeter)
        {
            return 1;
        }
        //if the two rectangles have the same perimeter, return 0
        return 0;
    }
}


