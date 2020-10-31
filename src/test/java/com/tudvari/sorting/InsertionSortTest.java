package com.tudvari.sorting;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

  @Test
  public void unsorted_already_sorted() {
    int[] unsorted = {1,2,3};

    int[] actual = InsertionSort.sort(unsorted);

    Assert.assertArrayEquals(unsorted, actual);
  }

  @Test
  public void unsorted_one_iteration_required() {
    int[] unsorted = {2,1,3};
    int[] expected = {1,2,3};

    int[] actual = InsertionSort.sort(unsorted);

    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  public void unsorted_two_iteration_required() {
    int[] unsorted = {3,2,1};
    int[] expected = {1,2,3};

    int[] actual = InsertionSort.sort(unsorted);

    Assert.assertArrayEquals(expected, actual);
  }
}
