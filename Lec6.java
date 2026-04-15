
interface Message {   //variables are public, static, final  and  methods are public, abstract
    void displayMsg();
    default void displayMsg(String msg) {   //java 8 features
        System.out.println(msg);
    }
}
class DisplayMessage implements Message { //
    @Override
    public void displayMsg() {
        System.out.println("This is main display method");
    }
    @Override
    public void displayMsg(String msg) {
        System.out.println("This is main display method "+msg);
    }
}

public class Lec6 {
    public static void main(String args[]) {   //java 8 features
        System.out.println("Hi...");
        DisplayMessage dm = new DisplayMessage();
        dm.displayMsg();
        dm.displayMsg("hi");
    }
}