public class Test{
    int a;
    int b;

    Test (int i, int k){
        a = i;
        b = k;
    }

    public void math(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}