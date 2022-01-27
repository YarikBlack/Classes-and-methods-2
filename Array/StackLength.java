public class StackLength {
    private int stck[];
    private int tos;

    // creating Stack
    StackLength(int size){
        stck = new int [size];
        tos = -1;
    }

    // set element in Stack
    void push (int item){
        if(tos == stck.length - 1){
            System.out.println("Stack is full!");
        } else{
            stck[++tos] = item;
        }
    }

    // get element from Stack
    int pop(){
        if( tos < 0){
            System.out.println("Stack is not loaded!");
            return 0;
        } else{
            return stck[tos--];
        }
    }
}
