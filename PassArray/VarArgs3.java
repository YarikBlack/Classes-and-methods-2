public class VarArgs3 {
    static void vaTest(int ...v){
        System.out.print("VaTest(int...): " + "Numbers of elements: " + v.length + " Contain: ");
        
        for(int x : v){
            System.out.print(x + " ");
        }

        System.out.println();
    }
    // Reload method vaTest:
    static void vaTest(boolean ...v){
        System.out.print("VaTest(boolean...): " + "Numbers of elements: " + v.length + " Contain: ");

        for(boolean x : v){
            System.out.print(x + " ");
        }
    }

    static void vaTest(String msg, int ...v){
        System.out.print("VaTest(String...): " + msg + " Numbers of elements: " +  v.length + " Contain: ");

        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        vaTest(1,2,3);
        vaTest("Test", 1, 2, 4, 8 , 16);
        vaTest(true, false, true, false);
    }
}
