package Com.exceptionHandling;

public class Exception2 {
    public static void main(String args[]){
        try {
            int a = 10;
            int[] array = {1, 2, 3, 4};
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            //arrays have indexing--> position to each and every element, it starts with 0
            System.out.println(vowels[5]);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of program");
    }
}




