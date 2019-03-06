import model.FemalePerson;
import model.MalePerson;
import model.Person;

import java.util.Scanner;

public class CalorieApp {

    private static Scanner scanner = new Scanner(System.in);
    private static String[] questions = {"Please enter your gender: ","Please enter your weight: "};
    private static Integer indexer = 0;

    public static void main(String[] args){
        // use below link to finish implementing program
        // https://www.livestrong.com/article/78507-calculate-maintenance-calories/
        Person person = gatherBasicInput();
        person.calculateRestingEnergyExpenditure();

        System.out.println("\nAs a " + person.getGender().substring(0,1).toUpperCase() + person.getGender().substring(1)
                         + " your caloric expenditure at rest is: " + person.getRestingEnergyExpenditure() + " calories");

        System.out.println("\nWe will now calculate your maintenance calories, please enter a number bases on activity level\n");
    }

    private static Person gatherBasicInput() {

        Person person = null;

        do{

            System.out.print(questions[indexer]);
            final String value = scanner.nextLine();
            if( validate(value)){
                if(value.startsWith("f") && indexer == 0){
                    person = new FemalePerson();
                    person.setGender(value);
                    indexer++;
                }
                else if(value.startsWith("m") && indexer == 0){
                    person = new MalePerson();
                    person.setGender(value);
                    indexer++;
                }
                else if( indexer == 1){
                    person.setWeight(Float.parseFloat(value));
                    indexer++;
                }
            }
        }while (indexer <= 1);

        return person;
    }

    private static boolean validate(String value) {

        if(indexer == 0 && value.toLowerCase().equals("female") || value.toLowerCase().equals("male")){
            return true;
        }
        else if(indexer == 0){
            System.out.println("Error: You must enter a valid gender");
        }
        else {
            return isNumeric(value);
        }

        return false;
    }

    private static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("Error: Must enter a valid weight");
            return false;
        }
        return true;
    }

}
