public class Main {
    public static void main(String[] args) {


        // For statement that prints 1 through 5
        for(int i = 1; i <= 5; i++){
            System.out.println(i);

        }

        // A Do-While statement that prints 1 through 5
        int j = 1;
        boolean isReady = false;
        do {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);

        } while (isReady);


        // While statement that prints 5 through 50 but skipping all divisible by 25
        int number = 0;
        while (number < 50){
            number += 5;

            if (number % 25 == 0){
                continue;
            }

            System.out.print(number + "_");

        }


    }

}
