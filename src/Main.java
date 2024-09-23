
public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 34));
    }

    private static boolean hasSharedDigit(int first, int second) {
        if(first < 10 || first > 99){
            return false;
        }
        if(second < 10 || second > 99){
            return false;
        }

        int secondCopy = second;

        while (first > 0){
            int firstCheck = first % 10;
            //Get the last digit of first with mod store in firstCheck
            while(second > 0){
                int secondCheck = second % 10;
                //Get the last digit of second with mod store in secCheck
                if(firstCheck == secondCheck){
                    return true;
                }
                second /= 10;
            }
            first /= 10;
            second = secondCopy;
        }

        return false;

    }
}