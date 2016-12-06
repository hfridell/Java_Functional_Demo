package edu.umkc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
	  InputReader input = new InputReader();
    List<Movie> list;
    Stream<String[]> stream = input.getStream();
    System.out.println();
    // * Sample Input: Lethal Weapon 3|WB|273.0718|1992

    //Stream<String[]> over500 =
    list = stream
        .parallel()
        .map(line -> new Movie(line[0], line[1], line[2], line[3]))
        .collect(Collectors.toList());

    System.out.println("Movies that made over 500 million (Sorted)");
    list.parallelStream()
        .filter(movie -> movie.inflatedGrossEarnings > 500)
        .sorted((o1, o2) ->
            o1.inflatedGrossEarnings.compareTo(o2.inflatedGrossEarnings))
        .forEachOrdered(System.out::println);

    //System.out.println("Movies that made over 500 million");
    list.parallelStream()
        .
  }
}
