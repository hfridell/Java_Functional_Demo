package edu.umkc;
/*
* Sample Input: Lethal Weapon 3|WB|273.0718|1992
 */
public class Movie {
  public String title;
  public String studio;
  public Double inflatedGrossEarnings;
  public Short releaseYear;

  Movie(){}

  Movie(String title, String studio, String earnings, String releaseYear) {
    this.title = title;
    this.studio = studio;
    this.inflatedGrossEarnings = Double.valueOf(earnings);
    this.releaseYear = Short.valueOf(releaseYear);
  }

  Movie(String input) {
    String[] split = input.split("|");
    title = split[0].trim();
    studio = split[1].trim();
    inflatedGrossEarnings = Double.valueOf(split[2].trim());
    releaseYear = Short.valueOf(split[3].trim());
  }

  public String toString() {
    return title + "|" + studio + "|" + inflatedGrossEarnings.toString() + "|" + releaseYear.toString();
  }
}
