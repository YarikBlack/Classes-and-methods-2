public class AccessTest {
    public static void main(String[] args){
        Access ob = new Access();

        // it's correct operators 
        ob.a = 10;
        ob.b = 20;

        // it's not correct operator because int c is private
        //ob.c = 100

        // we can only use methods to affect in int c
        ob.setc(100); // it's correct operator
        System.out.println("a, b, and c: " + ob.a + "; " + ob.b + "; " + ob.getc());
    }
}
