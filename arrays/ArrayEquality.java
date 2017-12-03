package arrays;

import java.util.Arrays;
import common.Person;

public class ArrayEquality {
  public static void equalityIntArray() {
    int[] x = new int[]{5, 4, 3, 2, 1};
    int[] y = new int[]{5, 4, 3, 2, 1};

    boolean test1 = x == y;
    boolean test2 = x.equals(y);
    boolean test3 = Arrays.equals(x, y);

    System.out.println("Two int[] with same values");
    System.out.println("Using == " + test1);
    System.out.println("Using .equals " + test2);
    System.out.println("Using Arrays.equals() " + test3);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void equalityObject() {
    Person[] x = new Person[4];
    Person[] y = new Person[4];

    for (int i = 0; i < x.length; i++) {
      x[i] = new Person("john", 25);
      y[i] = new Person("john", 25);
    }

    boolean test1 = x == y;
    boolean test2 = x.equals(y);
    boolean test3 = Arrays.equals(x, y);

    System.out.println("Two Person[] with same values");
    System.out.println("Using == " + test1);
    System.out.println("Using .equals " + test2);
    System.out.println("Using Arrays.equals() " + test3);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void equalityObject2() {
    Person[] x = new Person[4];
    Person[] y = new Person[4];

    for (int i = 0; i < x.length; i++) {
      x[i] = new Person("john", 25);
      y[i] = x[i];
    }

    boolean test1 = x == y;
    boolean test2 = x.equals(y);
    boolean test3 = Arrays.equals(x, y);

    System.out.println("Two Person[] with y[i] = x[i]");
    System.out.println("Using == " + test1);
    System.out.println("Using .equals " + test2);
    System.out.println("Using Arrays.equals() " + test3);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void equality2D() {
    int[][] x = new int[4][7];
    int[][] y = new int[4][7];
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[0].length; j++) {
        x[i][j] = 3;
        y[i][j] = 3;
      }
    }

    boolean test1 = Arrays.equals(x, y);
    boolean test2 = Arrays.deepEquals(x, y);

    System.out.println("Two int[][] with all values set equal to 3");
    System.out.println("Using Arrays.equals() " + test1);
    System.out.println("Using Arrays.deepEquals()" + test2);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void equality2D2() {
    int[][] x = new int[][]{{1}, {2, 3}};
    int[][] y = new int[][]{{1}, {2, 3}};

    boolean test1 = Arrays.equals(x, y);
    boolean test2 = Arrays.deepEquals(x, y);

    System.out.println("Two int[][] with initial setup equal {{1}, {2, 3}}");
    System.out.println("Using Arrays.equals() " + test1);
    System.out.println("Using Arrays.deepEquals()" + test2);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
  }

  public static void main(String[] args) {
    equalityIntArray();
    equalityObject();
    equalityObject2();
    equality2D();
    equality2D2();
  }

}
