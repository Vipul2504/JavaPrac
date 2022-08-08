public class RevNum {
    static int sum = 0;
    static void revl(int n){
        if(n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        revl(n/10);

    }

    public static void main(String[] args) {
        revl(4321);
        System.out.println(sum);
    }
}
