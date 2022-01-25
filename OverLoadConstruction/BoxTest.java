public class BoxTest {
    public static void main(String[] args){
        Box myBox = new Box(10, 20, 15);
        Box myBox1 = new Box();
        Box myCube = new Box(7);

        double vol;

        // recive Area of first Box
        vol = myBox.volume();
        System.out.println("Area of first Box: " + vol);

        //recive Area of second Box
        vol = myBox1.volume();
        System.out.println("Area of second Box: " + vol);

        //recive Area from Cube
        vol = myCube.volume();
        System.out.println("Area of Cube: " + vol);

        // Change parameters of second Box
        System.out.println("Changing parameters of second Box...");
        myBox1.width = 20;
        myBox1.height = 6;
        myBox1.depth = 9;

        // recive Area of second Box after change
        vol = myBox1.volume();
        System.out.println("Area of second Box: " + vol);
    }
}
