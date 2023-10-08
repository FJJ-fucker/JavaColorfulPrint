package Center;

public class Cout {
    public static void red(Object args){
        System.out.println("\033[31m"+args);
    }
    public static void green(Object args){
        System.out.println("\033[32m"+args);
    }
    public static void blue(Object args){
        System.out.println("\033[36m"+args);
    }
    public static void purple(Object args){
        System.out.println("\033[35m"+args);
    }
}
