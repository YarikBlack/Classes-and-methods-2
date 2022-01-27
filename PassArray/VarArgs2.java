public class VarArgs2 {
    static void vaTest(String msg, int ...v){
        System.out.print(msg + v.length + " Contain: ");

        for(int x:v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        vaTest("First Array", 10, 20 ,30 ,10 ,20 ,12312, 3);
        vaTest("2.Elements contain: ", 1);
        vaTest("3.Elements contain: ");
        vaTest("4.Elements contain:  ", 1, 3, 6, 9, 12);
    }
}
