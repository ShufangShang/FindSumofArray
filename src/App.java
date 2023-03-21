public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        int[ ] intArray = {1,5,6,3,4,2};

        int sum = 0;

        for (int i = 0; i < intArray.length; i++)
        {
            sum += intArray[i];
        }

        System.out.printf("The sum of the integer array is %d.", sum);

    }
}
