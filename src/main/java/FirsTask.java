import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirsTask {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Kata", "Vika", "Juraj", "Aox");
        String result = IntStream.range(0, names.size()).filter(x -> x % 2 == 1).mapToObj(x -> "" + x + ". " + names.get(x)).collect(Collectors.joining(", "));
        System.out.println(result);
    }
}

class SecondTask {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Kata", "Vika", "Juraj", "Zox");
        List<String> result = names.stream().map(name -> name.toUpperCase()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);

    }
}

class Third {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};
        String result = Arrays.stream(numbers).flatMap(s -> Arrays.stream(s.split(", ")))
                .map(s -> Integer.parseInt(s)).sorted().map(x -> x.toString()).collect(Collectors.joining(", "));
        System.out.println(result);

    }
}
 class Four {
     public static void main(String[] args) {
         long a = 25214903917l ;
         long c = 11l;
         long m = (long) Math.pow(2, 48);
         long seed = 0;
         //x[n + 1] = 1 (a x[n] + c) % m
         Stream.iterate(seed, x -> (a * x + c )% m).limit(10).forEach(x -> System.out.println(x));
     }
 }

 class Five {
     public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
         Iterator<T> iteratorFirst = first.iterator();
         Iterator<T> iteratorSecond = second.iterator();
         Stream.Builder<T> result = Stream.builder();
         while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
             result.add(iteratorFirst.next()).add(iteratorSecond.next());
             
         }
         return result.build();
     }
 }