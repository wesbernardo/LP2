import javax.lang.model.element.VariableElement;

public class Main {
    public static void main(String[] args) {
        
        /*var a = 10L;
        System.out.println(a++);*/

        /*var input = Integer.parseInt(args[0]);
        boolean isPar = input % 2 == 0;
        String output = isPar ? "Par" : "Impar";
        System.out.println(output);*/

        //System.out.println(5 | 2);

        int ip = 0b00010101;
        int mask = 0b00001111;

        int result = ip & mask;

        System.out.println(result); 
    }
}