package _11_Debuging;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Debug02 {
    public static void main(String[] args) {

        ebikGabik();



    }

    private static void ebikGabik() {
        List<Integer> sonuc= Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(i->i%2==0)  .map(i->i*3)

                .collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
