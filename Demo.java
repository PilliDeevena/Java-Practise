class Calculator {
   public void playmusic(){
    System.out.println("Music playing.....");
   }
   public String getMeAPen(int cost){
    if(cost >= 10)
        return "Pen";
    else
        return "nothing";
   }
}
public class Demo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.playmusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);

    }
} 
