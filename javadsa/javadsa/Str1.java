package javadsa;

import java.util.*;


public class Str1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);






        String A = sc.next();


        
        String B = sc.next();

        int rel1 = A.length() + B.length();

        System.out.println(rel1);


        int rel2 = A.compareTo(B);

        if(rel2 > 0 ){
            System.out.println( "Yes" );
        }
        else{
            System.out.println("No");
        }

        A = A.substring( 0 , 1).toUpperCase() + A.substring(1);
        B = B.substring( 0 , 1).toUpperCase() + B.substring(1);

        System.out.println( A + " " + B);






    }
}
