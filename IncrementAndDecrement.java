public class IncrementAndDecrement {
    public static void main(String[] args) {
        int x;
        x = 5;

        // In increment & decrement operator, pre or post mai same variable ke upar koi
        // affect nhi aata but agar aap result kou kisi another mai assign ya define
        // kroge tou difference aayega but same variable ki bass value increase hoti hai
        // chahe bou x++ ya fir ++x dono cases mai variable ke value increase hogi.
        // incrementation
        ++x;
        // x = x + 1;
        // increase value by 1
        System.out.println(x); // 6

        // decrementation
       // x--;
        // x = x - 1;
        // decrease value by 1
       // System.out.println(x); // 5
    }
}
