public class Trycatch {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }catch (Exception e){
            System.out.println("something went wrong");
        }finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}