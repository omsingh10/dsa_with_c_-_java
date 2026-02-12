public class klo {

static class Dog{

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class Demo{
    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Max", 5);

        System.out.println("Dog 1 humsnds: " + dog1.name + ", Age: " + dog1.age )  ;
        System.out.println("Dog 2: " + dog2.name + ", Age: " + dog2.age ) ;

    }
}





}
