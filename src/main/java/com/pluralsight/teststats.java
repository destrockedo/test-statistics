package com.pluralsight;


public class teststats {
    public static void main(String[] args) {
        int sum = 0;

        int[] numList = {11, 33 ,22 , 44, 66, 55, 77, 99, 88, 110};
        int highest = numList[0];
        int lowest = numList[0];
        for (int i = 0; i < numList.length; i++) {
            sum += numList[i];
            highest = Math.max(highest, numList[i]);
            lowest = Math.min(lowest, numList[i]);
        }
        //avg = sum of num / length of list
        double average = (double) sum / numList.length;
        System.out.println("Aver: " + average);
        System.out.println("High: " + highest);
        System.out.println("Low: " + lowest);
        System.out.println(sum);
    }

}
