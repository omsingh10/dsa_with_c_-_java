public class wowow {
   
    
     static class Classroom{

        String  stname;

        static int stnumber;
        static String stteach = "sharma mam";

        public Classroom(String stname) {
            this.stname = stname;
            stnumber++;
        }

    }

    public static void main(String[] args) {
 
        Classroom c1 = new Classroom("satyarth");
        Classroom c2 = new Classroom("satyarth2");
        Classroom c3 = new Classroom("satyarth5");

        System.out.println(c1.stname);
        System.out.println(c2.stname);
        System.out.println(c3.stname);

        System.out.println(Classroom.stnumber);
        System.out.println(Classroom.stteach);
        
    }
}