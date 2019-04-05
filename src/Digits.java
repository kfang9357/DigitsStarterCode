import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
       digitList = new Array<Integer>();
        if (num ==0)
        {
            digitList.add(new Integer(0));
        }
        while (num>0)
        {
            digitList.add(0. new Integer(num%10));
        }
    }
    public boolean isStrictlyIncreasing()
    {
        //implemented in part (b)
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
