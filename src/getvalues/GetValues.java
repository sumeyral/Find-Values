package getvalues;
/* @author sumeyral

 */

import java.util.Scanner;

public class GetValues {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        NumberUtil.getValues(NumberUtil.valCheck(val));
    }
}

class NumberUtil {
    private static final Scanner ms_kb;

    static { ms_kb = new Scanner(System.in);}

    public static int valCheck(int val)
    {
        for(;;){
            if(val<0 || val>100) {
                System.out.print("Geçersiz değer!Yeni bir değer giriniz:");
                val = Integer.parseInt(ms_kb.nextLine());}
             else
                break;
        }

        return val;
    }
    public static void getValues(int val)
    {
        int max = val, min = val, sum = val, count = 1;
        double avg = 0;
        boolean flag = true;

        while(flag) {
            System.out.println("Yeni bir değer girmek istiyor musunuz? [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]");
            if(Integer.parseInt(ms_kb.nextLine())== 0)
                flag = false;
            else {
                System.out.print("Bir tamsayı giriniz:");
                val = valCheck(Integer.parseInt(ms_kb.nextLine()));

                if(val>max)
                    max= val;
                if(val<min)
                    min =val;
                sum+=val;
                ++count;
            }

        }
        avg = (double)sum/count;
        System.out.printf("Toplam %d değer girildi.%nMax = %d%nMin = %d%nOrtalama=%.2f%n",count,max,min,avg);
        return;
    }
}