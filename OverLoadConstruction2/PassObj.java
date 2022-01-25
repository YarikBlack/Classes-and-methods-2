public class PassObj {
    public static void main(String[] args){
        Test test = new Test(15, 30);
        
        System.out.println("A and B before function: " + test.a + " " + test.b);

        test.math(test);

        System.out.println("A and B after function: " + test.a + " " + test.b);
    }
}
