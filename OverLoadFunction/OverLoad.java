public class OverLoad {
    public static void main(String[] args){
        
        OverLoadTest overLoad = new OverLoadTest();
        double result;

        // call function without arguments
        overLoad.test();
        
        // call function with two int arguments
        overLoad.test(20, 60);

        // call function with double argument
        overLoad.test(30.5);

        result = overLoad.test(30.5);
        System.out.println("Result of (30.5):  " + result);
    } 
}
