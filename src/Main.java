import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        StringArr arr = new StringArr();
        arr.append("test1");
        for(String i : arr.arr){
            System.out.println(i);
        }
        System.out.println("---");
        arr.append("test12");
        for(String i : arr.arr){
            System.out.println(i);
        }
        System.out.println("---");
        arr.append("test");
        for(String i : arr.arr){
            System.out.println(i);
        }
        System.out.println("---");
        System.out.println(arr.get_average());
        System.out.println(arr.get_max());
    }
}