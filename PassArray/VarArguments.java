public class VarArguments {
    
    static void vaTest(int... v){
        System.out.print("Numbers of arguments: " + v.length + " Contain: ");

        for(int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        vaTest(10);
        vaTest(3, 13);
        vaTest(1, 2, 3, 4, 5);
        vaTest();
    }
}

