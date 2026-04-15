
class Message {
    void getMessage() {
        System.out.println("This is called by var!");
    }
}


public class MainVar {
    public static void main(String[] args) {
        // var m = new Message();
        // m.getMessage();
        // var r = "java 10";
        // var n1 = 10.50;        //local variable type inference
        // var n2 = 28;
    
        // var s = n1+n2;
        // System.out.println("Sum : "+s);


        String msg = "This is line1\nThis is line2\n"+"This is line3\nThis is line4";
        System.out.println(msg);

        String msg2 = """
                This is line 1
                This is line 2
                This is line 3
                """;
        System.out.println(msg2);
        System.out.println(msg2.length());

        String msg3 = """
                line1
                  line2
                line3
                """;
        System.out.println(msg3);
        System.out.println(msg3.length());

    }
}
