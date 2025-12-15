package  javapatterns;
class pt1{

    public static void main(String[] args) {

        Square(5);
        Square(6);
        

     
        
    }


public void Rightangle(){



}






public static void Square(int n){

       System.out.println("Square box of " + n );
         for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("*");
                
            }
            System.out.println(" " ); 
         }

}

}