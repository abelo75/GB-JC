public class HW1 {
    public static void main(String[] args) {
        float randomNum = (float) Math.random();
        if (randomNum > 0.5) {
            System.out.println(new Cat1());
        } else {
            System.out.println(new Cat2());
        }
    }
}
