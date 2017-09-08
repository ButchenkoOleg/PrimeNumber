
import java.util.ArrayList;
import java.util.List;

public class InteticsTask {

    public static void main(String[] args) {

        long t=System.currentTimeMillis();
        InteticsTask inteticsTask = new InteticsTask();

        inteticsTask.findPrimeNum();
        inteticsTask.multiPrimeNum();
        System.out.println("Max number palindrom " + inteticsTask.maxPal);
        System.out.println("First prime number " + inteticsTask.fPN);
        System.out.println("Second prime number " + inteticsTask.sPN);
        System.out.println("Work time " +(System.currentTimeMillis()-t) + "ms");
    }

    private long maxNum = 99999;
    private long minNum = 10000;
    private List <Long> arListPrNum = new ArrayList ( );
    private long divNumMax = 0;


    long maxPal = 0;
    long fPN = 0;
    long sPN = 0;




    public  void findPrimeNum () {  // поиск простых чисел
        long i;
        long j;
        long z;
        long primeNum;
        divNumMax = (long) Math.sqrt(maxNum);

        for (i = maxNum; i >= minNum; i = i - 2) { // отбрасываем четные числа

            for (j = 3; j <= divNumMax; j++) {

                z = i % j;

                if (z == 0 && j <= divNumMax) {
                    break;

                } else if (z != 0 && j == divNumMax) {

                    primeNum = i;

                    arListPrNum.add(primeNum);
                }
            }
        }
    }


    public void multiPrimeNum () { // перебор листа с простыми числами с их перемножением


        for (int i = 0; i < arListPrNum.size(); i++){

            for (int j = 1; j < arListPrNum.size(); j++){

                findPalindrome(arListPrNum.get(i) , arListPrNum.get(j));
            }

        }
    }


    private void findPalindrome(long firstPrime, long secondPrime) { //Поиск палиндром с одновремееной записью максимального его значения

        long resultOfMath = firstPrime * secondPrime;

        String ltrResult = Long.toString(resultOfMath);

        String rtlResult = new StringBuffer(ltrResult).reverse().toString();


        if (ltrResult.equals(rtlResult)) {

           if (resultOfMath > maxPal){

               maxPal = resultOfMath;
               fPN = firstPrime;
               sPN = secondPrime;

           }
        }
    }

}
