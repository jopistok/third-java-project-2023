import javax.management.BadBinaryOpValueExpException;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StringArr {
    public static String[] arr = new String[0];
    public static double average;
    public static String max;

    StringArr(){};
    private static String[] append(String[] arr, String element){
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
        return list.toArray(new String[0]);
    }
    public static void append(String element){
        arr = append(arr, element);
        sort();
        average = 0;
        for(int i = 0; i < arr.length; i++){
            average += arr[i].length();
        }
        average = average/ arr.length;
        max = arr[arr.length - 1];
    }
    public static void sort(){
        for(int i = 0; i < arr.length - 1; i++){
            int min_len = 100_000_000;
            int index = 0;
            for(int j = i; j < arr.length; j++){
                if (min_len > arr[j].length()){
                    min_len = arr[j].length();
                    index = j;
                }
            }
            if (arr[i].length() > min_len){
                String buf = arr[i];
                arr[i] = arr[index];
                arr[index] = buf;
            }
        }
    }
    public double get_average(){
        return this.average;
    }
    public String get_max(){
        return this.max;
    }
}
