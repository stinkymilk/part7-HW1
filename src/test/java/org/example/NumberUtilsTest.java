package org.example;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class NumberUtilsTest {

    @Test
    @Tag("Specification ")
    void whenLeftOrRightIsNull() {
        LinkedList<Integer> l = new LinkedList<>();
        assertThat(NumberUtils.add(null, null)).isNull();// both are null
        assertThat(NumberUtils.add(null, l)).isNull(); // left is null right is an empty linked list
        assertThat(NumberUtils.add(l,null)).isNull(); // left is an empty linked list right is null
    }

    @Test
    @Tag("Specification")
    void addingTwoThreeDigitNumbers(){
        LinkedList<Integer> l = new LinkedList<>(List.of(1,2,3));
        LinkedList<Integer> r = new LinkedList<>(List.of(4,5,6));

        assertThat(NumberUtils.add(l,r)).isEqualTo(List.of(5,7,9));
    }
    @Test
    @Tag("Structural")
    void differentLengthLists(){
        LinkedList<Integer> l = new LinkedList<>(List.of(1,2,3));
        LinkedList<Integer> r = new LinkedList<>(List.of(4));

        assertThat(NumberUtils.add(l,r)).isEqualTo(List.of(1,2,7));
    }
    @Test
    @Tag("Structural")
    void carryTests(){
        LinkedList<Integer> l = new LinkedList<>(List.of(9,9));
        LinkedList<Integer> r = new LinkedList<>(List.of(1));

        assertThat(NumberUtils.add(l,r)).isEqualTo(List.of(1,0,0));
    }
    @Test
    @Tag("Structural")
    void leadingZeros(){
        LinkedList<Integer> l = new LinkedList<>(List.of(0,0));
        LinkedList<Integer> r = new LinkedList<>(List.of(0,0));

        assertThat(NumberUtils.add(l,r)).isEqualTo(List.of(0));
    }
}