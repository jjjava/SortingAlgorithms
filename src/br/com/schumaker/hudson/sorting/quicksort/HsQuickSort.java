package br.com.schumaker.hudson.sorting.quicksort;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 * @version 5.2.43
 * @since 09/06/2007
 */
public class HsQuickSort {

    public HsQuickSort() {
    }

    public void sort(int[] list) {
        if (list == null || list.length == 0) {
            return;
        }
        quickSort(list, 0, list.length - 1);
    }

    public void sort(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(int[] list, int left, int right) {
        int index = partition(list, left, right);
        if (left < index - 1) {
            quickSort(list, left, index - 1);
        }
        if (index < right) {
            quickSort(list, index, right);
        }
    }

    private void quickSort(List<Integer> list, int left, int right) {
        int index = partition(list, left, right);
        if (left < index - 1) {
            quickSort(list, left, index - 1);
        }
        if (index < right) {
            quickSort(list, index, right);
        }
    }

    private int partition(int[] list, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = list[(left + right) / 2];
        while (i <= j) {
            while (list[i] < pivot) {
                i++;
            }
            while (list[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = list[i];
                list[i] = list[j];
                list[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    private int partition(List<Integer> list, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = list.get((left + right) / 2);
        while (i <= j) {
            while (list.get(i) < pivot) {
                i++;
            }
            while (list.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
                i++;
                j--;
            }
        }
        return i;
    }
}
