import java.util.Scanner; 
/**
 * The class ArrayOperations takes two arrays of integers and perform some array operations on them..
 * The operations include the values which occur in both arrays (intersection)
 * and the number of values common to both arrays
 *  
 * @author ABJr 
 * @version 06102014
 */
public class ArrayOperations
{
   public static void main(String[] args)
   {
      int [] x = fillArray(4,1);
      int [] y = fillArray(4,2);
      System.out.print("Values for array 1 is: ");
      displayElements(x);
      System.out.println();
      System.out.print("Values for array 2 is: ");
      displayElements(y);
      System.out.println();
      displayCommon(x, y);
   }
   
   /**
      displays the common values in an array
      @param two integer arrays
   */
   public static void displayCommon(int[] a, int[] b)
   {
      int count = 0;
      int countA = 0;
      int countB = 0;
      
      int[] c = new int[a.length];
      
      if (a.length == 0 && b.length == 0)
      {
        System.out.println ("Both arrays are empty.");
      }
      
      for (int i =0; i<a.length; i++)
      {
        for (int j =0; j<b.length; j++)
        {
            if (b[j] == a[i] )
            {
               // System.out.println("Common data is: " + b[j] + " ") ;
               c[count] = b[j];
                count ++;
            } 
        }
      }
      
       System.out.print("Common data is: ") ;
       
       for (int i =0; i<=count; i++)
      {
          System.out.print(c[i] + " ");
      }
      
      System.out.println();
      System.out.println("Number of common data is: " + count) ;
      System.out.println("Non-common values for array 1 is: " + countA) ;
      System.out.println("Non-common values for array 1 is: " + countB) ;
    }
      
   /**
      Prints contents of an array.
      @param an array
   */
   public static void displayElements(int[] data)
   {
      for (int i = 0; i < data.length; i++)
      {
        if(i > 0 && i < data.length)
        {   
            System.out.print(" ");
        }
        System.out.print(data[i]);
        //System.out.println();
      }
   }
   
   /**
      Prompts the user for input and stores the integers into an array.
      @return an array
   */
   public static int[] fillArray(int n, int arrayIndex)
   {
      final int INITIAL_SIZE = n; 
      int [] values = new int[INITIAL_SIZE];
      System.out.print("Enter data for array " +arrayIndex+ " (0 to finish): ");
      Scanner in = new Scanner(System.in);
      int currentSize = 0;
      while (in.hasNextInt() && currentSize < values.length)
      {
          int num = in.nextInt();
          values[currentSize] = num;
          if(num == 0)
          {
              break;
          }
          currentSize++;
          System.out.print("Enter data for array " +arrayIndex+ " (0 to finish): ");
      }
      return values;
   }
   
   /**
      displays the non common values between two arrays
      @param two integer arrays
   */
   /**
   public static void displayNonCommon(int[] a, int[] b)
   {
      int k = 0;
      
      int[] a1 = new int[a.length];
      int[] b1 = new int[b.length];
      
      if (a.length == 0 && b.length == 0)
      {
        System.out.println ("Both arrays are empty.");
      }
      
      for (int i =0; i<a.length; i++)
      {
        for (int j =0; j<b.length; j++)
        {
            if (b[j] != a[i] )
            {
               // System.out.println("Common data is: " + b[j] + " ") ;
               a1[k] = a[i];
                k++;
            } 
        }
      }
   }
   */
   
}
