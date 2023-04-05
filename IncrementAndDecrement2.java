public class IncrementAndDecrement2 {
    public static void main(String[] args) {
        // Behind the scene kya hoga ki dou memory space allocate kr diye jayenge a & b
        // name ke.
        // agar aap result kou kisi or variable mai define krte hou tou difference aata
        // hai.
        // yha hmm a ke result kou b mai define kr rhe hai.
        int a = 5;
        // a ke value b ke accordance update hogi.
        // int b = a++ + ++a + --a;
        // phle right side kou take care kiya jayega kyuki ye ek assignment operator
        // hai( i.e., its assign the value from right to left )or uss result kou b mai
        // stored kiya jayega or inn operations kou hmm b ke upar perform kr rhe hai.
        // jayega.

       // int b = a++ + ++a + ++a + a++ + --a + a--;
       int b = a++ + --a - ++a + a-- + ++a;
        System.out.println(a);// 6
        System.out.println(b);// 16

    }
}
