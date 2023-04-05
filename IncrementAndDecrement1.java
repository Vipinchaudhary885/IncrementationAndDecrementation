public class IncrementAndDecrement1 {
    public static void main(String[] args) {


        // In increment & decrement operator, pre or post mai same variable ke upar koi affect nhi aata but agar aap result kou kisi another mai assign ya define kroge tou difference aayega .

        int a = 5;
        // initially ek memory space allocate kr di jayegi zisme 5 kou stored kr diya
        // jayega.
        int b = a++;
        // yha post increment operator i.e. a++ kou b kou assign kr diya zayega or
        // initially a kou use kr liya jayega.
        // tou b yha se 5 hou jayega or jou a ki existing value hai usse 1 se increase
        // kr diya zayega.
        System.out.println(a); // 6
        System.out.println(b); // 5

        // ek variable at a time ek hee value stored kr skta hai agar new value mile tou
        // bou old value kou override ke dega.

        int x = 5;
        // initially x ki value kou increase kr diya jayega or baad mai x ki value kou
        // use kiya jayega b/c yha pre increment operator use hua hai .
        int y = ++x;
        System.out.println(x); // 6
        System.out.println(y); // 6

    }
}
