package basicjava;

// Created on Sept 6, 2019
public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 18;
        double age1 = 19;
        double sumOfAges = age0 + age1;
        System.out.println("We are " +age0 +" and " +age1 +" years old!");
        System.out.println("The sum of our ages is " +sumOfAges +" !");
        System.out.println("The sum of our ages is " +(age0 + age1) +" !");

        System.out.println(6 / 3);
        System.out.println(6 / (float) 4);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

        int totalHours = 1600;
        int days = totalHours / 24;
        int weeks = days / 7;

        System.out.println("The number of hours is " +totalHours);
        System.out.println("The number of days is " +days);
        System.out.println("The number of weeks is " +weeks);

        //Surface Area and Volume of a Solid Cone
        double h = 5;
        double r = 2;
        double V;
        double A;
        V = ((float) 1/3) * Math.PI * Math.pow(r, 2) * h;
        A = (Math.PI * Math.pow(r, 2)) + (Math.PI * r * Math.sqrt((Math.pow(r, 2) + Math.pow(h, 2))));
        System.out.println("The Surface Area of a Solid Cone with the given height and radius is " +A +", and the Volume is " +V);







    }
}
