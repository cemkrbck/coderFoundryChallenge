package com.example.text;

import java.util.ArrayList;

public class Main {

    public static void whichBuildingsAbleToSee(int[] buildings, int sunsetHeightLevel) {
        int counter = 0;

        ArrayList<Integer> buildingsAbleToSee = new ArrayList<Integer>();

        for (int i = 0; i < buildings.length; i++) {

            if (buildings[i] >= sunsetHeightLevel) {
                counter++;
                buildingsAbleToSee.add(buildings[i]);
            }
        }

        System.out.print(counter + " ---> " );
        for(int i = 0 ;i< buildingsAbleToSee.size() ; i++){
            System.out.print(buildingsAbleToSee.get(i));
            System.out.print(",");
        }
    }

    public static void main (String[]args){
        // Hello coder foundry, this is my solution to the sunset array challenge
        // My Name is Cem Karabacak, i'm from Turkey
        int[] array = {2, 1, 9, 5, 6, 11, 4};
        int sunsetLevel = 5;
        whichBuildingsAbleToSee(array,sunsetLevel);
    }

}
