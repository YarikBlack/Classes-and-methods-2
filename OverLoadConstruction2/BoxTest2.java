public class BoxTest2{
    public static void main(String[] args){

        Box2 myBox = new Box2(20, 5, 2); // create box with all parameters
        Box2 myBox1 = new Box2(myBox); // create box with myBox parameters
        Box2 myBox2 = new Box2(); // create box with zero arguments
        Box2 myCube = new Box2(20); // create cube

        System.out.println("We create all Objects!");

        // Print area of all created objects
        System.out.println("Area of first object: " + myBox.vol());
        System.out.println("Area of second object: " + myBox1.vol());
        System.out.println("Area of third object: " + myBox2.vol());
        System.out.println("Area of fourth object: " + myCube.vol());

        System.out.println();
        System.out.println("The end!");
    }
}