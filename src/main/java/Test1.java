import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args){
        String[] vars = new String[]{"a", "b","c"};
        Stream<String> streams = Arrays.stream(vars);
        //streams.forEach(System.out::println);

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        for (String string : list) {
            if (string.contains("a")) {
                //return true;
                //System.out.println(string);
            }
        }

        //equivalent de l'expression plus haut avec les streams
        boolean isExist = list.stream().anyMatch(element -> {
            System.out.println(element);
            return element.contains("a");
        });

        Stream<String> filtered = list.stream().filter(element-> element.contains("d"));

    }


}
