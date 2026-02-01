package domain;
/**
 * Клас для обчислення нумерологічних параметрів
 * @author Vlada
 */
public class Exercise {
    /**
     * Розраховує "Число долі" за датою народження за алгоритмом цифрового кореня.
     * @param birthday Дата у форматі String (наприклад, "07.01.2008")
     * @return Ціле число від 1 до 9
     */
    public static int Calculate(String birthday) {
        if (birthday == null) return 0;
        String digits = birthday.replaceAll("\\D", "");
        int sum = 0;
        for (char c : digits.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        if (sum == 0) return 0;
        return (sum % 9 == 0) ? 9 : (sum % 9);
    }
}