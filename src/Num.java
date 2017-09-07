public class Num {
    public static void main(String[] args) {

        long i = 10000;
        long j = 99999;
        long t=System.currentTimeMillis();
        int palindr = 0;
        int counter = 0;
        for ( ; j > i; j=j-2){

            System.out.println(j);

        }

        System.out.println(counter);
        System.out.println(System.currentTimeMillis()-t);
    }
}
