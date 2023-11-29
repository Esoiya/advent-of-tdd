package org.advent.day1;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TestElfShould {
    @Test
    void have_zero_total_calories_when_created() {
        Elf elf = new Elf();
        assertThat(elf.getTotalCalories(), equalTo(0));
    }

    @Test
    void have_1000_total_calories_after_adding_1000() {
        Elf elf = new Elf();
        elf.addCalories(1000);
        assertThat(elf.getTotalCalories(), equalTo(1000));
    }

    @Test
    void compare_return_positive_value_for_elf_with_more_total_calories() {
        Elf elfo = new Elf();
        elfo.addCalories(100);
        Elf aegnor = new Elf();
        aegnor.addCalories(50);

        assertThat(elfo.compareTo(aegnor), equalTo(50));
    }

    @Test
    void compare_zero_for_equal_elf() {
        Elf elfo = new Elf();
        elfo.addCalories(50);
        Elf aegnor = new Elf();
        aegnor.addCalories(50);

        assertThat(elfo.compareTo(aegnor), equalTo(0));
    }

    @Test
    void compare_return_negative_value_for_elf_with_less_total_calories() {
        Elf elfo = new Elf();
        elfo.addCalories(50);
        Elf aegnor = new Elf();
        aegnor.addCalories(100);

        assertThat(elfo.compareTo(aegnor), equalTo(-50));
    }
}
