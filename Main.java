/*
 * Example for Arrays
 */

import java.util.Scanner;

class Main
{
    /*
     * This one will have public static void main
     */
    
    public static void main( String[] args)
    {
     
     
        
        /*
         * SET UP
         * We are going to ask the user to input an integer 
         * and we will call it
                              n
         */
        Scanner s = new Scanner(System.in);
        System.out.print(" Please type in an integer :");
        int n = s.nextInt();
        
        /*
         * Task 1.  Create an array of integers from 0 to n-1
         *          call this array ar1.  Print it out below.
         */
        System.out.println("*** PRINTING ar1 *");
        
                int[] ar1 = new int[n];
                
                for (int i=0; i<n; i++)
                    ar1[i]=i+1;
                for (int i = 0; i < n; i++)
                    System.out.println("ar1[" + i + "] = "+ar1[i]);
       
                int[] ar2 = new int[ar1.length];
            for (int i = 0; i<ar2.length; i++)
                    ar2[i]=ar1[i];
            for (int i=0; i<ar2.length; i++)
                   System.out.println("ar2[" + i + "] = "+ar1[i]);
                   
        /*
 * Task 2. Create a new array called ar2.
 * Copy the elements of ar1 into ar2.
 */
 
 System.out.println("** ar2 **");
 
 
 
 // 
 // ar2 = ar1.clone() also does this
 // ar2 = ar1, just copies the address so you are not copying the array
 //
 ar2= new int[ ar1.length ]; // sets the size of the array to equal ar1.
 for (int i=0 ; i<ar2.length ; i++)
 {
 ar2[i]=ar1[i];
 }
 
 // ar2[ i ] = i 
 for (int i=0 ; i<ar2.length ; i++)
 System.out.println("ar2[" + i + "] = "+ar2[i]);
 // ar2[ i ] = i
 
 // Just copies the memory location so ar2 and ar1 are literally the same
 // ar2=ar1
        
        /* 
         * Task 3. Add 1 to each element in ar1.  Print it out below
         */
        System.out.println("** Stask 3 **");

        for (int i=0 ; i<ar1.length ; i++)
        {
            ar1[i] = ar1[i] +1;
        }

        for (int i=0 ; i<ar1.length ; i++)
        System.out.println("ar1[" + i + "] = "+ar1[i]);

        
        
        /*
         * task 4. Create a new array called ar3.
         *         Copy the elements of ar1 into ar3.  Then do it again
         *         For example
         *         ar1: 1 2 3
         *         ar3: 1 2 3 0 1 2 3
         */
        int[] ar3 = new int[2*ar1.length];
        
        for (int i = 0; i<ar1.length; i++)
        {
            ar3[i] = ar1[i];
        }
        for (int i = 0; i<ar1.length; i++)
        {
            ar3[i+ar1.length]=ar1[i];
        }
        
        /*
         * Task 5.  Switch the first and last element of ar1.
         *          print out the new ar1.  Then switch them back*/
         int value;
         value = ar1[0];
         int[] ar4 = new int[ar1.length];
         ar1[0] = ar1[ar1.length];
         ar1[ar1.length] = value;
        
        /*
         * Task 6A. Print the 2nd to (n-1)th elements of ar1*/
         for (int i = 2; i<n-1; i++)
         {int[] ar5 = new int[n-3];
         ar5[i-2]=ar1[i];}
         /*
         * Task 6B: Print out just the odd numbers in ar1
         */
        for (int i=0; i<ar1.length; i=i+2)
            {System.out.println(ar1[i]);}
            /*
         * Task 6C: Print out the elements of ar1 when
         *          the indices are multiples of 3
         *         
         */
        for (int i=0; i<ar1.length; i++)
            {if (i%3==0)
                System.out.println(ar1[i]);
            }
        /*
         * Task 7.  For each element in ar1, 
         *          If the element is even: leave alone
         *          if the element is odd, multiply by 10
         *          print out the new ar1
         *          Example
         *          ar[0]=10
         *          ar[1]=2
         *          ar[2]=30
         *          ar[3]=4
         */
         for (int i=0; i<ar1.length; i++)
            {if (i==0||i%2==0)
                ar1[i]=ar1[i]*10;
            }
            System.out.println(ar1);
        
         /*
          * Task 8
          *    Create an array called ar2odds
          *    If the index of ar2 is odd, copy it to ar2odds.
          *    If not, do not
          *    ar2[0]=0
          *    ar2[1]=1  ->  ar2odds[0]=1
          *    ar2[2]=2
          *    ar2[3]=3  ->  ar2odds[1]=3
          */
         int[] ar2odds = new int[4];
         ar2[0]=0;
         ar2[1]=1;
         ar2[2]=2;
         ar2[3]=3;
         
         for (int i=0; i<ar2.length; i++)
         {
             int a = (int)(i/2+1);
             if (i%2==1)
             {
                 ar2odds[a]=ar2[i];
                }
            }
        /*
         * Task 9. In the array ar2, count how many odd numbers you
         * have.  Then create an ew array called ar4.  Copy just the odd
         * numbers from ar1 into ar4.  Print ar4
         */
        
        for (int i=0; i<ar2.length;i++)
        {
            if (ar1[i]%2==0)
            {
                ar4[i]=ar1[i];
            }
        }
            
        /*
         * Task 10.  Shift the elements of ar4 right by 1
         * For example
         * old   ar4: 1 3 5 7 9
         * new   ar4  9 1 3 5 7
         */
        int[]ar = new int[ar4.length];
       for (int i=1; i<ar4.length; i++)
       {
           
           ar[i-1]=ar[i];
           }
           ar[0]=ar4[ar4.length];
        for (int i=0; i<ar4.length; i++)
        {
            ar4[i]=ar[i];
        }
        
        /*
         * Task 11.  Reverse the order of elements in ar2
         */
        int[] ar2new = new int[ar2.length];
        for (int i=0; i<ar2.length; i++)
        {
            ar2new[i]=ar2[Math.abs(i-ar2.length)];
        }
        
        /*
         * Task 12: 
         * Create an array of Strings called ar5.
         * 
         * Each element is a word of the following phrase
         * 
         * 
         * Four score and seven years ago our fathers brought forth on
         * this continent a new nation
         *
         *. ar5[0] = "Four"
         *  ar5[1] = "score"
         *  
         *  Create another array of ints called ar6.  Write a for loop that
         *  will iterate through each element in ar5 and the length of the
         *  word is the element in ar6.
         *  
         *  ar5[0]= "Four"   ar6[0]=4
         *  ar5[1]="score"   ar6[1]=5
         *  ar5[2]="and"     ar6[2]=3
         *  
         *  Count how many words have more than 5 letters.
         */
        
        /*
         * Task 13
         * Create an array called monsterArray of 5 Monsters.
         * The name of the monsters are
         * "Cookie"
         * "Grover"
         * "Oscar the Grouch"
         * "Elmo"
         * "Rosita"
         * 
         * Print out their names
         * Use a for loop to print out the names of monster that start with
         * a vowel
         */
        
         /*
          * Task 14
          * Create an array of integers from 3 to 94 and call it arx
          * Create an array of the indices of arx when the item is
          * divisible by 3.  Call this arindex
          *      arx[0]=94
          *      arx[1]=95
          *      arx[2]=96 // this is divisible.  Index is 2
          *      arx[3]=97
          *      arx[4]=98
          *      arx[5]=99 // this is divisible  Index is 5
          *      
          *      So arindex[0]=2
          *         arindex[1]=5
          */
         
         /*
          * Create an arrary called "fb" and calculate the
          * first 10 fibonacci sequence.  You start with
          * fb[0]=1
          * fb[1]=1
          * fb[2]=fb[0]+fb[1]
          * fb[3]=fb[1]+fb[2]
          * fb[4]=fb[2]+fb[3]
          */
        
    }
}