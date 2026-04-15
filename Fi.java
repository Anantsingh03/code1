
@FunctionalInterface
interface Sub {       //can't define more than 1 abstract method in functional abstract
    int subtract(int n1, int n2);
}


public class Fi {  //functional Interface
    public static void main(String args[]) {
        Sub s=  new Sub() {
            @Override
            public int subtract(int n1, int n2) {
                return n1-n2;
            }
        };
        int r = s.subtract(12, 2);
        System.out.println("Subtraction : "+r);
        Sub s1 = (int n1, int n2)-> n1-n2;         //Lambda Expression
        int r1 = s1.subtract(12,2);
        System.out.println("Subtraction : "+r1);

    }
}