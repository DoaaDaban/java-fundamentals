package lab2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("hello");

        Library demo=new Library();
        System.out.println(Arrays.toString(demo.roll(5)));

        int [] resultArr= new int []{2,5,7,9,4};
        System.out.println((demo.containsDuplicates(resultArr)));

        int [] avarage= new int []{9,2,1,5,4};
        System.out.println((demo.findAverage(avarage)));



        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(demo.lowestAverage(weeklyMonthTemperatures)));

    }


}
