import domain.Exercise;
public class TestResult {
    public static void main(String[] args) {
        // вхідні дані
        String birthDate = "07.01.2008"; 
        int result = Exercise.Calculate(birthDate);
        //вивід
        System.out.println("---------------------------------");
        System.out.println("Нумерологічний звіт");
        System.out.printf("Аналізована дата: %s\n", birthDate);
        System.out.printf("Обчислене число долі: %d\n", result);
        System.out.println("---------------------------------");
    }
}