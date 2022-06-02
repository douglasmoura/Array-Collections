import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(7,8,9,5,9,8,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7,8,9,5,9,8,3));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(7,8,9,5,9,8,3));

        if(list.isEmpty() == true || list2.isEmpty() == true || list3.isEmpty() == true) {
            System.out.println("Array está vazio!");
        }
        else{
            Integer somaTotal=0;
            for (Integer soma : list) {
                somaTotal += soma;
            }
            Integer somaTotal2=0;
            for (Integer soma : list) {
                somaTotal2 += soma;
            }
            Integer somaTotal3=0;
            for (Integer soma : list) {
                somaTotal3 += soma;
            }
            Collections.sort(list);
            Collections.sort(list2);
            Collections.sort(list3);
            
            System.out.println("~~~~~~~ PRIMEIRO ARRAY ~~~~~~~");
            System.out.println("Soma total:"+ somaTotal);
            System.out.println("Maior nota lista:"+ Collections.max(list));
            System.out.println("Menor nota lista:"+ Collections.min(list));
            System.out.println("Média:" + somaTotal/list.size());
            System.out.println("Mediana:"+ list.get(3)+"\n");

            System.out.println("~~~~~~~ SEGUNDO ARRAY ~~~~~~~");
            System.out.println("Soma total:"+ somaTotal2);
            System.out.println("Maior nota lista:"+ Collections.max(list2));
            System.out.println("Menor nota lista:"+ Collections.min(list2));
            System.out.println("Média:" + somaTotal2/list2.size());
            System.out.println("Mediana:"+ list2.get(3)+"\n");

            System.out.println("~~~~~~~ TERCEIRO ARRAY ~~~~~~~");
            System.out.println("Soma total:"+ somaTotal3);
            System.out.println("Maior nota lista:"+ Collections.max(list3));
            System.out.println("Menor nota lista:"+ Collections.min(list3));
            System.out.println("Média:" + somaTotal3/list3.size());
            System.out.println("Mediana:"+ list3.get(3));

        }
    }


}
