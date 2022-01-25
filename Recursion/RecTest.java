public class RecTest {
    int values[];

    RecTest(int i){
        values = new int[i];
    }

    void printArrays(int i){
        if(i == 0) return;
        else printArrays(i - 1);
        System.out.println("[" + (i-1) + "]" + values[i-1]);
    }
}
