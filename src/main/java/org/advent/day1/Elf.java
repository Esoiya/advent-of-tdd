package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    public void addCalories(int value) {
        totalCalories += value;
    }

    @Override
    public int compareTo(Elf elfo) {
        // TODO Auto-generated method stub
        return totalCalories - elfo.getTotalCalories();
    }

}
