import java.util.ArrayList;
import java.util.List;

/**
 * Created by TZ6YSQ on 10/3/2015.
 */
public class Main {
    static void sadCycle(long base, long num){
        long temp;
        List<Long> list  = new ArrayList();


        while(true){
            temp = 0;
            while(num > 0){
                temp += Math.pow(num % 10, base);
                num /= 10;
            }
            num = temp;
            if (list.contains(num)){

                while(list.get(0) != num){
                    list.remove(0);
                }
                System.out.println(list.toString());
                break;
            }
            else
            {
                list.add(num);
            }
        }
    }

    public static void main(String[] args){
        sadCycle(10,8);
    }
}
