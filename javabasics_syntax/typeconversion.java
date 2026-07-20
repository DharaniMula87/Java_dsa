//Type Conversion Practice
public class typeconversion {
    public static void main(String[] args) {

        int a = 10;
        double b = a;         
        double c = 20.5;
        int d = (int) c;      
        char ch = 'A';
        int e = ch;    
        int f = 66;
        char g = (char) f; 
        System.out.println("int to double : " + b);
        System.out.println("double to int : " + d);
        System.out.println("char to int   : " + e);
        System.out.println("int to char   : " + g);
    }
}