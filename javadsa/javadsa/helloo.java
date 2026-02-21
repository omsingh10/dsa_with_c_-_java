package javadsa;

public class helloo {

 
    public static void main(String args[]) {
    	
    System.out.println(palin(121));
    	;
    	
    }

    
    
    
    // Check Palindrome Number
    //121
    
    public static String palin(int n) {
    	
    	int k = n ;
    	int sum = 0;
    	
    	while(k != 0) {
    		int rev = k % 10 ;
    	sum = (sum * 10) + rev ;
    	k = k /10;
    	
    	
    	}
    	if(sum == n) {
    		return "yes";	
    	}
    	return "no";
    	
    	
    }
    
    
    
    
    
    
    
    public static String evenodd(int n) {
    	
    	if(n%2==0) {
    		return "even";
    		
    	}else {
    		return "odd";
    	}
    	
    	
    	
    }
    
    public static int ficobancii(int aa) {
    	
    	
    
    	int a = 0;
    	int b = 1;
    	int k = 0 ;
    	
    	for(int i = 2 ;i<= aa; i++) {
    		
    		int n = a + b ;
    		a =b ;
    		b= n;
    		k =n ;	
    	}
    	return k;	
    }
    
}
