package Lab09;

enum Day { MON, TUE, WED, THU, FRI, SAT, SUN }

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.WED;
        System.out.println("Today status evaluation identifier: " + today);
    }
}