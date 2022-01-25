public class RetObTest {
    int a;

    RetObTest(int i){
        a = i;
    }

    RetObTest incrByTen(){
        RetObTest temp = new RetObTest(a + 10);
        return temp;
    }
    
}
