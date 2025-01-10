import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberLength = scanner.nextInt();
        int number = 0;
        int sum = 0;
        for(int i = 0; i< numberLength;i++){
            number = scanner.nextInt();
            if(number%6 == 0){
                sum += number;
            }
        }
        System.out.println(sum);
    }
}