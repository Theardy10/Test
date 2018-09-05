

                                /*TWO VERSIONS OF DEL DUPS*/
import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * This program demonstrates operations on linked lists.
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
class DelDups{
 public static void main (String[] args) throws java.lang.Exception
    {
 int[] a = new int[] {1, 1,2,4,4,6,4,6,1, 2, 1, 3, 3};
int[] b = new int[a.length];
int curIndex = 0;
for (int i : a) {
    if (!contains(b, i)) {
        b[curIndex++] = i;
    }
}
System.out.println(Arrays.toString(Arrays.copyOf(b, curIndex)));
}

public static boolean contains(int[] a, int num) {
    for (int i : a) {
        if (i == num) {
            return true;
        }
    }
    return false;
}
}



import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * This program demonstrates operations on linked lists.
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
class DelDups{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] a = new int[] {1, 1,2,4,4,6,4,6,1, 2, 1, 3, 3};
        List b = new ArrayList();
        for (int i : a) {
            if (!contains(b, i)) {
                b.add(i);
                i++;
            }
        }
      System.out.println(b);
    }

    public static boolean contains(List<Integer> a, int num) {
        for (Integer i : a) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
