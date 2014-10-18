package br.com.schumaker.hudson.sorting.text;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Hudson Schumaker
 */
public class SortText2 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Hudson Schumaker");
        nomes.add("Hugo Schumaker");
        nomes.add("Humberto Schumaker");
        nomes.add("Gabriel Schumaker");
        nomes.add("Saulo Schumaker");
        nomes.add("Hudson Luiz Sales Schumaker");
        nomes.add("Eliza Schumaker");
        nomes.add("Nikolas Schumaker");
        nomes.add("Hugo Oliveira");
        nomes.add("Marcos Schumaker");
        nomes.add("Hudson Luiz");
        nomes.add("Hudson Luiz Sales");
        nomes.add("Wilson Schumaker");
        nomes.add("Wilson Schumacher");
        nomes.add("Felipe Schumaker");
        nomes.add("Henrique Schumaker");
        nomes.add("Hudson Sales");

        String[] aNomes = new String[nomes.size()];
        for (int k = 0; k < nomes.size(); k++) {
            aNomes[k] = nomes.get(k);
        }

        Arrays.sort(aNomes);
        nomes.clear();
        nomes.addAll(Arrays.asList(aNomes));
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
