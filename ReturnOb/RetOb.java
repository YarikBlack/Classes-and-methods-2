public class RetOb {
    public static void main(String[] args){
        RetObTest ob1 = new RetObTest(2);
        RetObTest ob2;

        ob2 = ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();

        System.out.println("ob2.a After increase by ten: " + ob2.a);
    }
}
