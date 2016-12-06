package edu.umkc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Sample Input: Lethal Weapon 3|WB|273.0718|1992
 */
public class InputReader {
  private final static String defaultFile = "input.txt";
  private final static String splitRule = "\\|+";
  private String fileName;
  private List<String[]> list;
  InputReader() {
    this(defaultFile);
  }

  public InputReader(String fileName){
    this.fileName = fileName;
    readInput();
  }

  private void readInput() {
    try  {
      list = Files.lines(Paths.get(fileName))
              .map(line -> line.split(splitRule)) // Stream<String[]>
              .collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public List<String[]> getList() {
    return list;
  }

  public Stream<String[]> getStream() {
    return list.stream();
  }
}
 /*

  */