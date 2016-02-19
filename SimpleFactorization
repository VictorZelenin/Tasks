import java.util.*;

/**
 * Created by User on 08.01.2016.
 */
public class SimpleFactorization {
public static void main( String[] args )
{
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.print(returnNutural(num));
}

static String returnNutural(int num){
    List<Integer>res = new ArrayList<Integer>();

    int natuaralNum = 2;
    while(natuaralNum <= num){
        if(num % natuaralNum == 0){
            num = num / natuaralNum;
            res.add(natuaralNum);
        }else{
            natuaralNum++;
        }
    }

    return res.toString().replace("[", "").replace("]", "").replaceAll(",", "");
}
}
