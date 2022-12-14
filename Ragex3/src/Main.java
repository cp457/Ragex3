public class Main {
    public static void main(String[] args) {

        String s1= "are you able to climb, are you able to swim or are you able to fly?";

        System.out.println(s1.replaceAll(" are", "_XYZ"));

    }
}

/*
    You have a string with the following value: are you able to climb, are you able to swim or are you able to fly?
    with a regular expression, change into _XYZ every occurrence of are that has a space before
    print the result
*/