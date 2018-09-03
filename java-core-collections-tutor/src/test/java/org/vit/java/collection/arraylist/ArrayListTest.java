package org.vit.java.collection.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class ArrayListTest {


    @Test
    public void shouldCreateListWithDefaultConstructor() {
        List<String> actualList = new ArrayList<>();

        assertThat(true, is(actualList.isEmpty()));
    }

    @Test
    public void shouldCreateListWithSize20() {
        int LIST_SIZE = 20;
        List<String> actualList = new ArrayList<>(LIST_SIZE);

        assertThat(0, is(actualList.size()));
    }


    @Test
    public void shouldAddElementsToList() {
        List<String> actualList = new ArrayList<>();
        actualList.add("AAA");
        actualList.add("BBB");
        assertThat(2, is(actualList.size()));
        assertThat(Arrays.asList("AAA", "BBB"), is(actualList));
    }


}
