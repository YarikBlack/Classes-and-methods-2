public class Stack{

    private int stck [] = new int[10];
    private int tos;

    // installing top of stack
    Stack(){
        tos = -1;
    }

    // push elements in stack
    void push(int item){
        if(tos == 9)
            System.out.println("Stack is full!");
        else
            stck[++tos] = item;
    }

    int pop(){
        
        if( tos < 0){
            System.out.println("Stack is not full.");
            return 0;
        }
        else
            return stck[tos--];
    }
}