/**
 * Created by Student on 12/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        String bob = "hello";
        String dan = "goodbye";
        test("danube river");
        int i = 0;
        for (int x = 0; x <= 10; x++) {
            System.out.println(x);
            test("danube river");
        }
        while (i < 10) {
            System.out.println(i);
            i+=1;
        }
    }
    public static int test(String name) {
        if (name == "hello") {
            System.out.println("Your name is Bob.");
            return 3;
        }
        else if (name == "goodbye") {
            System.out.println("Goodbye, Dan!");
        }
        else {
            System.out.println("I do not know you.");
        }
        return 0;
    }
}
