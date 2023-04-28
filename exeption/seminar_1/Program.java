package exeption.seminar_1;

public class Program {
    static int arrayLength(int[] array){
        if(array.length<2)
            return -1;
        return array.length;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int length = arrayLength(array);
        if(length<0)
            System.out.println("Length of array less than minumum");
        else
            System.out.println("Length of array: " + length);
    }
}
