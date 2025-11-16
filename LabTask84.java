public class LabTask84{
    public static int numberOfDaysInAYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 366;
        } else {
            return 365;
        }
    }
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
         System.out.println(year + " has " + numberOfDaysInAYear(year) + " days.");
        }
    }
}
