public class TestStackLength {
    public static void main(String[] args){
        StackLength myStack1 = new StackLength(5);
        StackLength myStack2 = new StackLength(8);

        // set up numbers in to first Stack
        for(int i = 0; i < 5; i++){
            myStack1.push(i);
        }
        
        // set up numbers in to second Stack
        for(int i = 0; i < 8; i++){
            myStack2.push(i);
        }
        
        // get elements from first Stack
        System.out.println("First Stack: ");
        for(int i = 0; i < 5; i++){
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();

        // get elements from second Stack
        System.out.println("Second Stack: ");
        for(int i = 0; i < 8; i++){
            System.out.print(myStack2.pop() + " ");
        }
        System.out.println();

        System.out.println("The end!");
    }
}
