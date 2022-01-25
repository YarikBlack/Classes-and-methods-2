class OverLoadTest{
    
    //declare function without parameters
    void test(){
        System.out.println("Function without parameters");
    }
    
    //declare function with two int parameters
    void test(int a, int b){
        System.out.println("Int a: " + a + "  and Int b: " + b);
    }

    //declare function with double parameters
    double test(double a){
        System.out.println("Double a: " + a);
        return a*a;
    }
    
}