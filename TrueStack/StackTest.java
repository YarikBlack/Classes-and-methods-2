class StackTest{
    public static void main(String[] args){
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // pull numbers in stack
        for(int i = 0; i < 10; i++){
            myStack1.push(i);
        } 

        for(int i = 10; i < 20; i++){
            myStack2.push(i);
        }

        //get element from first stack
        System.out.println("Elements in first Stack: ");

        for( int i = 0; i < 10; i++){
            System.out.println(myStack1.pop());
        }

        //get element from second stack
        System.out.println("Elements in second Stack: ");

        for( int i = 0; i < 10; i++){
            System.out.println(myStack2.pop());
        }
    }
}