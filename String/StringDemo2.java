public class StringDemo2 {
    public static void main(String[] args){
        String strOb1 = "First String";
        String strOb2 = "Second String";
        String strOb3 = strOb1;

        System.out.println("Length of First String: " + strOb1.length());
        System.out.println("Symbol in index 3 in Second String: " + strOb2.charAt(3));
        System.out.println("First string equals Third String? " + strOb1.equals(strOb3));
    }
}
