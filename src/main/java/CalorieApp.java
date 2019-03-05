import model.Person;

import java.util.Scanner;

public class CalorieApp {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] questions = {"Please enter your gender: ","Plesae enter your weight: "};
    private static Integer indexer = 0;

    public static void main(String[] args){
        // use below link to finish implementing program
        // https://www.livestrong.com/article/78507-calculate-maintenance-calories/
        Person person = gatherInput();
    }

    private static Person gatherInput() {

        Person person = null;

        while(true){

            System.out.print(questions[indexer]);
            final String gender = scanner.nextLine();
            validateInput(gender);

            if(indexer > 1){
                break;
            }
        }

        return person;
    }

    private static void validateInput(String value){
        String newValue = value;
        if(indexer == 0){

            while (!newValue.toLowerCase().equals("female") || !newValue.toLowerCase().equals("male")){
                System.out.println("Error: you must enter a valid gender");
                System.out.print(questions[indexer]);
                newValue = scanner.nextLine().trim();
                System.out.println(value);
                System.out.println(indexer);
            }
            indexer++;
        }
    }
}
