public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Igor! Greetings from \"Gennady\".\n");
        System.out.println("Let's try another way");
        String myName = "Gennady";
        System.out.println("Hello Igor! Greetings from " + "\"" + myName + "\".\n");
        System.out.print("The characters that need to be escaped in java: ");
        System.out.println("\\ \"");
        System.out.print("The characters that don't need to be escaped: ");
        System.out.println("[] ! @ # $ % ^ & * ( ) _ + - = [ ] { } | / , . < > ~ `");
    }
}

