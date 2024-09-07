public class Casting {
   public static void main(String[] args) {
    int a=257;
    byte k = (byte) a;
    System.out.println(k);//it returns 1 beacuse 257%256 = 1 
    float f = 5.6f;
    int s = (int) f;
    System.out.println(s);
    byte w = 10;
    byte t = 30;
    int result = w * t;
    System.out.println(result);
   } 
}
