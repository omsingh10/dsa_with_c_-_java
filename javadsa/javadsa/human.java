public class human {

    public static void main(String[] args) {
        System.out.println("  O  ");
        System.out.println(" /|\\ ");
        System.out.println(" / \\ ");

          Class<Object> obj = new Class<>();
    obj.display(); 

            love<String> obj1 = new love<>();
    obj1.show();
    }
    

   public static class Class<T> {
       public void display() {
           System.out.println("Displaying object of type: " + getClass().getName());
       }
   }


   public static class love<T>{
         public void show() {
              System.out.println("Showing object of type: " + getClass().getName());
         }
   }

}


