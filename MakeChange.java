package hw.pkg1;
import java.util.*;
/*
Brian Yang
UNI: by2289

MakeChange - prints out all combinations of nickels, dimes, and quarters that 
             can be used to make change for a specified total value
*/
public class MakeChange
{
    //create array containing the types of coins available for use
    public static final int coins[] = {5, 10, 25};
    
    public static void PrintCombinations(int total)
    {
        ArrayList<Integer> results = new ArrayList<>();
        //creating new array list with (total / 5) elements. This allows
        //us to use the arraylist set method.
        for(int i = 0; i < (total / 5); i++)
        {
            results.add(0);
        }
        
        PrintCombinations(results, 0, total, 0);
    }
    
    //private helper method
    private static void PrintCombinations(ArrayList<Integer> results, int param, int total, int index)
    {
        //process each coin - nickel, dime, quarter
        
        //if the total is not divisible by 5, then the total can't be made from
        //nickels, dimes, and quarters
        if(total % 5 != 0)
        {
            System.out.println(total + " can't be changed.");
        }
        //if total equals zero, then we have found the list of coins
        //that will make change for that total. Thus, we print out the list
        else if(total == 0)
        {
            //we only print out the coins that sum up to the total, which ends at
            //index - 1
            for(int i = 0; i < index; i++)
            {
                System.out.print(results.get(i) + " ");
            }
            System.out.println();   
        }
        //if total < 0, then we stop and don't return anything.
        else if(total < 0)
        {
            return;
        }
        else
        {
            //traverse through each coin type, not repeating coin types.
            for(int i = param ; i < coins.length; i++)
            {
                //if we can use the coin to decrease our total, add that
                //coin to the result, setting "old" coins with new alternatives
                results.set(index, coins[i]);
                //recursively call the function, now with the new total
                //and index starting at i - the coin we are still testing
                //this will first use only nickels to make the change.
                //After each print, remove the last coin from the results array,
                //then try to see if the difference between the current value and 
                //the total can be completed with dimes. If not, we remove another
                //coin from the end of the arraylist results and continue testing
                //If a dime is added, the next iteration removes the dime and
                //tests if quarters can be used.
                PrintCombinations(results, i , total-coins[i], index + 1);
            }
        }
    }
    
    public static void main(String [] args)
    {
        MakeChange test = new MakeChange();
        int total = Integer.parseInt(args[0]);
        MakeChange.PrintCombinations(total);
    }
}


