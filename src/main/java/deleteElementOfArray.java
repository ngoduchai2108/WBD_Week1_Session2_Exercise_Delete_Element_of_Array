import java.util.Scanner;

public class deleteElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter size for array
        int size;
        do {
            System.out.println("Enter size for array: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println(" Size should NOT exceed 20!!!");
            }
        }while (size > 20);
        // Enter value for element of array
        int [] array = new int[size];
        for (int i=0; i< size; i++){
            System.out.println("Element "+ (i+1)+" of Array is:");
            array[i] = scanner.nextInt();
        }
        //Show array
        System.out.print("Array is:     ");
        for (int element: array){
            System.out.print(element+ "\t");
        }
        System.out.println(" ");
        // Delete element of array
        int index;
        System.out.println("In the Array, You want delete element: ");
        index = scanner.nextInt();
        for (int j=index-1; j<array.length - 1; j++){
            array[j] = array[j+1];
        }
        array[array.length-1] = 0;
        //Show new array
        System.out.print("New Array is:     ");
        for (int element:array){
            System.out.print(element + "\t");
        }
    }
}
