package org.example;

public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;

        while (bottlesNum > 0) {
            String word = "bottles"; // Reset word to "bottles" each loop
            if (bottlesNum == 1) {
                word = "bottle"; // Singular, as in ONE bottle
            }
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                        " green " + (bottlesNum == 1 ? "bottle" : "bottles") + ", hanging on the wall\n");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}
