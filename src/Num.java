public class Num {
    public static void main(String[] args) {

        long i = 10000;
        long j = 99999;
        long t=System.currentTimeMillis();
        int palindr = 0;
        int counter = 0;
        for ( ; j > i; j=j-2){
            if (j%3 != 0){
                if (j%5 != 0){
                    if (j%7 != 0){
                        if (j%11 != 0 )
                            for (int k = 13; k <= j; k=k+2){
                            if (j%k != 0){
                                counter++;
                                System.out.println(j);
                                break;
                            }
                            }

                    }
                }

            }

        }

        System.out.println(counter);
        System.out.println(System.currentTimeMillis()-t);
    }
}
